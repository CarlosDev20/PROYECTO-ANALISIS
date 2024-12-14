package controller;

import model.Usuario;
import service.UsuarioService;
import java.util.List;

public class UsuarioController {
    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public void registrarUsuario(Usuario usuario) {
        usuarioService.registrarUsuario(usuario);
    }

    public void modificarUsuario(Usuario usuario) {
        usuarioService.modificarUsuario(usuario);
    }

    public void eliminarUsuario(int id) {
        usuarioService.eliminarUsuario(id);
    }

    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioService.listarUsuarios();
    }

//    public Usuario buscarUsuarioPorCorreo(String correo) {
//        return usuarioService.buscarPorCorreo(correo);
//    }

    public void actualizarContrasena(String correo, String nuevaContrasena) {
        usuarioService.actualizarContrasena(correo, nuevaContrasena);
    }

    public boolean autenticarUsuario(String correo, String contrasena, String rol) {
        return usuarioService.autenticar(correo, contrasena, rol);
    }
}