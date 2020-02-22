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
public class Curso {
    public void Cur(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del curso:");
        String cur = sc.nextLine();
        System.out.println("Ingrese el numero de creditos:");
        int cre = sc.nextInt();
        
        int hor = cre*3;
        int sem = hor*16;
        
        System.out.println("Las horas de trabajo por semestre sera: "+sem);
    }
}
