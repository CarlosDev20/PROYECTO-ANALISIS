package repository;

import model.Usuario;
import java.util.List;

public interface UsuarioRepositorio {

    Usuario buscarPorCorreo(String correo);

    void actualizarContrasena(String correo, String nuevaContrasena);

    boolean validarCredenciales(String correo, String contrasena, String rol);

    void guardarUsuario(Usuario usuario);

    void actualizarUsuario(Usuario usuario); // Método agregado para modificar usuarios.

    void eliminarUsuario(int id);

    List<Usuario> listarUsuarios(); // Método agregado para listar todos los usuarios.
}
