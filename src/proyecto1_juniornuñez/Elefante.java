package proyecto1_juniornuñez;

import java.util.ArrayList;
import java.util.List;

public class Elefante extends Ficha {

    public Elefante(String propietario) {
        super(propietario);
    }

    @Override
    public boolean mover(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino, Ficha[][] tablero) {
        
        if ((filaOrigen < 5 && filaDestino >= 5) || (filaOrigen >= 5 && filaDestino < 5)) {
            
            return false;
        }

        
        int diffFila = Math.abs(filaDestino - filaOrigen);
        int diffColumna = Math.abs(columnaDestino - columnaOrigen);
        
      
        if (diffFila == 2 && diffColumna == 2) {
           
            if (tablero[filaDestino][columnaDestino] == null ||
                !tablero[filaDestino][columnaDestino].getPropietario().equals(this.getPropietario())) {
                return true;
            }
        }
        
        return false;
    }

    @Override
    public List<int[]> obtenerMovimientosPosibles(int fila, int columna, Ficha[][] tablero) {
        List<int[]> movimientos = new ArrayList<>();
        
        int[][] direcciones = {{2, 2}, {2, -2}, {-2, 2}, {-2, -2}};
        for (int[] dir : direcciones) {
            int nuevaFila = fila + dir[0];
            int nuevaColumna = columna + dir[1];
            if (nuevaFila >= 0 && nuevaFila < tablero.length && nuevaColumna >= 0 && nuevaColumna < tablero[0].length) {
               
                if ((fila < 5 && nuevaFila < 5) || (fila >= 5 && nuevaFila >= 5)) {
                    if (tablero[nuevaFila][nuevaColumna] == null || 
                        !tablero[nuevaFila][nuevaColumna].getPropietario().equals(this.getPropietario())) {
                        movimientos.add(new int[]{nuevaFila, nuevaColumna});
                    }
                }
            }
        }
        return movimientos;
    }

    @Override
    public String getNombre() {
        return "Elefante";
    }
}