package repository;

import model.Cliente;

public interface ClienteRepositorio {

    public void guardarCliente(Cliente cliente);
    Cliente buscarPorDni(String dni);
    public void modificarCliente(String dni, Cliente cliente);
    public void eliminarCliente(String dni);
}
