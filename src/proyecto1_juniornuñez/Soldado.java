package proyecto1_juniornuñez;

import java.util.ArrayList;
import java.util.List;

public class Soldado extends Ficha {
    public Soldado(String propietario) {
        super(propietario);
    }

    @Override
    public boolean mover(int filaInicial, int columnaInicial, int filaFinal, int columnaFinal, Ficha[][] tablero) {
        int deltaFila = filaFinal - filaInicial;
        int deltaColumna = columnaFinal - columnaInicial;

        if (getPropietario().equals(TableroAjedrezChino.getInstancia().getUsuarioActual().getUser())) {
            
            if (filaInicial > 4) { 
                return (deltaFila == -1 && deltaColumna == 0);
            } else { 
                return (deltaFila == -1 && deltaColumna == 0) || (deltaFila == 0 && Math.abs(deltaColumna) == 1);
            }
        } else if (getPropietario().equals(TableroAjedrezChino.getInstancia().getOponente().getUser())) {
            
            if (filaInicial < 5) { 
                return (deltaFila == 1 && deltaColumna == 0);
            } else { 
                return (deltaFila == 1 && deltaColumna == 0) || (deltaFila == 0 && Math.abs(deltaColumna) == 1);
            }
        }
        return false;
    }

    @Override
    public String getNombre() {
        return "Soldado";
    }

    @Override
    public List<int[]> obtenerMovimientosPosibles(int fila, int columna, Ficha[][] tablero) {
        List<int[]> movimientos = new ArrayList<>();
        int deltaFila;

        
        if (getPropietario().equals(TableroAjedrezChino.getInstancia().getUsuarioActual().getUser())) {
            deltaFila = -1; 
        } else {
            deltaFila = 1; 
        }

        if (fila + deltaFila >= 0 && fila + deltaFila < tablero.length &&
            (tablero[fila + deltaFila][columna] == null || !tablero[fila + deltaFila][columna].getPropietario().equals(getPropietario()))) {
            movimientos.add(new int[]{fila + deltaFila, columna});
        }

        if ((getPropietario().equals(TableroAjedrezChino.getInstancia().getUsuarioActual().getUser()) && fila <= 4) ||
            (getPropietario().equals(TableroAjedrezChino.getInstancia().getOponente().getUser()) && fila >= 5)) {

            if (columna - 1 >= 0 &&
                (tablero[fila][columna - 1] == null || !tablero[fila][columna - 1].getPropietario().equals(getPropietario()))) {
                movimientos.add(new int[]{fila, columna - 1});
            }
            
            if (columna + 1 < tablero[0].length &&
                (tablero[fila][columna + 1] == null || !tablero[fila][columna + 1].getPropietario().equals(getPropietario()))) {
                movimientos.add(new int[]{fila, columna + 1});
            }
        }

        return movimientos;
    }
}