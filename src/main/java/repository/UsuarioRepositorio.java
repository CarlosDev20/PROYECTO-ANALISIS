package repository;

import model.Usuario;


public interface UsuarioRepositorio {

    Usuario buscarPorCorreo(String correo);

    public void actualizarContrasena(String correo, String nuevaContrasena);
    // Otros métodos según necesidad: guardarUsuario, eliminarUsuario, listarUsuarios, etc.
    
    public boolean validarCredenciales(String correo, String contrasena, String rol);
    
}
