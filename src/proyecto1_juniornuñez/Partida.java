/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1_juniornuñez;

import java.util.Date;

/**
 *
 * @author Junior Nuñes
 */
public class Partida {
     private String oponente;
    private String resultado;
    private Date fecha;

    public Partida(String oponente, String resultado, Date fecha) {
        this.oponente = oponente;
        this.resultado = resultado;
        this.fecha = fecha;
    }

    public String getOponente() {
        return oponente;
    }

    public String getResultado() {
        return resultado;
    }

    public Date getFecha() {
        return fecha;
    }
}
