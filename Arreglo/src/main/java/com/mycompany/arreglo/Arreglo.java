
package com.mycompany.arreglo;
import java.util.Scanner;


public class Arreglo {

    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);//opciones
        Scanner tec1=new Scanner(System.in);
        int opcion;//menu
        int num[]=new int[3];//numero program 1//
        
        System.out.println("opciones:");
        System.out.println("1, 2.");
        opcion=tec.nextInt();
        switch (opcion){
            case 1:
                
                System.out.print("ingrese un numero");
                for (int i=0; i<3;i++){

                    num[i]=tec.nextInt();
                    System.out.println("numero: "+(i+1)+" es: "+num[i]);
                    if(num[0]<num[1]){
                        if (num[1]<num[2]){
                            System.out.println("es acendente: ");    
                        }
                        
                    }
                    if(num[0]>num[1]){
                        if (num[1]>num[2]){
                            System.out.println("es decendente: ");    
                        }
                        
                    }
                    
                    
                    

                }
                
                
        }
                
                    
        System.out.println("no es nada");
    }
}
