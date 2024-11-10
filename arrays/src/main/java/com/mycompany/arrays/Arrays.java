
package com.mycompany.arrays;
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        System.out.println("poner ejercicio que quiera:");
        System.out.println("primero");
        System.out.println("segundo");
        
        System.out.print("opcion: ");
        Scanner tec=new Scanner(System.in);
        String opcion=tec.next();
        
        switch (opcion.toLowerCase()){
            case "primero":

                Scanner tec2=new Scanner(System.in);
                int altura[]=new int[10];
                for (int i=0; i<10;i++){
                    System.out.println("altura numero:"+ (i+1));
                    altura[i]=tec2.nextInt();
                }
                for (int i=0; i<10;i++){
                System.out.println("altura numero "+(i+1)+ " Es: "+altura[i]);
                }
                
            case "segundo":
                Scanner tec3=new Scanner(System.in);
                int num;
                System.out.print("ingrese numeros: ");
                num=tec3.nextInt();
                for (int i=0;i==0;i++){
                    System.out.print("numero: " +(i+1)+" ponga otro:");
                    num=tec3.nextInt();
                }
                for (int i=0;i==0;i++){
                System.out.println("sus numeros son: "+num );
                }
        }

    }
}


