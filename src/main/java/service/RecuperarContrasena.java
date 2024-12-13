package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RecuperarContrasena {

    private UsuarioService usuarioService;
    private Map<String, String> codigos = new HashMap<>();
    // Mapa correo -> codigo para validación

    public RecuperarContrasena(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public void recuperarContrasena(String correo) {
        // Generar un código aleatorio
        String codigo = generarCodigo();
        // Guardar el código asociado al correo
        codigos.put(correo, codigo);
        // Aquí podrías enviar un correo electrónico con el código, etc.
        System.out.println("Se envió un código de recuperación al correo: " + correo);
    }

    public boolean validarCodigo(String correo, String codigo) {
        // Verifica si el código coincide
        String codigoGuardado = codigos.get(correo);
        return codigoGuardado != null && codigoGuardado.equals(codigo);
    }

//    public void actualizarContrasena(String correo, String nuevaContrasena) {
//        // Primero deberías haber validado el código en la interfaz
//        usuarioService.actualizarContrasena(correo, nuevaContrasena);
//        // Limpias el código usado
//        codigos.remove(correo);
//    }

    private String generarCodigo() {
        // Genera un código de 6 dígitos aleatorios, por ejemplo
        Random rand = new Random();
        int num = 100000 + rand.nextInt(900000);
        return String.valueOf(num);
    }
}
