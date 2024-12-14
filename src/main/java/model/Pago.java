package model;

public class Pago {

    private int id;
    private double monto;
    private String metodoPago;
    private Servicio servicio;

    public Pago(int id, double monto, String metodoPago, Servicio servicio) {
        this.id = id;
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.servicio = servicio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

}
