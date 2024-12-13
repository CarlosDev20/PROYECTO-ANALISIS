package service;

import model.Servicio;
import repository.ServicioRepositorio;
import java.util.List;

public class ServicioService {

    private ServicioRepositorio servicioRepositorio;

    public ServicioService(ServicioRepositorio servicioRepositorio) {
        this.servicioRepositorio = servicioRepositorio;
    }

    public void registrarServicio(Servicio servicio) {
        // Validaciones de negocio si las hay
        servicioRepositorio.guardarServicio(servicio);
    }

    public Servicio buscarServicio(int id) {
        return servicioRepositorio.buscarPorId(id);
    }

    public void modificarServicio(int id, Servicio servicio) {
        servicioRepositorio.modificarServicio(id, servicio);
    }

    public void eliminarServicio(int id) {
        servicioRepositorio.eliminarServicio(id);
    }

//    public List<Servicio> listarServicios() {
//        return servicioRepositorio.listarServicios();
//    }
}
