package model;

public class Cliente {

    private int id;
    private String dni;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String contrasena;

    // Constructor vacío (útil para frameworks o inicializaciones sin datos previos)
    public Cliente() {
        // Constructor vacío
    }

    // Constructor con todos los campos
    public Cliente(int id, String dni, String nombre, String apellido, String correo, String telefono, String contrasena) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.contrasena = contrasena;
    }

    // Constructor sin id (para registrar nuevos clientes)
    public Cliente(String dni, String nombre, String apellido, String correo, String telefono, String contrasena) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.contrasena = contrasena;
    }

    // Constructor solo con id (útil para búsquedas o eliminaciones por id)
    public Cliente(int id) {
        this.id = id;
    }

    // Constructor solo con dni (útil para búsquedas rápidas por dni)
    public Cliente(String dni) {
        this.dni = dni;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
