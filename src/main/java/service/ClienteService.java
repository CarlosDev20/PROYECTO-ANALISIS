package service;

import model.Cliente;
import repository.ClienteRepositorio;

public class ClienteService {

    private ClienteRepositorio clienteRepositorio;

    public ClienteService(ClienteRepositorio clienteRepositorio) {
        this.clienteRepositorio = clienteRepositorio;
    }

    public void registrarCliente(Cliente cliente) {
        if (clienteRepositorio.buscarPorDni(cliente.getDni()) != null) {
            throw new IllegalArgumentException("El cliente con DNI " + cliente.getDni() + " ya existe.");
        }
        clienteRepositorio.guardarCliente(cliente);
    }


    public Cliente buscarClientePorDni(String dni) {
        Cliente cliente = clienteRepositorio.buscarPorDni(dni);
        if (cliente == null) {
            throw new IllegalArgumentException("No se encontró un cliente con el DNI especificado.");
        }
        return cliente;
    }

    public void modificarCliente(String dni, Cliente cliente) {
        Cliente clienteExistente = clienteRepositorio.buscarPorDni(dni);
        if (clienteExistente == null) {
            throw new IllegalArgumentException("No se puede modificar. Cliente con DNI " + dni + " no encontrado.");
        }
        clienteRepositorio.modificarCliente(dni, cliente);
    }

    public void eliminarCliente(String dni) {
        Cliente clienteExistente = clienteRepositorio.buscarPorDni(dni);
        if (clienteExistente == null) {
            throw new IllegalArgumentException("No se puede eliminar. Cliente con DNI" + dni + " no encontrado.");
        }
        clienteRepositorio.eliminarCliente(dni);
    }
}
