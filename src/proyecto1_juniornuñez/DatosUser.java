package proyecto1_juniornuñez;

import java.time.LocalDate;
import java.util.ArrayList;

public class DatosUser {
    private String user;
    private String contrasena;
    private int puntos;
    private LocalDate fechaIngreso;
    private boolean activo;
    private ArrayList<Partida> partidasRecientes; // Usamos ArrayList para guardar las partidas

    public DatosUser(String user, String contrasena) {
        if (contrasena.length() != 5) {
            System.out.println("Error: La contraseña debe tener exactamente 5 caracteres.");
        } else {
            this.user = user;
            this.contrasena = contrasena;
            this.puntos = 0;
            this.fechaIngreso = LocalDate.now();
            this.activo = true;
            this.partidasRecientes = new ArrayList<>(); // Inicializamos el ArrayList
        }
    }

    public String getUser() {
        return user;
    }

    public void incrementarPuntos(int puntos) {
        this.puntos += puntos;
    }

    public String getContrasena() {
        return contrasena;
    }

    public int getPuntos() {
        return puntos;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean verificarLogin(String user, String contrasena) {
        return this.user.equals(user) && this.contrasena.equals(contrasena);
    }

    public void setContrasena(String nuevaContrasena) {
        this.contrasena = nuevaContrasena;
    }

    public void agregarPartida(Partida partida) {
        partidasRecientes.add(partida);
    }

    public ArrayList<Partida> getPartidasRecientes() {
        return partidasRecientes;
    }
}