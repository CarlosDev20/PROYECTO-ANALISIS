
package repository;
import java.awt.List;
import model.Cliente;

public interface ClienteRepositorio {
    public void guardarCliente(Cliente cliente);
    Cliente buscarPorId(int id);
    public void modificarCliente(int id, Cliente cliente);
    public void eliminarCliente(int id);
    //List<Cliente> listarClientes(); // Opcional, si necesitas listar
}
