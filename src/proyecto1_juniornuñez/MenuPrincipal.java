package proyecto1_juniornuñez;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MenuPrincipal extends javax.swing.JFrame {

    private ArrayList<DatosUser> listaUsuarios;
    private DatosUser usuarioActual;

    public MenuPrincipal(ArrayList<DatosUser> listaUsuarios, DatosUser usuarioActual) {
        initComponents();
        this.listaUsuarios = listaUsuarios;
        this.usuarioActual = usuarioActual;
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jugar_lbl = new javax.swing.JLabel();
        nuevapartida_btn = new javax.swing.JButton();
        reportes_btn = new javax.swing.JButton();
        logout_btn = new javax.swing.JButton();
        micuenta_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jugar_lbl.setForeground(new java.awt.Color(51, 153, 255));
        jugar_lbl.setText("JUGAR XIANG QI");

        nuevapartida_btn.setText("Nueva Partida");
        nuevapartida_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevapartida_btnActionPerformed(evt);
            }
        });

        reportes_btn.setText("REPORTES");
        reportes_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportes_btnActionPerformed(evt);
            }
        });

        logout_btn.setText("Log out");
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });

        micuenta_btn.setText("Mi Cuenta");
        micuenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                micuenta_btnActionPerformed(evt);
            }
        });

        jLabel1.setText("lo quiero mucho inge");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nuevapartida_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reportes_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(micuenta_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(192, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jugar_lbl)
                        .addGap(202, 202, 202))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jugar_lbl)
                .addGap(18, 18, 18)
                .addComponent(nuevapartida_btn)
                .addGap(29, 29, 29)
                .addComponent(micuenta_btn)
                .addGap(28, 28, 28)
                .addComponent(reportes_btn)
                .addGap(26, 26, 26)
                .addComponent(logout_btn)
                .addGap(95, 95, 95))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void micuenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_micuenta_btnActionPerformed
        MiCuenta miCuentaWindow = new MiCuenta(listaUsuarios, usuarioActual);
        miCuentaWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_micuenta_btnActionPerformed

    private void reportes_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportes_btnActionPerformed
         
    JDialog dialogoReportes = new JDialog(this, "Reportes", true);
    dialogoReportes.setSize(400, 300);
    dialogoReportes.setLocationRelativeTo(this);
    dialogoReportes.setLayout(new BorderLayout());

    
    JButton btnRanking = new JButton("Ranking de Jugadores");
    JButton btnLogPartidos = new JButton("Log de Mis Últimos Partidos");

    
    btnRanking.addActionListener(e -> {
        
        mostrarRankingJugadores();
        
        dialogoReportes.dispose();
    });

    btnLogPartidos.addActionListener(e -> {
        
        mostrarLogPartidos();
        
        dialogoReportes.dispose();
    });
    
    JPanel panelBotones = new JPanel();
    panelBotones.setLayout(new GridLayout(2, 1, 10, 10));
    panelBotones.add(btnRanking);
    panelBotones.add(btnLogPartidos);

    dialogoReportes.add(panelBotones, BorderLayout.CENTER);

    dialogoReportes.setVisible(true);
}

private void mostrarRankingJugadores() {
    
    JDialog dialogoRanking = new JDialog(this, "Ranking de Jugadores", true);
    dialogoRanking.setSize(500, 400);
    dialogoRanking.setLocationRelativeTo(this);
    dialogoRanking.setLayout(new BorderLayout());

    DefaultTableModel modeloTabla = new DefaultTableModel(new Object[]{"Posición", "Usuario", "Puntos"}, 0);
    JTable tablaRanking = new JTable(modeloTabla);

    listaUsuarios.sort((u1, u2) -> Integer.compare(u2.getPuntos(), u1.getPuntos()));

    int posicion = 1;
    for (DatosUser usuario : listaUsuarios) {
        modeloTabla.addRow(new Object[]{posicion++, usuario.getUser(), usuario.getPuntos()});
    }

    JButton btnVolver = new JButton("Volver");
    btnVolver.addActionListener(e -> {
        dialogoRanking.dispose(); 
        MenuPrincipal menu = new MenuPrincipal(listaUsuarios, usuarioActual);
        menu.setVisible(true); 
        dispose();
    });

    dialogoRanking.add(new JScrollPane(tablaRanking), BorderLayout.CENTER);
    dialogoRanking.add(btnVolver, BorderLayout.SOUTH); // Agregar el botón al sur

    dialogoRanking.setVisible(true);
}

