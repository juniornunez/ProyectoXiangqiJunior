
package proyecto1_juniornuñez;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MiCuenta extends javax.swing.JFrame {

    
    private ArrayList<DatosUser> listaUsuarios;
    private DatosUser usuarioActual;
    
    
    public MiCuenta(ArrayList<DatosUser> listaUsuarios, DatosUser usuarioActual) {
        initComponents();
        this.listaUsuarios = listaUsuarios;
        this.usuarioActual = usuarioActual;
        setLocationRelativeTo(null);
        
        mostrarDatosUsuario();
    }
    
    private void mostrarDatosUsuario() {
    nombreuser_lbl.setText(usuarioActual.getUser());
    fechaingresouser_lbl.setText(usuarioActual.getFechaIngreso().toString());
    estadocuentauser_lbl.setText(usuarioActual.isActivo() ? "Activo" : "Inactivo");
    cantidadpuntos.setText(String.valueOf(usuarioActual.getPuntos())); 
}
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        username_lbl = new javax.swing.JLabel();
        fechaingreso_lbl = new javax.swing.JLabel();
        volvermenu_btn = new javax.swing.JButton();
        nombreuser_lbl = new javax.swing.JLabel();
        fechaingresouser_lbl = new javax.swing.JLabel();
        estadocuentauser_lbl = new javax.swing.JLabel();
        cambiarcontrasena_btn = new javax.swing.JButton();
        borrarcuenta_btn = new javax.swing.JButton();
        Puntos_lbl = new javax.swing.JLabel();
        cantidadpuntos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Estado:");

        username_lbl.setText("Username:");

        fechaingreso_lbl.setText("Fecha ingreso:");

        volvermenu_btn.setText("Volver atras");
        volvermenu_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volvermenu_btnActionPerformed(evt);
            }
        });

        nombreuser_lbl.setText(".");

        fechaingresouser_lbl.setText(".");

        estadocuentauser_lbl.setText(",");

        cambiarcontrasena_btn.setText("Cambiar contraseña");
        cambiarcontrasena_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarcontrasena_btnActionPerformed(evt);
            }
        });

        borrarcuenta_btn.setText("Borrar Cuenta");
        borrarcuenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarcuenta_btnActionPerformed(evt);
            }
        });

        Puntos_lbl.setText("Puntos:");

        cantidadpuntos.setText("cantidadpuntos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(username_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreuser_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fechaingreso_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaingresouser_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(estadocuentauser_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Puntos_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cantidadpuntos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(borrarcuenta_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(volvermenu_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cambiarcontrasena_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_lbl)
                    .addComponent(nombreuser_lbl))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaingreso_lbl)
                    .addComponent(fechaingresouser_lbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(estadocuentauser_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cambiarcontrasena_btn)
                    .addComponent(Puntos_lbl)
                    .addComponent(cantidadpuntos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(volvermenu_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(borrarcuenta_btn)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volvermenu_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volvermenu_btnActionPerformed
        
        MenuPrincipal menu = new MenuPrincipal(listaUsuarios, usuarioActual);
        menu.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_volvermenu_btnActionPerformed

    private void cambiarcontrasena_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarcontrasena_btnActionPerformed
        
        boolean contrasenaCorrecta = false;

    while (!contrasenaCorrecta) {
       
        String passwordActual = JOptionPane.showInputDialog(this, "Ingrese su contraseña (ACTUAL)");

        if (passwordActual == null) {
            JOptionPane.showMessageDialog(this, "Operacion cancelada");
            
            MiCuenta miCuentaWindow = new MiCuenta(listaUsuarios, usuarioActual);
            miCuentaWindow.setVisible(true);
            dispose(); 
            return; 
        }

        if (!usuarioActual.getContrasena().equals(passwordActual)) {
            JOptionPane.showMessageDialog(this, "Contraseña actual incorrecta, vuelva a inetentar denuevo.");
        } else {
            contrasenaCorrecta = true; 
        }
    }

    boolean nuevaContrasenaValida = false; 

    while (!nuevaContrasenaValida) {
        
        String nuevaContrasena = JOptionPane.showInputDialog(this, "Ingrese su nueva contraseña [5 caracteres]:");

        if (nuevaContrasena == null) {
            JOptionPane.showMessageDialog(this, "Operacion cancelada.");
            MiCuenta miCuentaWindow = new MiCuenta(listaUsuarios, usuarioActual);
            miCuentaWindow.setVisible(true);
            dispose(); 
            return; 
        }

        if (nuevaContrasena.length() != 5) {
            JOptionPane.showMessageDialog(this, "La nueva contraseña debe tener exactamente 5 caracteres.");
            continue; 
        }

        if (nuevaContrasena.equals(usuarioActual.getContrasena())) {
            JOptionPane.showMessageDialog(this, "La nueva contraseña no puede ser igual a la contraseña actual");
            continue; // 
        }

        usuarioActual.setContrasena(nuevaContrasena);
        nuevaContrasenaValida = true; 
    }

    JOptionPane.showMessageDialog(this, "Contraseña cambiada exitosamente.");

    MiCuenta miCuentaWindow = new MiCuenta(listaUsuarios, usuarioActual);
    miCuentaWindow.setVisible(true); 

    dispose();
    }//GEN-LAST:event_cambiarcontrasena_btnActionPerformed

    private void borrarcuenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarcuenta_btnActionPerformed
    boolean contrasenaCorrecta = false;

    while (!contrasenaCorrecta) {
        
        String passwordActual = JOptionPane.showInputDialog(this, "Ingrese su contraseña actual para confirmar la eliminación de la cuenta:");

        if (passwordActual == null || passwordActual.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Operacion cancelada.");
            return; 
        }

        if (!usuarioActual.getContrasena().equals(passwordActual)) {
            JOptionPane.showMessageDialog(this, "Contraseña incorrecta. Intente de nuevo.");
        } else {
            contrasenaCorrecta = true; 
        }
    }

    int confirmacion = JOptionPane.showConfirmDialog(this, "Seguro desea eliminar su cuenta?", "Confirmacion", JOptionPane.YES_NO_OPTION);
    
    if (confirmacion == JOptionPane.YES_OPTION) {
        
        listaUsuarios.remove(usuarioActual);
        
        JOptionPane.showMessageDialog(this, "Su cuenta fue eliminada exitosamente");

       
        LogIn loginWindow = new LogIn(listaUsuarios); 
        loginWindow.setVisible(true);

        dispose();
    }
    }//GEN-LAST:event_borrarcuenta_btnActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Puntos_lbl;
    private javax.swing.JButton borrarcuenta_btn;
    private javax.swing.JButton cambiarcontrasena_btn;
    private javax.swing.JLabel cantidadpuntos;
    private javax.swing.JLabel estadocuentauser_lbl;
    private javax.swing.JLabel fechaingreso_lbl;
    private javax.swing.JLabel fechaingresouser_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nombreuser_lbl;
    private javax.swing.JLabel username_lbl;
    private javax.swing.JButton volvermenu_btn;
    // End of variables declaration//GEN-END:variables
}
