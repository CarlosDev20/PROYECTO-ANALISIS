
package repository;

import db.CConexion;
import model.Cliente;
import model.Servicio;
import model.Vehiculo;

import java.sql.*;

public class ServicioRepositorioMySql implements ServicioRepositorio{

    @Override
    public void guardarServicio(Servicio servicio) {
        String query = "INSERT INTO servicios (cliente_id, vehiculo_id, mecanico, fecha_inicio, fecha_fin) VALUES (?,?,?,?,?)";
        try (Connection con = CConexion.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, servicio.getCliente().getId());
            ps.setInt(2, servicio.getVehiculo().getId());
            ps.setString(3, servicio.getMecanico());
            ps.setDate(4, new java.sql.Date(servicio.getFechaInicio().getTime()));
            ps.setDate(5, new java.sql.Date(servicio.getFechaFin().getTime()));
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Servicio buscarPorId(int id) {
        Servicio servicio = null;
        String query = "SELECT * FROM servicios WHERE id = ?";
        try (Connection con = CConexion.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    // Aquí deberías también buscar el cliente y el vehículo asociados
                    // Esto es un ejemplo simplificado asumiendo que ya tienes cliente y vehiculo cargados
                    Cliente c = new Cliente(rs.getInt("cliente_id"), "dniX", "nombreX", "apellidoX", "correoX", "telefonoX", "contrasenaX");
                    Vehiculo v = new Vehiculo(rs.getInt("vehiculo_id"), "ABC123", "ModeloX", 1000, true);

                    servicio = new Servicio(
                            rs.getInt("id"),
                            c,
                            v,
                            rs.getString("mecanico"),
                            rs.getDate("fecha_inicio"),
                            rs.getDate("fecha_fin")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return servicio;
    }

    @Override
    public void modificarServicio(int id, Servicio servicio) {
        String query = "UPDATE servicios SET cliente_id=?, vehiculo_id=?, mecanico=?, fecha_inicio=?, fecha_fin=? WHERE id=?";
        try (Connection con = CConexion.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, servicio.getCliente().getId());
            ps.setInt(2, servicio.getVehiculo().getId());
            ps.setString(3, servicio.getMecanico());
            ps.setDate(4, new java.sql.Date(servicio.getFechaInicio().getTime()));
            ps.setDate(5, new java.sql.Date(servicio.getFechaFin().getTime()));
            ps.setInt(6, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminarServicio(int id) {
        String query = "DELETE FROM servicios WHERE id=?";
        try (Connection con = CConexion.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    @Override
//    public List<Servicio> listarServicios() {
//        List<Servicio> lista = new ArrayList<>();
//        String query = "SELECT * FROM servicios";
//        try (Connection con = CConexion.getConnection(); PreparedStatement ps = con.prepareStatement(query); ResultSet rs = ps.executeQuery()) {
//            while (rs.next()) {
//                // Similarmente, aquí deberías obtener Cliente y Vehiculo
//                Cliente c = new Cliente(rs.getInt("cliente_id"), "dniX", "nombreX", "apellidoX", "correoX", "telefonoX", "contrasenaX");
//                Vehiculo v = new Vehiculo(rs.getInt("vehiculo_id"), "ABC123", "ModeloX", 1000, true);
//
//                Servicio s = new Servicio(
//                        rs.getInt("id"),
//                        c,
//                        v,
//                        rs.getString("mecanico"),
//                        rs.getDate("fecha_inicio"),
//                        rs.getDate("fecha_fin")
//                );
//                lista.add(s);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return lista;
//    }
}
