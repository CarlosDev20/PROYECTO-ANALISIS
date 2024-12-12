package controller;

import db.CConexion;
import java.sql.*;
import model.Cliente;

public class ClienteController {

    // Constructor
    public ClienteController() {
        // Aquí podrías inicializar algo si es necesario (como una conexión directa)
    }

    public void registrarCliente(Cliente cliente) {
        String query = "INSERT INTO clientes (dni, nombre, apellido, correo, telefono, contrasena) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection connection = CConexion.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {

            // Establecer los valores de los parámetros
            statement.setString(1, cliente.getDni());
            statement.setString(2, cliente.getNombre());
            statement.setString(3, cliente.getApellido());
            statement.setString(4, cliente.getCorreo());
            statement.setString(5, cliente.getTelefono());
            statement.setString(6, cliente.getContrasena());

            // Ejecutar la inserción
            statement.executeUpdate();
            System.out.println("Cliente registrado exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para buscar un cliente por id
    public Cliente buscarCliente(int id) {
        String query = "SELECT * FROM clientes WHERE id = ?";
        Cliente cliente = null;
        try (Connection connection = CConexion.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    // Crear el objeto cliente a partir de la base de datos
                    cliente = new Cliente(
                            resultSet.getInt("id"),
                            resultSet.getString("dni"),
                            resultSet.getString("nombre"),
                            resultSet.getString("apellido"),
                            resultSet.getString("correo"),
                            resultSet.getString("telefono"),
                            resultSet.getString("contrasena")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cliente; // Retorna el cliente encontrado o null si no lo encuentra
    }

    // Método para modificar un cliente
    public void modificarCliente(int id, Cliente cliente) {
        String query = "UPDATE clientes SET dni = ?, nombre = ?, apellido = ?, correo = ?, telefono = ?, contrasena = ? WHERE id = ?";
        try (Connection connection = CConexion.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {

            // Establecer los valores de los parámetros
            statement.setString(1, cliente.getDni());
            statement.setString(2, cliente.getNombre());
            statement.setString(3, cliente.getApellido());
            statement.setString(4, cliente.getCorreo());
            statement.setString(5, cliente.getTelefono());
            statement.setString(6, cliente.getContrasena());
            statement.setInt(7, id);

            // Ejecutar la actualización
            int filasAfectadas = statement.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Cliente actualizado exitosamente.");
            } else {
                System.out.println("No se encontró un cliente con el id proporcionado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para eliminar un cliente
    public void eliminarCliente(int id) {
        String query = "DELETE FROM clientes WHERE id = ?";
        try (Connection connection = CConexion.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {

            // Establecer el id del cliente a eliminar
            statement.setInt(1, id);

            // Ejecutar la eliminación
            int filasAfectadas = statement.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Cliente eliminado exitosamente.");
            } else {
                System.out.println("No se encontró un cliente con el id proporcionado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
