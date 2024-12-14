package repository;

import db.CConexion;
import java.sql.*;
import model.Pago;
import model.Servicio;

public class PagoRepositorioMySql implements PagoRepositorio {

    @Override
    public void guardarPago(Pago pago) {
        String query = "INSERT INTO pagos (monto, fechaPago, metodoPago, servicioId) VALUES (?, ?, ?, ?)";
        try (Connection con = CConexion.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setDouble(1, pago.getMonto());
//            ps.setDate(2, new java.sql.Date(pago.getFechaPago().getTime()));
            ps.setString(3, pago.getMetodoPago());
            ps.setInt(4, pago.getServicio().getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Pago buscarPagoPorId(int id) {
        String query = "SELECT * FROM pagos WHERE id = ?";
        try (Connection con = CConexion.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
//                    Servicio servicio = new Servicio(); // Recuperar servicio relacionado
//                    servicio.setId(rs.getInt("servicioId"));
//                    return new Pago(
//                            rs.getInt("id"),
//                            rs.getDouble("monto"),
//                            rs.getDate("fechaPago"),
//                            rs.getString("metodoPago"),
//                            servicio
//                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void eliminarPago(int id) {
        String query = "DELETE FROM pagos WHERE id = ?";
        try (Connection con = CConexion.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
