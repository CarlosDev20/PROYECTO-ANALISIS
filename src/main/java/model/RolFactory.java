package model;

public class RolFactory {

    public Rol crearRol(String tipo, int id, String nombre, String correo, String contrasena, String dni, String apellido, String telefono, String licencia) {
        switch (tipo.toLowerCase()) {
            case "administrador":
                return new Administrador(id, nombre, correo, contrasena);
            case "conductor":
                return new Conductor(id, dni, nombre, apellido, correo, telefono, contrasena, licencia);
            default:
                return null;
        }
    }

    // Sobrecarga si no necesitas todos los campos
    public Rol crearRol(String tipo, int id, String nombre, String correo, String contrasena) {
        switch (tipo.toLowerCase()) {
            case "administrador":
                return new Administrador(id, nombre, correo, contrasena);
            default:
                return null;
        }
    }
}
