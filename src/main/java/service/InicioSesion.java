package service;

import model.Usuario;

public class InicioSesion {

    private UsuarioService usuarioService;
    private Usuario usuarioActual;

    public InicioSesion(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

//    public boolean iniciarSesion(String correo, String contrasena) {
//        Usuario u = usuarioService.buscarPorCorreo(correo);
//        if (u != null && u.getContrasena().equals(contrasena)) {
//            usuarioActual = u;
//            return true;
//        }
//        return false;
//    }

    public void cerrarSesion() {
        usuarioActual = null;
    }

    public Usuario getUsuarioActual() {
        return usuarioActual;
    }
}
