package proyecto1_juniornuñez;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

public class TableroAjedrezChino extends JFrame {
    private static TableroAjedrezChino instancia;
    private JButton[][] botones;
    private Ficha[][] tablero;
    private int filaSeleccionada = -1;
    private int columnaSeleccionada = -1;
    private boolean esTurnoJugadorActual = true;
    private JLabel turnoLabel;
    private JPanel panelPiezasUsuario, panelPiezasOponente;
    private ArrayList<DatosUser> listaUsuarios;
    private DatosUser usuarioActual;
    private DatosUser oponente;

    public TableroAjedrezChino(ArrayList<DatosUser> listaUsuarios, DatosUser usuarioActual, DatosUser oponente) {
        this.listaUsuarios = listaUsuarios;
        this.usuarioActual = usuarioActual;
        this.oponente = oponente;
        setLocationRelativeTo(null);

        TableroAjedrezChino.instancia = this;

        this.esTurnoJugadorActual = true;

        initComponents();
    }

    public static TableroAjedrezChino getInstancia() {
        return instancia;
    }

    public DatosUser getUsuarioActual() {
        return usuarioActual;
    }

    public DatosUser getOponente() {
        return oponente;
    }

    private void initComponents() {
        setTitle("Tablero de Ajedrez Chino");
        setSize(1200, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel(new BorderLayout());
        JPanel panelTablero = new JPanel(new GridBagLayout());
        botones = new JButton[10][9]; 
        tablero = new Ficha[10][9];   
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(1, 1, 1, 1);
        Dimension buttonSize = new Dimension(60, 60);
        int imageSize = 50;

        panelPiezasUsuario = new JPanel();
        panelPiezasUsuario.setLayout(new BoxLayout(panelPiezasUsuario, BoxLayout.Y_AXIS));
        panelPiezasUsuario.setPreferredSize(new Dimension(100, 400)); 

        panelPiezasOponente = new JPanel();
        panelPiezasOponente.setLayout(new BoxLayout(panelPiezasOponente, BoxLayout.Y_AXIS));
        panelPiezasOponente.setPreferredSize(new Dimension(100, 400)); 

        JScrollPane scrollUsuario = new JScrollPane(panelPiezasUsuario);
        scrollUsuario.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollUsuario.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        JScrollPane scrollOponente = new JScrollPane(panelPiezasOponente);
        scrollOponente.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollOponente.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        ImageIcon torreRoja = redimensionarImagen("/images/torreroja.png", imageSize);
        ImageIcon torreNegra = redimensionarImagen("/images/torrenegra.png", imageSize);
        ImageIcon caballoRojo = redimensionarImagen("/images/caballorojo.png", imageSize);
        ImageIcon caballoNegro = redimensionarImagen("/images/caballonegro.png", imageSize);
        ImageIcon elefanteRojo = redimensionarImagen("/images/elefanterojo.png", imageSize);
        ImageIcon elefanteNegro = redimensionarImagen("/images/elefantenegro.png", imageSize);
        ImageIcon oficialRojo = redimensionarImagen("/images/oficialrojo.png", imageSize);
        ImageIcon oficialNegro = redimensionarImagen("/images/oficialnegro.png", imageSize);
        ImageIcon reyRojo = redimensionarImagen("/images/reyrojo.png", imageSize);
        ImageIcon reyNegro = redimensionarImagen("/images/reynegro.png", imageSize);
        ImageIcon canonRojo = redimensionarImagen("/images/canonrojo.png", imageSize);
        ImageIcon canonNegro = redimensionarImagen("/images/canonnegro.png", imageSize);
        ImageIcon peonRojo = redimensionarImagen("/images/soldadorojo.png", imageSize);
        ImageIcon peonNegro = redimensionarImagen("/images/soldadonegro.png", imageSize);

        turnoLabel = new JLabel("Turno de: " + usuarioActual.getUser());
        turnoLabel.setFont(new Font("Arial", Font.BOLD, 16));

        JPanel panelLateral = new JPanel(new BorderLayout());
        JPanel panelFichas = new JPanel(new GridLayout(2, 1, 0, 10)); // Espacio entre los paneles

        JLabel fichasOponenteLabel = new JLabel("Fichas capturadas por: " + oponente.getUser(), JLabel.CENTER);
        panelFichas.add(fichasOponenteLabel);
        panelFichas.add(scrollOponente);

        JLabel fichasUsuarioLabel = new JLabel("Fichas capturadas por: " + usuarioActual.getUser(), JLabel.CENTER);
        panelFichas.add(fichasUsuarioLabel);
        panelFichas.add(scrollUsuario);

        panelLateral.add(turnoLabel, BorderLayout.NORTH);
        panelLateral.add(panelFichas, BorderLayout.CENTER);

        JButton retirarButton = new JButton("Retirar");
        retirarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retirarJuego();
            }
        });
        panelLateral.add(retirarButton, BorderLayout.SOUTH);

        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 9; columna++) {
                crearBoton(fila, columna, panelTablero, buttonSize, gbc, imageSize, torreNegra, caballoNegro,
                        elefanteNegro, oficialNegro, reyNegro, canonNegro, peonNegro, oponente.getUser());
            }
        }

        JPanel panelRio = new JPanel();
        panelRio.setBackground(new Color(173, 216, 230)); 
        panelRio.setPreferredSize(new Dimension(540, 20)); 

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 9;
        panelTablero.add(panelRio, gbc);
        gbc.gridwidth = 1; 

        for (int fila = 5; fila < 10; fila++) {
            for (int columna = 0; columna < 9; columna++) {
                crearBoton(fila, columna, panelTablero, buttonSize, gbc, imageSize, torreRoja, caballoRojo,
                        elefanteRojo, oficialRojo, reyRojo, canonRojo, peonRojo, usuarioActual.getUser());
            }
        }

        panelPrincipal.add(panelTablero, BorderLayout.CENTER);
        panelPrincipal.add(panelLateral, BorderLayout.EAST);

        add(panelPrincipal);
        setVisible(true);
    }

    private void crearBoton(int fila, int columna, JPanel panelTablero, Dimension buttonSize, GridBagConstraints gbc,
                            int imageSize, ImageIcon torre, ImageIcon caballo, ImageIcon elefante, ImageIcon oficial,
                            ImageIcon rey, ImageIcon canon, ImageIcon peon, String propietario) {
        botones[fila][columna] = new JButton();
        botones[fila][columna].setPreferredSize(buttonSize);
        botones[fila][columna].setFocusable(false); 

        if ((fila >= 0 && fila <= 2 && columna >= 3 && columna <= 5) ||
                (fila >= 7 && fila <= 9 && columna >= 3 && columna <= 5)) {
            botones[fila][columna].setBackground(new Color(255, 200, 150));
        } else {
            botones[fila][columna].setBackground(Color.LIGHT_GRAY);
        }

        if (fila == 0) {
            if (columna == 0 || columna == 8) {
                tablero[fila][columna] = new CarroDeGuerra(propietario);
                botones[fila][columna].setIcon(torre);
            } else if (columna == 1 || columna == 7) {
                tablero[fila][columna] = new Caballo(propietario);
                botones[fila][columna].setIcon(caballo);
            } else if (columna == 2 || columna == 6) {
                tablero[fila][columna] = new Elefante(propietario);
                botones[fila][columna].setIcon(elefante);
            } else if (columna == 3 || columna == 5) {
                tablero[fila][columna] = new Oficial(propietario);
                botones[fila][columna].setIcon(oficial);
            } else if (columna == 4) {
                tablero[fila][columna] = new General(propietario);
                botones[fila][columna].setIcon(rey);
            }
        } else if (fila == 2 && (columna == 1 || columna == 7)) {
            tablero[fila][columna] = new Canon(propietario);
            botones[fila][columna].setIcon(canon);
        } else if (fila == 3 && columna % 2 == 0) {
            tablero[fila][columna] = new Soldado(propietario);
            botones[fila][columna].setIcon(peon);
        }

        if (fila == 9) {
            if (columna == 0 || columna == 8) {
                tablero[fila][columna] = new CarroDeGuerra(propietario);
                botones[fila][columna].setIcon(torre);
            } else if (columna == 1 || columna == 7) {
                tablero[fila][columna] = new Caballo(propietario);
                botones[fila][columna].setIcon(caballo);
            } else if (columna == 2 || columna == 6) {
                tablero[fila][columna] = new Elefante(propietario);
                botones[fila][columna].setIcon(elefante);
            } else if (columna == 3 || columna == 5) {
                tablero[fila][columna] = new Oficial(propietario);
                botones[fila][columna].setIcon(oficial);
            } else if (columna == 4) {
                tablero[fila][columna] = new General(propietario);
                botones[fila][columna].setIcon(rey);
            }
        } else if (fila == 7 && (columna == 1 || columna == 7)) {
            tablero[fila][columna] = new Canon(propietario);
            botones[fila][columna].setIcon(canon);
        } else if (fila == 6 && columna % 2 == 0) {
            tablero[fila][columna] = new Soldado(propietario);
            botones[fila][columna].setIcon(peon);
        }

        final int filaFinal = fila;
        final int columnaFinal = columna;
        botones[fila][columna].addActionListener(e -> manejarClicEnBoton(filaFinal, columnaFinal));

        gbc.gridx = columna;
        gbc.gridy = fila >= 5 ? fila + 1 : fila; 
        panelTablero.add(botones[fila][columna], gbc);
    }

 private void manejarClicEnBoton(int fila, int columna) {
    if (filaSeleccionada == -1 && columnaSeleccionada == -1) {
        if (tablero[fila][columna] != null && turnoValido(fila, columna)) {
            filaSeleccionada = fila;
            columnaSeleccionada = columna;
            resaltarMovimientosPosibles(fila, columna);
        }
    } else {
        Ficha fichaSeleccionada = tablero[filaSeleccionada][columnaSeleccionada];
        if (fichaSeleccionada.mover(filaSeleccionada, columnaSeleccionada, fila, columna)) {
            
            if (tablero[fila][columna] == null || !tablero[fila][columna].getPropietario().equals(fichaSeleccionada.getPropietario())) {
               
                ImageIcon iconoOriginal = (ImageIcon) botones[filaSeleccionada][columnaSeleccionada].getIcon();
                ImageIcon iconoDestino = (ImageIcon) botones[fila][columna].getIcon();
                
                if (tablero[fila][columna] instanceof General) {
                    
                    DatosUser ganador = fichaSeleccionada.getPropietario().equals(usuarioActual.getUser()) ? usuarioActual : oponente;
                    DatosUser perdedor = ganador == usuarioActual ? oponente : usuarioActual;

                    ganador.setPuntos(ganador.getPuntos() + 3); 

                    ganador.agregarPartida(new Partida(perdedor.getUser(), "Victoria", new Date()));
                    perdedor.agregarPartida(new Partida(ganador.getUser(), "Derrota", new Date()));

                    JOptionPane.showMessageDialog(this, ganador.getUser() + " ha ganado al capturar al rey enemigo. Gano 3 puntos");

                    MenuPrincipal menuPrincipalWindow = new MenuPrincipal(listaUsuarios, usuarioActual);
                    menuPrincipalWindow.setVisible(true);
                    dispose();
                    return;
                }
                
                if (tablero[fila][columna] != null) {
                    capturarFicha(fila, columna);
                }

                tablero[fila][columna] = fichaSeleccionada;
                tablero[filaSeleccionada][columnaSeleccionada] = null;

                
                botones[fila][columna].setIcon(iconoOriginal);
                botones[filaSeleccionada][columnaSeleccionada].setIcon(null);

                
                if (hayVisionDirectaEntreGenerales(columna, tablero)) {
                    JOptionPane.showMessageDialog(this, "Los generales no pueden tener vision directa, debes mover otra pieza.");

                    
                    botones[fila][columna].setIcon(iconoDestino); 
                    botones[filaSeleccionada][columnaSeleccionada].setIcon(iconoOriginal);  
                    tablero[fila][columna] = null;  
                    tablero[filaSeleccionada][columnaSeleccionada] = fichaSeleccionada;  

                   
                    return;
                } else {
                    
                    cambiarTurno();
                }
            } else {
               
                JOptionPane.showMessageDialog(this, "No puedes moverte a una casilla ocupada por una de tus propias piezas.");
            }
        }
        deseleccionarCasillasResaltadas();
        filaSeleccionada = -1;
        columnaSeleccionada = -1;
    }
}

    public static boolean hayVisionDirectaEntreGenerales(int columna, Ficha[][] tablero) {
        int filaRey1 = -1;
        int filaRey2 = -1;

        for (int fila = 0; fila < tablero.length; fila++) {
            if (tablero[fila][columna] instanceof General) {
                if (filaRey1 == -1) {
                    filaRey1 = fila;
                } else {
                    filaRey2 = fila;
                    break;
                }
            }
        }

        if (filaRey1 != -1 && filaRey2 != -1) {
            
            for (int fila = Math.min(filaRey1, filaRey2) + 1; fila < Math.max(filaRey1, filaRey2); fila++) {
                if (tablero[fila][columna] != null) {
                    return false; 
                }
            }
            return true; 
        }

        return false; 
    }

    private void retirarJuego() {
    int confirmacion = JOptionPane.showConfirmDialog(this, "Seguro que deseas retirarte?", "Confirmacion", JOptionPane.YES_NO_OPTION);
    if (confirmacion == JOptionPane.YES_OPTION) {
        
        oponente.setPuntos(oponente.getPuntos() + 3);

        usuarioActual.agregarPartida(new Partida(oponente.getUser(), "Derrota (Retirado)", new Date()));
        oponente.agregarPartida(new Partida(usuarioActual.getUser(), "Victoria", new Date()));

        JOptionPane.showMessageDialog(this, oponente.getUser() + " ha ganado 3 puntos!");

        MenuPrincipal MenuPricipalWindow = new MenuPrincipal(listaUsuarios, usuarioActual);
        MenuPricipalWindow.setVisible(true);
        dispose();
    }
}

   private void capturarFicha(int fila, int columna) {
    if (tablero[fila][columna] != null) {
        Ficha fichaCapturada = tablero[fila][columna];
        ImageIcon icon = (ImageIcon) botones[fila][columna].getIcon();

        JLabel fichaLabel = new JLabel(icon);
        fichaLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        if (fichaCapturada.getPropietario().equals(oponente.getUser())) {
            
            panelPiezasUsuario.add(fichaLabel);
        } else {
            
            panelPiezasOponente.add(fichaLabel);
        }

       
        panelPiezasUsuario.revalidate();
        panelPiezasUsuario.repaint();
        panelPiezasOponente.revalidate();
        panelPiezasOponente.repaint();
    }
}

    private void resaltarMovimientosPosibles(int fila, int columna) {
        Ficha ficha = tablero[fila][columna];
        if (ficha == null) return;

        java.util.List<int[]> movimientos = ficha.obtenerMovimientosPosibles(fila, columna, tablero);
        for (int[] movimiento : movimientos) {
            int filaPosible = movimiento[0];
            int columnaPosible = movimiento[1];
            if (filaPosible >= 0 && filaPosible < 10 && columnaPosible >= 0 && columnaPosible < 9) {
                botones[filaPosible][columnaPosible].setBackground(Color.YELLOW);
            }
        }
    }

    private void deseleccionarCasillasResaltadas() {
        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna < 9; columna++) {
                if (botones[fila][columna] != null) {
                    if ((fila >= 0 && fila <= 2 && columna >= 3 && columna <= 5) ||
                            (fila >= 7 && fila <= 9 && columna >= 3 && columna <= 5)) {
                        botones[fila][columna].setBackground(new Color(255, 200, 150));
                    } else {
                        botones[fila][columna].setBackground(Color.LIGHT_GRAY);
                    }
                }
            }
        }
    }

    private boolean turnoValido(int fila, int columna) {
        Ficha ficha = tablero[fila][columna];
        return (esTurnoJugadorActual && ficha.getPropietario().equals(usuarioActual.getUser())) ||
                (!esTurnoJugadorActual && ficha.getPropietario().equals(oponente.getUser()));
    }

    private void cambiarTurno() {
        esTurnoJugadorActual = !esTurnoJugadorActual;
        turnoLabel.setText("Turno de: " + (esTurnoJugadorActual ? usuarioActual.getUser() : oponente.getUser()));
    }

    private ImageIcon redimensionarImagen(String ruta, int size) {
        ImageIcon icon = new ImageIcon(getClass().getResource(ruta));
        Image imagen = icon.getImage().getScaledInstance(size, size, Image.SCALE_SMOOTH);
        return new ImageIcon(imagen);
    }
}