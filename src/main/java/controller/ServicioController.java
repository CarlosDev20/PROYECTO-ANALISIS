package controller;

import model.Servicio;
import service.ServicioService;
import java.util.List;

public class ServicioController {

    private ServicioService servicioService;

    public ServicioController(ServicioService servicioService) {
        this.servicioService = servicioService;
    }

    public void registrarServicio(Servicio servicio) {
        servicioService.registrarServicio(servicio);
        //System.out.println("Servicio registrado exitosamente.");
    }

    public Servicio buscarServicio(int id) {
        return servicioService.buscarServicio(id);
    }

    public void modificarServicio(int id, Servicio servicio) {
        servicioService.modificarServicio(id, servicio);
        //System.out.println("Servicio modificado exitosamente.");
    }

    public void eliminarServicio(int id) {
        servicioService.eliminarServicio(id);
        //System.out.println("Servicio eliminado exitosamente.");
    }

//    public List<Servicio> listarServicios() {
//        return servicioService.listarServicios();
//    }
}
