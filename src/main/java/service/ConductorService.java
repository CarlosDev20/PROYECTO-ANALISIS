package service;

import model.Conductor;
import repository.ConductorRepositorio;

public class ConductorService {

    private ConductorRepositorio conductorRepositorio;

    public ConductorService(ConductorRepositorio conductorRepositorio) {
        this.conductorRepositorio = conductorRepositorio;
    }

    public void registrarConductor(Conductor conductor) {
        // Agregar validaciones lógicas si es necesario
        conductorRepositorio.guardarConductor(conductor);
    }

    public Conductor buscarConductor(int id) {
        return conductorRepositorio.buscarPorId(id);
    }

    public void modificarConductor(int id, Conductor conductor) {
        conductorRepositorio.modificarConductor(id, conductor);
    }

    public void eliminarConductor(int id) {
        conductorRepositorio.eliminarConductor(id);
    }

//    public List<Conductor> listarConductores() {
//        return conductorRepositorio.listarConductores();
//    }
}
