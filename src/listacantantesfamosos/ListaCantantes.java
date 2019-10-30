/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacantantesfamosos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author lilian
 */
public class ListaCantantes {
   
    ArrayList<CrearCantante> cantantes;

    public ListaCantantes() {
        cantantes = new <CrearCantante> ArrayList();
    }

    public void AgregarCantanteFamoso(CrearCantante Cantante) {
        cantantes.add(Cantante);
    }

    public void listarCantanteFamoso() {
        CrearCantante cantante;
        Iterator<CrearCantante> continuar = cantantes.iterator();
        while (continuar.hasNext()) {
            cantante = continuar.next();
            System.out.print("Cantante: " + cantante.getNombre());
            System.out.println("        Discos con mas ventas: " + cantante.getDiscoConMasVentas());
        }
    } 
}
