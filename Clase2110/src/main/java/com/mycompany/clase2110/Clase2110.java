
package com.mycompany.clase2110;
import java.util.Scanner;


public class Clase2110 {

    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        //declaramos array//
        Alumno[] ml= new Alumno[3];
        //hacemos variables//
        String nombre, apellido;
        int ci, fdn;
        //empezamos codigo//
        for (int i=0;i<ml.length;i++){
            System.out.println("Alumno "+i);
            System.out.print("Ingrese nombre: ");
            nombre=tec.next();
            System.out.print("Ingrese apellido: ");
            apellido=tec.next();
            System.out.print("Ingrese CI: ");
            ci=tec.nextInt();
            System.out.println("Ingrese fecha de nacimiento: ");
            fdn=tec.nextInt();

            ml[0]=new Alumno(nombre,apellido,ci,fdn);
            
        }
        for (int i=0;i<ml.length;i++){
            
        System.out.println("Alumno "+i);
        System.out.println(ml[0].getnombre());
        System.out.println(ml[0].getapellido());
        System.out.println(ml[0].getci());
        System.out.println(ml[0].getfdn());
        }
        
        
    }
}
