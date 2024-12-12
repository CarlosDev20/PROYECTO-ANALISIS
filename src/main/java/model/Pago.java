package model;

public class Pago {

    private int id;
    private double monto;
    private String metodo;
    private boolean confirmado;

    // Constructor
    public Pago(int id, double monto, String metodo, boolean confirmado) {
        this.id = id;
        this.monto = monto;
        this.metodo = metodo;
        this.confirmado = confirmado;
    }

    // Getters y Setters
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

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public boolean isConfirmado() {
        return confirmado;
    }

    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }
}
