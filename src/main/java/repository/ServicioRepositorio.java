
package repository;

import java.util.List;
import model.Servicio;

public interface ServicioRepositorio {
    public void guardarServicio(Servicio servicio);
    Servicio buscarPorId(int id);
    public void modificarServicio(int id, Servicio servicio);
    public void eliminarServicio(int id);
    //List<Servicio> listarServicios();
}
