
package com.mycompany.ifanidado;

import java.util.Scanner;

public class Ifanidado {
//Ej 1 numeros enteros.    
//haciendo ejercicio de numeros par e impar, positivo y negativo
    
    public static void main(String[] args) {
        System.out.println("por favor ingresar un numero: ");
        
        Scanner tec= new Scanner(System.in);
        double oP;
        oP=tec.nextInt();
        if(oP==0){
            System.out.println("tu numero es: "+oP);
        }
        if (oP>=0){
            System.out.print("tu numero es positivo");
            if(oP%2==0){
                System.out.println(" y es par: "+oP);
            } else{
                System.out.println(" y es impar: "+oP);
            }
        if (oP<=0){
            System.out.println("tu numero es negativo: "+oP);
            
            
        }
        }

    }
}
