package model;

import java.util.Date;

public class Servicio {

    private int id;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private String mecanico;
    private Date fechaInicio;
    private Date fechaFin;

    // Constructor
    public Servicio(int id, Cliente cliente, Vehiculo vehiculo, String mecanico, Date fechaInicio, Date fechaFin) {
        this.id = id;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.mecanico = mecanico;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getMecanico() {
        return mecanico;
    }

    public void setMecanico(String mecanico) {
        this.mecanico = mecanico;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}
