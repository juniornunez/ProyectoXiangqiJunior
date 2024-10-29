
package proyecto1_juniornuñez;

import java.awt.BorderLayout;

import java.awt.Graphics;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CrearCuenta extends javax.swing.JFrame {

    
    private ArrayList<DatosUser> listaUsuarios;
    private ImageIcon fondoImagen;
    
    public CrearCuenta(ArrayList<DatosUser> listaUsuarios) {
        initComponents();
        this.listaUsuarios = listaUsuarios; 
        setLocationRelativeTo(null);
          
        fondoImagen = new ImageIcon(getClass().getResource("/images/fondo login.jpg"));

        JPanel panelFondo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                g.drawImage(fondoImagen.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };

        
        setContentPane(panelFondo);
        panelFondo.setLayout(new BorderLayout()); 
        
       initComponents();

    }
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ingresarusername_lbl = new javax.swing.JLabel();
        crearuser_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        crearcontrasena_txt = new javax.swing.JTextField();
        volvercrearcuenta_btn = new javax.swing.JButton();
        crearcuenta_btn = new javax.swing.JButton();
        crearfecha_btn = new javax.swing.JButton();
        fecha_txtfield = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("CREAR CUENTA");

        ingresarusername_lbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ingresarusername_lbl.setForeground(new java.awt.Color(255, 255, 255));
        ingresarusername_lbl.setText("Ingrese su Username:");

        crearuser_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearuser_txtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese su contraseña:");

        crearcontrasena_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearcontrasena_txtActionPerformed(evt);
            }
        });

        volvercrearcuenta_btn.setText("Volver a Log In");
        volvercrearcuenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volvercrearcuenta_btnActionPerformed(evt);
            }
        });

        crearcuenta_btn.setText("Crear Cuenta");
        crearcuenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearcuenta_btnActionPerformed(evt);
            }
        });

        crearfecha_btn.setText("Generar fecha");
        crearfecha_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearfecha_btnActionPerformed(evt);
            }
        });

        fecha_txtfield.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fecha_txtfield.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(crearcuenta_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(crearfecha_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(459, Short.MAX_VALUE)
                        .addComponent(volvercrearcuenta_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fecha_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(crearcontrasena_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(crearuser_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ingresarusername_lbl)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(ingresarusername_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(crearuser_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(19, 19, 19)
                .addComponent(crearcontrasena_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(fecha_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crearfecha_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crearcuenta_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(volvercrearcuenta_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volvercrearcuenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volvercrearcuenta_btnActionPerformed
       
        LogIn loginWindow = new LogIn(listaUsuarios);
        loginWindow.setVisible(true);
         dispose(); 
    }//GEN-LAST:event_volvercrearcuenta_btnActionPerformed

    private void crearuser_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearuser_txtActionPerformed
        
    }//GEN-LAST:event_crearuser_txtActionPerformed

    private void crearfecha_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearfecha_btnActionPerformed
         
        
        LocalDate fechaActual = LocalDate.now();
        fecha_txtfield.setText(fechaActual.toString());
        
    }//GEN-LAST:event_crearfecha_btnActionPerformed

    private void crearcuenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearcuenta_btnActionPerformed
         String username = crearuser_txt.getText();
    String contrasena = crearcontrasena_txt.getText();
    
    
    if (fecha_txtfield.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debe generar la fecha antes de crear la cuenta.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    for (DatosUser usuario : listaUsuarios) {
        if (usuario.getUser().equals(username)) {
            JOptionPane.showMessageDialog(this, "El nombre de usuario ya existe. Por favor, elige otro.");
            return;
        }
    }

    if (contrasena.length() != 5) {
        JOptionPane.showMessageDialog(this, "La contraseña debe tener exactamente 5 caracteres.");
        return;
    }
    

    
    DatosUser nuevoUsuario = new DatosUser(username, contrasena);
    listaUsuarios.add(nuevoUsuario);

    
    JOptionPane.showMessageDialog(this, "Cuenta creada exitosamente. ¡Bienvenido " + username + "!");

    
    MenuPrincipal menu = new MenuPrincipal(listaUsuarios, nuevoUsuario); 
    menu.setVisible(true);
    dispose(); 

    }//GEN-LAST:event_crearcuenta_btnActionPerformed

    private void crearcontrasena_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearcontrasena_txtActionPerformed
        
    }//GEN-LAST:event_crearcontrasena_txtActionPerformed
    
    

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField crearcontrasena_txt;
    private javax.swing.JButton crearcuenta_btn;
    private javax.swing.JButton crearfecha_btn;
    private javax.swing.JTextField crearuser_txt;
    private javax.swing.JLabel fecha_txtfield;
    private javax.swing.JLabel ingresarusername_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton volvercrearcuenta_btn;
    // End of variables declaration//GEN-END:variables
}
