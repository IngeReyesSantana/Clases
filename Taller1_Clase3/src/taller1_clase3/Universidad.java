/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1_clase3;

import java.util.Scanner;

/**
 *
 * @author BOG-A308-E-007
 */
public class Universidad {
    
    public void Uni(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el nombre de la Universidad: ");
            String Uni = sc.nextLine();
            Facultad objFacultad = new Facultad();
            objFacultad.Fac();
    }
}
