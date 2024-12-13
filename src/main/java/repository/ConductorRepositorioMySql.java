package repository;

import db.CConexion;
import java.sql.*;
import model.Conductor;

public class ConductorRepositorioMySql implements ConductorRepositorio {

    @Override
    public void guardarConductor(Conductor conductor) {
        String query = "INSERT INTO conductores (dni, nombre, apellido, correo, telefono, contrasena, licencia) VALUES (?,?,?,?,?,?,?)";
        try (Connection con = CConexion.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, conductor.getDni());
            ps.setString(2, conductor.getNombre());
            ps.setString(3, conductor.getApellido());
            ps.setString(4, conductor.getCorreo());
            ps.setString(5, conductor.getTelefono());
            ps.setString(6, conductor.getContrasena());
            ps.setString(7, conductor.getLicencia());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Conductor buscarPorId(int id) {
        Conductor conductor = null;
        String query = "SELECT * FROM conductores WHERE id = ?";
        try (Connection con = CConexion.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    conductor = new Conductor(
                            rs.getInt("id"),
                            rs.getString("dni"),
                            rs.getString("nombre"),
                            rs.getString("apellido"),
                            rs.getString("correo"),
                            rs.getString("telefono"),
                            rs.getString("contrasena"),
                            rs.getString("licencia")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conductor;
    }

    @Override
    public void modificarConductor(int id, Conductor conductor) {
        String query = "UPDATE conductores SET dni=?, nombre=?, apellido=?, correo=?, telefono=?, contrasena=?, licencia=? WHERE id=?";
        try (Connection con = CConexion.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, conductor.getDni());
            ps.setString(2, conductor.getNombre());
            ps.setString(3, conductor.getApellido());
            ps.setString(4, conductor.getCorreo());
            ps.setString(5, conductor.getTelefono());
            ps.setString(6, conductor.getContrasena());
            ps.setString(7, conductor.getLicencia());
            ps.setInt(8, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminarConductor(int id) {
        String query = "DELETE FROM conductores WHERE id=?";
        try (Connection con = CConexion.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    @Override
//    public List<Conductor> listarConductores() {
//        List<Conductor> lista = new ArrayList<>();
//        String query = "SELECT * FROM conductores";
//        try (Connection con = CConexion.getConnection(); PreparedStatement ps = con.prepareStatement(query); ResultSet rs = ps.executeQuery()) {
//            while (rs.next()) {
//                Conductor c = new Conductor(
//                        rs.getInt("id"),
//                        rs.getString("dni"),
//                        rs.getString("nombre"),
//                        rs.getString("apellido"),
//                        rs.getString("correo"),
//                        rs.getString("telefono"),
//                        rs.getString("contrasena"),
//                        rs.getString("licencia")
//                );
//                lista.add(c);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return lista;
//    }
}
