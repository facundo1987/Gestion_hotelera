
package com.mycompany.pruebaagostox;
import java.util.Random;
import java.util.Scanner;

public class Pruebaagostox {

    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        int op;
        op=tec.nextInt();
                
        switch (op){
            
            case 1:
        Random random=new Random();
        int x= random.nextInt(101);
        int y= 0;
        System.out.println("x "+x);
        for (int i=0; i<=x;i++){
            int numero = i;
            if (numero % 2 == 0 && numero > y){
                y=numero;
            }
        }
        System.out.println("y "+y);
        break;
            case 2:
                int a =8;
                int b=12;
                int c= a+b;
                while (c>20){
                    c-=2;
                    System.out.println("restando 2");
                    
                }
                System.out.println("c vale "+c);
    }
    }
}
