
package com.mycompany.pruebaagosto;
import java.util.Scanner;

public class PruebaAgosto {

    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        int temp[]=new int[10];
        boolean hayneg= false;
        boolean haycero= false;
        
        System.out.println("ingresar 10 temperaturas");
        for (int i=0 ; i<10 ; i++ ){
            System.out.print("temperatura: ");
            temp[i]=tec.nextInt();

            if (temp[i]<0){
               hayneg=true;    
            }
            if (temp[i]==0){
                haycero=true;
            }

        }//Fin del for//
        
        if (hayneg){
            System.out.println("Hay uno o mas sensores reportando temperaturas bajo cero");
        }
        if (haycero){
            System.out.println("Hay al menos un sensor que no esta funcionando correctamente");
        
        }
        if (!hayneg && !haycero){
            System.out.println("Todos los sensores estan reportando temperaturas positivas ");
            
        }
        System.out.print("Todas las temperaturas: ");
        for (int i=0; i<10;i++){ //muestra todos los numeros del array
            System.out.print(+temp[i]+" , ");
        }
        
    }
}
