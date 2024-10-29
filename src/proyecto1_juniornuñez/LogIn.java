
package proyecto1_juniornuñez;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class LogIn extends javax.swing.JFrame {

    
    private ArrayList<DatosUser> listaUsuarios;
    private ImageIcon fondoImagen;
    
    public LogIn(ArrayList<DatosUser> listaUsuarios) {
        
        this.listaUsuarios = listaUsuarios;
        
           // Cargar la imagen de fondo desde el paquete "images"
        fondoImagen = new ImageIcon(getClass().getResource("/images/fondo login.jpg"));

        // Crear un JPanel personalizado para usar de fondo
        JPanel panelFondo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibujar la imagen de fondo en el panel
                g.drawImage(fondoImagen.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };

        // Configurar el panel como el contenido del JFrame
        setContentPane(panelFondo);
        panelFondo.setLayout(new BorderLayout()); // Usar BorderLayout para organizar los componentes
        
       initComponents();

        setLocationRelativeTo(null);
       
        ircrearcuenta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                if (evt.getClickCount() == 2) { 
                    CrearCuenta crearCuentaWindow = new CrearCuenta(listaUsuarios); 
                    crearCuentaWindow.setVisible(true);
                    dispose(); 
                }
            }
        });
    }
    
    private DatosUser obtenerUsuarioPorNombre(String username) {
        for (DatosUser usuario : listaUsuarios) {
            if (usuario.getUser().equals(username)) {
            return usuario; 
        }
    }
    return null; 
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_lbl = new javax.swing.JLabel();
        username_lbl = new javax.swing.JLabel();
        username_txtfield = new javax.swing.JTextField();
        contrasena_lbl = new javax.swing.JLabel();
        contrasena_txtfield = new javax.swing.JTextField();
        ircrearcuenta = new javax.swing.JLabel();
        Cerrarlogin = new javax.swing.JButton();
        loginentrar_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        login_lbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        login_lbl.setForeground(new java.awt.Color(255, 255, 255));
        login_lbl.setText("Bienvenido a Log In");

        username_lbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username_lbl.setForeground(new java.awt.Color(255, 255, 255));
        username_lbl.setText("Username:");
        username_lbl.setToolTipText("");

        contrasena_lbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contrasena_lbl.setForeground(new java.awt.Color(255, 255, 255));
        contrasena_lbl.setText("Contraseña:");

        ircrearcuenta.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        ircrearcuenta.setForeground(new java.awt.Color(51, 102, 255));
        ircrearcuenta.setText("CREAR CUENTA!");

        Cerrarlogin.setText("Cerrar Juego");
        Cerrarlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarloginActionPerformed(evt);
            }
        });

        loginentrar_btn.setText("Log In");
        loginentrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginentrar_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 458, Short.MAX_VALUE)
                .addComponent(Cerrarlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(login_lbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(ircrearcuenta)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(loginentrar_btn)
                        .addGap(277, 277, 277))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contrasena_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contrasena_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(208, 208, 208))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(login_lbl)
                .addGap(43, 43, 43)
                .addComponent(username_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(username_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contrasena_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contrasena_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginentrar_btn)
                .addGap(18, 18, 18)
                .addComponent(ircrearcuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(Cerrarlogin)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarloginActionPerformed
        this.dispose();
    }//GEN-LAST:event_CerrarloginActionPerformed

    private void loginentrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginentrar_btnActionPerformed
         String username = username_txtfield.getText();
    String contrasena = contrasena_txtfield.getText();

    DatosUser usuarioActual = null; 

    boolean loginExitoso = false;

    
    for (DatosUser usuario : listaUsuarios) {
        if (usuario.verificarLogin(username, contrasena)) {
            loginExitoso = true;
            usuarioActual = usuario; 
            break;
        }
    }

    if (loginExitoso) {
        JOptionPane.showMessageDialog(this, "Login exitoso. Bienvenido " + username + "!");
        
        MenuPrincipal menu = new MenuPrincipal(listaUsuarios, usuarioActual);
        menu.setVisible(true);
        dispose(); 
    } else {
        JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos. Intentalo de nuevo.");
    }
   
    }//GEN-LAST:event_loginentrar_btnActionPerformed
    
  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrarlogin;
    private javax.swing.JLabel contrasena_lbl;
    private javax.swing.JTextField contrasena_txtfield;
    private javax.swing.JLabel ircrearcuenta;
    private javax.swing.JLabel login_lbl;
    private javax.swing.JButton loginentrar_btn;
    private javax.swing.JLabel username_lbl;
    private javax.swing.JTextField username_txtfield;
    // End of variables declaration//GEN-END:variables
}
