
package com.mycompany.forclass2;
import java.util.Scanner;


public class ForClass2 {

    public static void main(String[] args) {
        int num, pares=0, impares=0;
        Scanner tec=new Scanner(System.in);
        System.out.print("por favor ingrese un numero: ");
        num=tec.nextInt();

            
        for (int i=2;i<=num;i++){
            
            System.out.println("algo "+i);
        }
        
        
        
    }
}
