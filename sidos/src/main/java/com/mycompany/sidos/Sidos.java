/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sidos;
import java.util.Scanner;
public class Sidos {
    //Metodo discreto
    public static int sumar (int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public static void main(String[] args) {
       
        System.out.print("Hola por favor pone 3 numeros: ");
        Scanner tec = new Scanner(System.in);
        
        int num1= tec.nextInt();
        int num2= tec.nextInt();
        int num3= tec.nextInt();
        int suma= sumar(num1,num2,num3);
        System.out.println("Genial!!! Tu numero es: "+suma);
        
        
    }
}
