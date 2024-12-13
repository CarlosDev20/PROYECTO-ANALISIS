package controller;

import model.Conductor;
import service.ConductorService;

public class ConductorController {

    private ConductorService conductorService;

    public ConductorController(ConductorService conductorService) {
        this.conductorService = conductorService;
    }

    public void registrarConductor(Conductor conductor) {
        conductorService.registrarConductor(conductor);
        //System.out.println("Conductor registrado exitosamente.");
    }

    public Conductor buscarConductor(int id) {
        return conductorService.buscarConductor(id);
    }

    public void modificarConductor(int id, Conductor conductor) {
        conductorService.modificarConductor(id, conductor);
        //System.out.println("Conductor modificado exitosamente.");
    }

    public void eliminarConductor(int id) {
        conductorService.eliminarConductor(id);
        //System.out.println("Conductor eliminado exitosamente.");
    }
}
