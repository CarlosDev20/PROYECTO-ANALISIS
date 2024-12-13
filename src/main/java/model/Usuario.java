package model;

public class Usuario {
    private int id;
    private String correo;
    private String contrasena;
    private String rol; // "administrador", "conductor", etc.

    public Usuario(int id, String correo, String contrasena, String rol) {
        this.id = id;
        this.correo = correo;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
