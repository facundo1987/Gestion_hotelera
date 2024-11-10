
package com.mycompany.trabajojedi;
import java.util.Scanner;



public class TrabajoJedi {

    public static void main(String[] args) {
        System.out.print("Veces que dese entrenar: ");
        Scanner tec= new Scanner(System.in);
         int obj = tec.nextInt();
         EntrenamientoJedi.entrenamiento(obj);
         
         System.out.println("Busque planetas habitables");
         Scanner tec2=new Scanner(System.in);
         String respuesta;
         int habitable=0, contadorNoHab=0;
         do{
            contadorNoHab=EntrenamientoJedi.exploGalax();//no se que pasa
            System.out.println("desea seguir buscando? ");
            respuesta=tec2.next().toLowerCase();
         }while (respuesta.equals("si"));
         System.out.println("fin de la exploracion planetas habitables: "+habitables + "No habitables"+contadorNoHab);
         
         
          
         
        
        
        
        
    }
}
