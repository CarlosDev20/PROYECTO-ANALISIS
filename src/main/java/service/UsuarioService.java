package service;

import repository.UsuarioRepositorio;
import model.Usuario;
import java.util.List;

public class UsuarioService {

    private final UsuarioRepositorio repositorio;

    public UsuarioService(UsuarioRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public boolean autenticar(String correo, String contrasena, String rol) {
        return repositorio.validarCredenciales(correo, contrasena, rol);
    }

    public List<Usuario> listarUsuarios() {
        return repositorio.listarUsuarios();
    }

    public void registrarUsuario(Usuario usuario) {
        repositorio.guardarUsuario(usuario);
    }

    public void modificarUsuario(Usuario usuario) {
        repositorio.actualizarUsuario(usuario);
    }

    public Usuario buscarUsuarioPorCorreo(String correo) {
        return repositorio.buscarPorCorreo(correo); // Retorna el usuario encontrado
    }

    public void actualizarContrasena(String correo, String nuevaContrasena) {
        repositorio.actualizarContrasena(correo, nuevaContrasena);
    }

    public void eliminarUsuario(int id) {
        repositorio.eliminarUsuario(id);
    }
}
