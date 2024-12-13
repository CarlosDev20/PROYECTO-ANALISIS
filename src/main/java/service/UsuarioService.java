package service;

import repository.UsuarioRepositorio;

public class UsuarioService {

    private final UsuarioRepositorio repositorio;

    public UsuarioService(UsuarioRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public boolean autenticar(String correo, String contrasena, String rol) {
        return repositorio.validarCredenciales(correo, contrasena, rol);
    }
}
