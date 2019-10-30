/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacantantesfamosos;

import java.util.Scanner;

/**
 *
 * @author lilian
 */
public class IngresaCantante {
      private String entradaTeclado;
    Scanner sc = new Scanner(System.in);

    public IngresaCantante() {
        entradaTeclado = "";
    }

    public String AgregarCantante() {
        entradaTeclado = sc.nextLine();
        return entradaTeclado;
    }
    public String getEntrada() {
        return entradaTeclado;
    }
}
