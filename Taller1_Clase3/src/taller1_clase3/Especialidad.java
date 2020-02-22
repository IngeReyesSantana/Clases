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
public class Especialidad {
    
    public void Esp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la Especialidad:");
        String Esp = sc.nextLine();
        Curso objCurso = new Curso();
        objCurso.Cur();
    }
}
