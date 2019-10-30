/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacantantesfamosos;

/**
 *
 * @author lilian
 */
public class CrearCantante {
   private String nombre;
    private String discoMasVendido;

    public CrearCantante() {
        nombre = "";
        discoMasVendido = "";
    }

    public CrearCantante(String nombre, String discoMasVendido) {
        this.nombre = nombre;
        this.discoMasVendido = discoMasVendido;
    }

    public String getDiscoConMasVentas() {
        return discoMasVendido;
    }

    public String getNombre() {
        return nombre;
    }  
}
