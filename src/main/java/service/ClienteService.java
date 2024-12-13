package service;

import model.Cliente;
import repository.ClienteRepositorio;

public class ClienteService {

    private ClienteRepositorio clienteRepositorio;

    public ClienteService(ClienteRepositorio clienteRepositorio) {
        this.clienteRepositorio = clienteRepositorio;
    }

    public void registrarCliente(Cliente cliente) {
        // Aquí podrías agregar validaciones de negocio, por ejemplo:
        // - Verificar si el DNI es válido
        // - Verificar si el correo no existe ya en la base de datos, etc.
        clienteRepositorio.guardarCliente(cliente);
    }

    public Cliente buscarCliente(int id) {
        return clienteRepositorio.buscarPorId(id);
    }

    public void modificarCliente(int id, Cliente cliente) {
        // Lógica adicional si fuera necesario
        clienteRepositorio.modificarCliente(id, cliente);
    }

    public void eliminarCliente(int id) {
        clienteRepositorio.eliminarCliente(id);
    }
}
