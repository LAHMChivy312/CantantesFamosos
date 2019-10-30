/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacantantesfamosos;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lilian
 */
public class ListaCantantesFamosos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 String cantante, disco;
        ListaCantantesFamosos listacantate = new ListaCantantesFamosos();
        IngresaCantante entrada = new IngresaCantante();

        CrearCantante cantante1 = new CrearCantante("Marcos Antonio", "Navidad sin ti");//los datos no son reales
        CrearCantante cantante2 = new CrearCantante("Enrique Iglesia", "Si tu te va");
        listacantate.AgregarCrearCantante(cantante1);
        listacantate.AgregarCrearCantante(cantante2);

        System.out.println("La lista contiene los siguientes datos: ");
        listacantate.listarCantanteFamoso();
        String continuar = new String();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese nombre de un cantante: ");
            cantante = entrada.AgregarCantante();
            System.out.println("Ingrese su disco mas vendido: ");
            disco = entrada.AgregarCantante();
            listacantate.AgregarCrearCantante(new CrearCantante(cantante, disco));
            System.out.println("La lista contiene los siguientes datos: ");
            List.listaCantantes();
            System.out.println("¿Deseas agregar otro cantante y su disco (S/N)?");
            continuar = sc.nextLine();
        } while (continuar.equalsIgnoreCase("s"));
    }    

    private void AgregarCrearCantante(CrearCantante cantante1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void listarCantanteFamoso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}