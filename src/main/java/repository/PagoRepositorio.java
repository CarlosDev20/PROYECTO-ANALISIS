
package repository;
import model.Pago;

public interface PagoRepositorio {
    public void guardarPago(Pago pago);
    Pago buscarPagoPorId(int id);
    public void eliminarPago(int id);
}
