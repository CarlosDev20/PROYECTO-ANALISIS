
package service;

import model.Pago;
import repository.PagoRepositorio;

public class PagoService {
    private final PagoRepositorio repositorio;
    
    public PagoService(PagoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void registrarPago(Pago pago) {
        repositorio.guardarPago(pago);
    }

    public Pago buscarPagoPorId(int id) {
        return repositorio.buscarPagoPorId(id);
    }

    public void eliminarPago(int id) {
        repositorio.eliminarPago(id);
    }
}
