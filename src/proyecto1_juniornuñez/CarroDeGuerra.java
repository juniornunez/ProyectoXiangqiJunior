package proyecto1_juniornuñez;

import java.util.ArrayList;
import java.util.List;

public class CarroDeGuerra extends Ficha {
    public CarroDeGuerra(String propietario) {
        super(propietario);
    }

    @Override
    public boolean mover(int filaInicial, int columnaInicial, int filaFinal, int columnaFinal, Ficha[][] tablero) {
        
        if (filaInicial == filaFinal || columnaInicial == columnaFinal) {
           
            int deltaFila = Integer.signum(filaFinal - filaInicial);
            int deltaColumna = Integer.signum(columnaFinal - columnaInicial);
            
            int filaActual = filaInicial + deltaFila;
            int columnaActual = columnaInicial + deltaColumna;
            
            while (filaActual != filaFinal || columnaActual != columnaFinal) {
                if (tablero[filaActual][columnaActual] != null) {
                    return false; 
                }
                filaActual += deltaFila;
                columnaActual += deltaColumna;
            }
            
            
            return tablero[filaFinal][columnaFinal] == null || 
                   !tablero[filaFinal][columnaFinal].getPropietario().equals(this.getPropietario());
        }
        return false;
    }

    @Override
    public String getNombre() {
        return "CarroDeGuerra";
    }

    @Override
    public List<int[]> obtenerMovimientosPosibles(int fila, int columna, Ficha[][] tablero) {
        List<int[]> movimientos = new ArrayList<>();
        
       
        int[][] direcciones = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        for (int[] direccion : direcciones) {
            int filaActual = fila + direccion[0];
            int columnaActual = columna + direccion[1];
            
            while (filaActual >= 0 && filaActual < tablero.length && columnaActual >= 0 && columnaActual < tablero[0].length) {
                if (tablero[filaActual][columnaActual] == null) {
                    movimientos.add(new int[]{filaActual, columnaActual});
                } else {
                    
                    if (!tablero[filaActual][columnaActual].getPropietario().equals(this.getPropietario())) {
                        movimientos.add(new int[]{filaActual, columnaActual});
                    }
                    break; 
                }
                filaActual += direccion[0];
                columnaActual += direccion[1];
            }
        }
        
        return movimientos;
    }
}