package proyecto1_juniornuñez;

import java.util.ArrayList;
import java.util.List;

public class General extends Ficha {
    public General(String propietario) {
        super(propietario);
    }

    @Override
    public boolean mover(int filaInicial, int columnaInicial, int filaFinal, int columnaFinal) {
        int deltaFila = Math.abs(filaFinal - filaInicial);
        int deltaColumna = Math.abs(columnaFinal - columnaInicial);

        if (!dentroDelPalacio(filaFinal, columnaFinal)) {
            return false;
        }

        if ((deltaFila == 1 && deltaColumna == 0) || (deltaFila == 0 && deltaColumna == 1)) {
            return true;
        }

        return false;
    }

    private boolean dentroDelPalacio(int fila, int columna) {
        
        return ((fila >= 0 && fila <= 2 && columna >= 3 && columna <= 5) ||
                (fila >= 7 && fila <= 9 && columna >= 3 && columna <= 5));
    }

    @Override
    public String getNombre() {
        return "General";
    }

    @Override
    public List<int[]> obtenerMovimientosPosibles(int fila, int columna, Ficha[][] tablero) {
        List<int[]> movimientos = new ArrayList<>();
        int[][] posiblesMovimientos = {
            {fila - 1, columna}, {fila + 1, columna}, {fila, columna - 1}, {fila, columna + 1}
        };

        for (int[] mov : posiblesMovimientos) {
            int filaPosible = mov[0];
            int columnaPosible = mov[1];
            if (filaPosible >= 0 && filaPosible < tablero.length && columnaPosible >= 0 && columnaPosible < tablero[0].length) {
                if (dentroDelPalacio(filaPosible, columnaPosible) &&
                    (tablero[filaPosible][columnaPosible] == null || 
                     !tablero[filaPosible][columnaPosible].getPropietario().equals(this.getPropietario()))) {
                    movimientos.add(new int[]{filaPosible, columnaPosible});
                }
            }
        }

        return movimientos;
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
}