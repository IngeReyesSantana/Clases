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
public class Estudiante {
    
    public void Est(){
        String nam, age, cou;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante:");
        nam = sc.nextLine();
        System.out.println("Ingrese la edad del Estudiante");
        age = sc.nextLine();
        System.out.println("Ciudad de Nacimiento:");
        cou = sc.nextLine();
    }
    
}
