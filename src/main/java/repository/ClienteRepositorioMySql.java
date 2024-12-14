package repository;

import db.CConexion;
import java.sql.*;
import model.Cliente;

public class ClienteRepositorioMySql implements ClienteRepositorio {

    @Override
    public void guardarCliente(Cliente cliente) {
        String query = "INSERT INTO clientes (dni, nombre, apellido, correo, telefono, contrasena) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection connection = CConexion.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, cliente.getDni());
            statement.setString(2, cliente.getNombre());
            statement.setString(3, cliente.getApellido());
            statement.setString(4, cliente.getCorreo());
            statement.setString(5, cliente.getTelefono());
            statement.setString(6, cliente.getContrasena());

            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error al guardar el cliente: " + e.getMessage(), e);
        }
    }

    @Override
    public Cliente buscarPorDni(String dni) {
        String query = "SELECT * FROM clientes WHERE dni = ?";
        Cliente cliente = null;

        try (Connection connection = CConexion.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, dni);

            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    cliente = new Cliente(
                            rs.getInt("id"),
                            rs.getString("dni"),
                            rs.getString("nombre"),
                            rs.getString("apellido"),
                            rs.getString("correo"),
                            rs.getString("telefono"),
                            rs.getString("contrasena")
                    );
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al buscar cliente por DNI: " + e.getMessage(), e);
        }
        return cliente;
    }

    @Override
    public void modificarCliente(String dni, Cliente cliente) {
        String query = "UPDATE clientes SET nombre = ?, apellido = ?, correo = ?, telefono = ?, contrasena = ? WHERE dni = ?";
        try (Connection connection = CConexion.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, cliente.getNombre());
            statement.setString(2, cliente.getApellido());
            statement.setString(3, cliente.getCorreo());
            statement.setString(4, cliente.getTelefono());
            statement.setString(5, cliente.getContrasena());
            statement.setString(6, dni);

            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error al modificar cliente por DNI: " + e.getMessage(), e);
        }
    }

    @Override
    public void eliminarCliente(String dni) {
        String query = "DELETE FROM clientes WHERE dni = ?";
        try (Connection connection = CConexion.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, dni);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error al eliminar cliente por DNI: " + e.getMessage(), e);
        }
    }
}
