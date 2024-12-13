package controller;

import db.CConexion;
import java.sql.*;
import model.Cliente;
import service.ClienteService;

public class ClienteController {

    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    public void registrarCliente(Cliente cliente) {
        clienteService.registrarCliente(cliente);
        //System.out.println("Cliente registrado exitosamente.");
    }

    public Cliente buscarCliente(int id) {
        return clienteService.buscarCliente(id);
    }

    public void modificarCliente(int id, Cliente cliente) {
        clienteService.modificarCliente(id, cliente);
        //System.out.println("Cliente actualizado exitosamente.");
    }

    public void eliminarCliente(int id) {
        clienteService.eliminarCliente(id);
        //System.out.println("Cliente eliminado exitosamente.");
    }
}
