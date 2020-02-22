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
public class Facultad {
    
    public void Fac(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la Facultad:");
        String Fac = sc.nextLine();
        Especialidad objEspecialidad = new Especialidad();
        objEspecialidad.Esp();
    }
    
}
