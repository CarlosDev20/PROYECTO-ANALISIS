package model;

public class Administrador extends Rol {

    public Administrador(int id, String nombre, String correo, String contrasena) {
        super(id, nombre, correo, contrasena);
    }

    @Override
    public boolean iniciarSesion() {
        // Aquí colocarías la lógica específica para el inicio de sesión de un Administrador.
        // Por ejemplo, validar la contraseña consultando el repositorio de usuarios.
        return true;
    }

    public void administrarUsuario() {
        // Lógica para administrar usuarios (ej: resetear contraseñas, cambiar roles, etc.)
    }
}
