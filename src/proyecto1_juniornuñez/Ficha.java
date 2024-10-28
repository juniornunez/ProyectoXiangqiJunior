

package proyecto1_juniornuñez;

import java.util.List;

public abstract class Ficha {
    private String propietario;

    public Ficha(String propietario) {
        this.propietario = propietario;
    }

    public String getPropietario() {
        return propietario;
    }

    public abstract boolean mover(int filaInicial, int columnaInicial, int filaFinal, int columnaFinal);

    public abstract String getNombre();

    public abstract List<int[]> obtenerMovimientosPosibles(int fila, int columna, Ficha[][] tablero);
}