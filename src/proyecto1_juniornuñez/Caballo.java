
  package proyecto1_juniornuñez;

import java.util.ArrayList;
import java.util.List;

public class Caballo extends Ficha {
    public Caballo(String propietario) {
        super(propietario);
    }

    @Override
    public boolean mover(int filaInicial, int columnaInicial, int filaFinal, int columnaFinal, Ficha[][] tablero) {
        int deltaFila = Math.abs(filaFinal - filaInicial);
        int deltaColumna = Math.abs(columnaFinal - columnaInicial);

        if ((deltaFila == 2 && deltaColumna == 1) || (deltaFila == 1 && deltaColumna == 2)) {
            int bloqueoFila = (deltaFila == 2) ? filaInicial + (filaFinal - filaInicial) / 2 : filaInicial;
            int bloqueoColumna = (deltaColumna == 2) ? columnaInicial + (columnaFinal - columnaInicial) / 2 : columnaInicial;

            if (tablero[bloqueoFila][bloqueoColumna] == null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getNombre() {
        return "Caballo";
    }

    @Override
    public List<int[]> obtenerMovimientosPosibles(int fila, int columna, Ficha[][] tablero) {
        List<int[]> movimientos = new ArrayList<>();
        int[][] posiblesMovimientos = {
            {fila - 2, columna - 1}, {fila - 2, columna + 1}, {fila + 2, columna - 1}, {fila + 2, columna + 1},
            {fila - 1, columna - 2}, {fila - 1, columna + 2}, {fila + 1, columna - 2}, {fila + 1, columna + 2}
        };

        for (int[] mov : posiblesMovimientos) {
            int filaPosible = mov[0];
            int columnaPosible = mov[1];
            if (filaPosible >= 0 && filaPosible < tablero.length && columnaPosible >= 0 && columnaPosible < tablero[0].length) {
                int deltaFila = Math.abs(filaPosible - fila);
                int deltaColumna = Math.abs(columnaPosible - columna);

                int bloqueoFila = (deltaFila == 2) ? fila + (filaPosible - fila) / 2 : fila;
                int bloqueoColumna = (deltaColumna == 2) ? columna + (columnaPosible - columna) / 2 : columna;

                if ((tablero[bloqueoFila][bloqueoColumna] == null) && 
                    (tablero[filaPosible][columnaPosible] == null || 
                    !tablero[filaPosible][columnaPosible].getPropietario().equals(this.getPropietario()))) {
                    movimientos.add(new int[]{filaPosible, columnaPosible});
                }
            }
        }

        return movimientos;
    }
}