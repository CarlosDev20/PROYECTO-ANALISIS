package model;

public class Conductor extends Rol {

    private String dni;
    private String apellido;
    private String telefono;
    private String licencia;

    public Conductor(int id, String dni, String nombre, String apellido, String correo, String telefono, String contrasena, String licencia) {
        super(id, nombre, correo, contrasena);
        this.dni = dni;
        this.apellido = apellido;
        this.telefono = telefono;
        this.licencia = licencia;
    }

    @Override
    public boolean iniciarSesion() {
        // Lógica para conductor, por ejemplo validar en BD su correo y contraseña
        return true;
    }

    public String getDni() {
        return dni;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getLicencia() {
        return licencia;
    }
}
