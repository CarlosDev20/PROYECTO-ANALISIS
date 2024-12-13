
package repository;
import model.Conductor;

public interface ConductorRepositorio {
    public void guardarConductor(Conductor conductor);
    Conductor buscarPorId(int id);
    public void modificarConductor(int id, Conductor conductor);
    public void eliminarConductor(int id);
    //List<Conductor> listarConductores();
}
