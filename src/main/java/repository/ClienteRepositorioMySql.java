package repository;

import db.CConexion;
import java.awt.List;
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
            e.printStackTrace();
        }
    }

    @Override
    public Cliente buscarPorId(int id) {
        String query = "SELECT * FROM clientes WHERE id = ?";
        Cliente cliente = null;
        try (Connection connection = CConexion.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(1, id);

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
            e.printStackTrace();
        }
        return cliente;
    }

    @Override
    public void modificarCliente(int id, Cliente cliente) {
        String query = "UPDATE clientes SET dni = ?, nombre = ?, apellido = ?, correo = ?, telefono = ?, contrasena = ? WHERE id = ?";
        try (Connection connection = CConexion.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, cliente.getDni());
            statement.setString(2, cliente.getNombre());
            statement.setString(3, cliente.getApellido());
            statement.setString(4, cliente.getCorreo());
            statement.setString(5, cliente.getTelefono());
            statement.setString(6, cliente.getContrasena());
            statement.setInt(7, id);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminarCliente(int id) {
        String query = "DELETE FROM clientes WHERE id = ?";
        try (Connection connection = CConexion.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    @Override
//    public List<Cliente> listarClientes() {
//        List<Cliente> lista = new ArrayList<>();
//        String query = "SELECT * FROM clientes";
//        try (Connection connection = CConexion.getConnection(); PreparedStatement statement = connection.prepareStatement(query); ResultSet rs = statement.executeQuery()) {
//
//            while (rs.next()) {
//                Cliente cliente = new Cliente(
//                        rs.getInt("id"),
//                        rs.getString("dni"),
//                        rs.getString("nombre"),
//                        rs.getString("apellido"),
//                        rs.getString("correo"),
//                        rs.getString("telefono"),
//                        rs.getString("contrasena")
//                );
//                lista.add(cliente);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return lista;
//    }

}
