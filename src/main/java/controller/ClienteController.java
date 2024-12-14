package controller;

import model.Cliente;
import service.ClienteService;

public class ClienteController {

    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    public void registrarCliente(Cliente cliente) {
        clienteService.registrarCliente(cliente);
    }

    public Cliente buscarClientePorDni(String dni) {
        return clienteService.buscarClientePorDni(dni);
    }

    public void modificarCliente(String dni, Cliente cliente) {
        clienteService.modificarCliente(dni, cliente);
    }

    public void eliminarCliente(String dni) {
        clienteService.eliminarCliente(dni);
    }
}
