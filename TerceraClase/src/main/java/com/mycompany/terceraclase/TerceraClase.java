/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.terceraclase;
import java.util.Scanner;

public class TerceraClase {

    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        
        System.out.println("Poner nombre");
        String nombre=tec.nextLine();
        System.out.println("Poner edad");
        int edad= tec.nextInt();
        System.out.println("Poner altura");
        double altura=tec.nextDouble();
        
        System.out.println("Su nombre es: "+nombre+ " Su edad es: "+edad+ " Su altura es: "+altura);
    }
}