private void mostrarLogPartidos() {
    
    JDialog dialogoLog = new JDialog(this, "Log de Mis Últimos Partidos", true);
    dialogoLog.setSize(500, 400);
    dialogoLog.setLocationRelativeTo(this); 

    DefaultListModel<String> modeloLista = new DefaultListModel<>();
    JList<String> listaPartidos = new JList<>(modeloLista);

    ArrayList<Partida> partidasRecientes = usuarioActual.getPartidasRecientes();
    
    partidasRecientes.sort((p1, p2) -> p2.getFecha().compareTo(p1.getFecha()));

    for (Partida partida : partidasRecientes) {
        String resultado = partida.getResultado(); 
        String oponente = partida.getOponente(); 
        String detalles = String.format("Partido contra %s - Resultado: %s", oponente, resultado);
        modeloLista.addElement(detalles);
    }

    dialogoLog.add(new JScrollPane(listaPartidos), BorderLayout.CENTER);

    JButton btnVolver = new JButton("Volver");
    btnVolver.addActionListener(e -> dialogoLog.dispose());
    dialogoLog.add(btnVolver, BorderLayout.SOUTH);

    btnVolver.addActionListener(e -> {
        dialogoLog.dispose(); 
        MenuPrincipal menu = new MenuPrincipal(listaUsuarios, usuarioActual);
        menu.setVisible(true);
        dispose();
    });
    // Mostrar el diálogo
    dialogoLog.setVisible(true);


    }//GEN-LAST:event_reportes_btnActionPerformed

    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnActionPerformed
        LogIn loginWindow = new LogIn(listaUsuarios);
        loginWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_logout_btnActionPerformed

    private void nuevapartida_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevapartida_btnActionPerformed
        
        JDialog dialogoJugadores = new JDialog(this, "Seleccionar Jugador", true);
        dialogoJugadores.setSize(300, 200);
        dialogoJugadores.setLocationRelativeTo(this);

        
        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        for (DatosUser usuario : listaUsuarios) {
            if (!usuario.getUser().equals(usuarioActual.getUser())) { 
                modeloLista.addElement(usuario.getUser());
            }
        }

       
        JList<String> listaJugadores = new JList<>(modeloLista);
        JScrollPane scrollPane = new JScrollPane(listaJugadores);

        JButton btnSeleccionar = new JButton("Seleccionar");
        btnSeleccionar.addActionListener(e -> {
    String jugadorSeleccionado = listaJugadores.getSelectedValue();
    if (jugadorSeleccionado != null) {
        
        DatosUser oponente = listaUsuarios.stream()
            .filter(usuario -> usuario.getUser().equals(jugadorSeleccionado))
            .findFirst()
            .orElse(null);

        if (oponente != null) {
            JOptionPane.showMessageDialog(dialogoJugadores, "Has seleccionado: " + jugadorSeleccionado);

            
            TableroAjedrezChino tablero = new TableroAjedrezChino(listaUsuarios, usuarioActual, oponente);
            tablero.setVisible(true);
            dialogoJugadores.dispose();
            dispose();
        } else {
            JOptionPane.showMessageDialog(dialogoJugadores, "No se encontró al jugador seleccionado.");
        }
    } else {
        JOptionPane.showMessageDialog(dialogoJugadores, "Por favor, selecciona un jugador.");
    }
});

        dialogoJugadores.setLayout(new BorderLayout());
        dialogoJugadores.add(scrollPane, BorderLayout.CENTER);
        dialogoJugadores.add(btnSeleccionar, BorderLayout.SOUTH);

        dialogoJugadores.setVisible(true);
    }//GEN-LAST:event_nuevapartida_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jugar_lbl;
    private javax.swing.JButton logout_btn;
    private javax.swing.JButton micuenta_btn;
    private javax.swing.JButton nuevapartida_btn;
    private javax.swing.JButton reportes_btn;
    // End of variables declaration//GEN-END:variables
}
