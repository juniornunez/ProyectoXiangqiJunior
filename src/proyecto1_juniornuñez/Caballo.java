
    
package proyecto1_juniornuñez;

import java.util.ArrayList;
import java.util.List;

public class Caballo extends Ficha {
    public Caballo(String propietario) {
        super(propietario);
    }

    @Override
    public boolean mover(int filaInicial, int columnaInicial, int filaFinal, int columnaFinal) {
        int deltaFila = Math.abs(filaFinal - filaInicial);
        int deltaColumna = Math.abs(columnaFinal - columnaInicial);
        return (deltaFila == 2 && deltaColumna == 1) || (deltaFila == 1 && deltaColumna == 2);
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
                if (tablero[filaPosible][columnaPosible] == null || 
                    !tablero[filaPosible][columnaPosible].getPropietario().equals(this.getPropietario())) {
                    movimientos.add(new int[]{filaPosible, columnaPosible});
                }
            }
        }

        return movimientos;
    }
}