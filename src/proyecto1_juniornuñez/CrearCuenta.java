
package proyecto1_juniornuñez;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CrearCuenta extends javax.swing.JFrame {

    
    private ArrayList<DatosUser> listaUsuarios;

    public CrearCuenta(ArrayList<DatosUser> listaUsuarios) {
        initComponents();
        this.listaUsuarios = listaUsuarios; 
        setLocationRelativeTo(null);
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

        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("CREAR CUENTA");

        ingresarusername_lbl.setText("Ingrese su Username:");

        crearuser_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearuser_txtActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crearcontrasena_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crearuser_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresarusername_lbl)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(189, 209, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crearfecha_btn)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(volvercrearcuenta_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(crearcuenta_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(241, 241, 241)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(229, 229, 229)
                            .addComponent(fecha_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
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
