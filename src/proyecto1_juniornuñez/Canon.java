package proyecto1_juniornuñez;

import java.util.ArrayList;
import java.util.List;

public class Canon extends Ficha {
    public Canon(String propietario) {
        super(propietario);
    }

    @Override
    public boolean mover(int filaInicial, int columnaInicial, int filaFinal, int columnaFinal, Ficha[][] tablero) {
        
        if (filaInicial != filaFinal && columnaInicial != columnaFinal) {
            return false; 
        }

        int stepFila = Integer.signum(filaFinal - filaInicial);
        int stepColumna = Integer.signum(columnaFinal - columnaInicial);
        int filaActual = filaInicial + stepFila;
        int columnaActual = columnaInicial + stepColumna;
        int piezasIntermedias = 0;

        
        while (filaActual != filaFinal || columnaActual != columnaFinal) {
            if (tablero[filaActual][columnaActual] != null) {
                piezasIntermedias++;
            }
            filaActual += stepFila;
            columnaActual += stepColumna;
        }

        if (tablero[filaFinal][columnaFinal] == null) {
          
            return piezasIntermedias == 0;
        } else {
            
            return piezasIntermedias == 1 && !tablero[filaFinal][columnaFinal].getPropietario().equals(this.getPropietario());
        }
    }

    @Override
    public String getNombre() {
        return "Canon";
    }

    @Override
    public List<int[]> obtenerMovimientosPosibles(int fila, int columna, Ficha[][] tablero) {
        List<int[]> movimientos = new ArrayList<>();
        int[][] direcciones = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        for (int[] direccion : direcciones) {
            int filaActual = fila + direccion[0];
            int columnaActual = columna + direccion[1];
            boolean piezaIntermediaEncontrada = false;

            while (filaActual >= 0 && filaActual < tablero.length && columnaActual >= 0 && columnaActual < tablero[0].length) {
                if (tablero[filaActual][columnaActual] == null) {
                    if (!piezaIntermediaEncontrada) {
                        movimientos.add(new int[]{filaActual, columnaActual});
                    }
                } else {
                    if (!piezaIntermediaEncontrada) {
                        
                        piezaIntermediaEncontrada = true;
                    } else {
                        
                        if (!tablero[filaActual][columnaActual].getPropietario().equals(this.getPropietario())) {
                            movimientos.add(new int[]{filaActual, columnaActual});
                        }
                        break;
                    }
                }
                filaActual += direccion[0];
                columnaActual += direccion[1];
            }
        }

        return movimientos;
    }
}
