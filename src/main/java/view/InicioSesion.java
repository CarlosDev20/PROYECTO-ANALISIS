package view;

import controller.ClienteController;
import controller.ConductorController;
import javax.swing.JOptionPane;
import repository.ClienteRepositorio;
import repository.ClienteRepositorioMySql;
import repository.ConductorRepositorio;
import repository.ConductorRepositorioMySql;
import repository.UsuarioRepositorio;
import repository.UsuarioRepositorioMySql;
import service.ClienteService;
import service.ConductorService;
import service.UsuarioService;

public class InicioSesion extends javax.swing.JFrame {

    public InicioSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtContrase = new javax.swing.JPasswordField();
        javax.swing.JButton btnIngresar = new javax.swing.JButton();
        txtRol = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 0));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("INICIO DE SESION");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("CORREO");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("CONTRASEÑA");

        txtContrase.setText("jPasswordField1");

        btnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        txtRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Administrador", "Conductor" }));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("ROL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(192, 192, 192))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel4)))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCorreo)
                    .addComponent(txtContrase, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(txtRol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtContrase, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRol, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String correo = txtCorreo.getText();
        String contra = new String(txtContrase.getPassword());
        String rol = txtRol.getSelectedItem().toString();

        if (correo.isEmpty() || contra.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
        }

        UsuarioRepositorio repositorio = new UsuarioRepositorioMySql();
        UsuarioService servicio = new UsuarioService(repositorio);
        
        boolean autenticado = servicio.autenticar(correo, contra, rol);

        if (autenticado) {
            JOptionPane.showMessageDialog(this, "Bienvenido como " + rol);

            // Redirigir según el rol
            switch (rol) {
                case "Cliente":

                    ClienteRepositorio clienteRepositorio;
                    clienteRepositorio = new ClienteRepositorioMySql();
                    ClienteService clienteService = new ClienteService(clienteRepositorio);
                    ClienteController clienteController = new ClienteController(clienteService);
                    new VentanaCliente(clienteController).setVisible(true);
                    break;
                    
                case "Conductor":
                    ConductorRepositorio conductorRepositorio = new ConductorRepositorioMySql();
                    ConductorService conductorService = new ConductorService(conductorRepositorio);
                    ConductorController conductorController = new ConductorController(conductorService);
                    new VentanaConductor(conductorController).setVisible(true);
                    break;
                    
//                case "Administrador":
//                    UsuarioRepositorio usuarioRepositorio = new UsuarioRepositorioMySql();
//                    UsuarioService usuarioService = new UsuarioService(usuarioRepositorio);
//                    UsuarioController usuarioController = new UsuarioController(usuarioService);
//
//                    new VentanaAdministrador(usuarioController).setVisible(true);
//                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Rol no reconocido.");
                    break;
            }

            // Cerrar la ventana actual
            this.dispose();
        } else {
            // Credenciales incorrectas
            JOptionPane.showMessageDialog(this, "Credenciales incorrectas. Intente nuevamente.");
        }

    }//GEN-LAST:event_btnIngresarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContrase;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JComboBox<String> txtRol;
    // End of variables declaration//GEN-END:variables
}
