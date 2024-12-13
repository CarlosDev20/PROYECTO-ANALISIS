package repository;

import db.CConexion;
import model.Usuario;
import java.sql.*;

public class UsuarioRepositorioMySql implements UsuarioRepositorio {

    @Override
    public Usuario buscarPorCorreo(String correo) {
        String query = "SELECT * FROM usuarios WHERE correo = ?";
        try (Connection con = CConexion.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, correo);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Usuario(
                            rs.getInt("id"),
                            rs.getString("correo"),
                            rs.getString("contrasena"),
                            rs.getString("rol")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void actualizarContrasena(String correo, String nuevaContrasena) {
        String query = "UPDATE usuarios SET contrasena=? WHERE correo=?";
        try (Connection con = CConexion.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, nuevaContrasena);
            ps.setString(2, correo);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean validarCredenciales(String correo, String contrasena, String rol) {
        String query = "SELECT * FROM usuarios WHERE correo = ? AND contrasena = ? AND rol = ?";
        try (Connection con = CConexion.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, correo);
            ps.setString(2, contrasena);
            ps.setString(3, rol);

            try (ResultSet rs = ps.executeQuery()) {
                return rs.next(); // Si hay resultados, las credenciales son válidas.
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
