package proyecto1_juniornuñez;

import java.util.ArrayList;
import java.util.List;

public class Oficial extends Ficha {
    public Oficial(String propietario) {
        super(propietario);
    }

    @Override
    public boolean mover(int filaInicial, int columnaInicial, int filaFinal, int columnaFinal, Ficha[][] tablero) {
        int deltaFila = Math.abs(filaFinal - filaInicial);
        int deltaColumna = Math.abs(columnaFinal - columnaInicial);

        if (deltaFila == 1 && deltaColumna == 1 && dentroDelPalacio(filaFinal, columnaFinal)) {
            return tablero[filaFinal][columnaFinal] == null || 
                   !tablero[filaFinal][columnaFinal].getPropietario().equals(this.getPropietario());
        }

        return false;
    }

    private boolean dentroDelPalacio(int fila, int columna) {
        
        return ((fila >= 0 && fila <= 2 && columna >= 3 && columna <= 5) ||
                (fila >= 7 && fila <= 9 && columna >= 3 && columna <= 5));
    }

    @Override
    public String getNombre() {
        return "Oficial";
    }

    @Override
    public List<int[]> obtenerMovimientosPosibles(int fila, int columna, Ficha[][] tablero) {
        List<int[]> movimientos = new ArrayList<>();
        int[][] posiblesMovimientos = {
            {fila - 1, columna - 1}, {fila - 1, columna + 1},
            {fila + 1, columna - 1}, {fila + 1, columna + 1}
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
}