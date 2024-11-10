
package com.mycompany.arrays2;
import java.util.Scanner;


public class Arrays2 {

    public static void main(String[] args) {
            //Variables://
                int num[]=new int[10];
                int usu;
                Scanner tec1=new Scanner(System.in);
                Scanner tec2=new Scanner(System.in);
                Scanner tec3=new Scanner(System.in);
                
                
                
                
                    
                
                System.out.println("2 - Mostrar todos los numeros.");
                System.out.println("3 - Mostrar posicion deseada.");
                System.out.println("4 - Mostrar todos los numeros multiplos de 4.");
                System.out.println("5 - Salir ");
                
                System.out.print("Opcion: ");
                usu=tec2.nextInt();
                while(usu!=0){
                    
                switch (usu){
                    case 1:
                        
                        System.out.println("por favor ingresar 10 numeros");
                            for (int i=0;i<10;i++){
                                System.out.print("numero: "+(i+1)+": ");
                                num[i]=tec1.nextInt();
                    }
                    
                    case 2:
                        for (int i=0;i<10;i++){
                            System.out.println("numero "+(i+1)+" es: "+num[i]);
                        }
                        break;
                        
                    case 3:
                        
                        int pos; //variable posicion para que se pueda mostrar opcion seleccionada por el usu
                        String op;
                        System.out.print("dese ver alguna posicion en especifico? si / no : ");
                        op=tec3.next();

                        if (op.equalsIgnoreCase("si")){
                            System.out.print("Cual: ");
                            pos=tec3.nextInt();
                            System.out.println("Selecciono el numero: "+num[pos]);
                        }
                        break;
                    case 4:
                        System.out.print("todos los numeros multiplos de 4: ");
                        for (int i = 0; i < num.length; i++) {
                            if (num[i] % 4 == 0) {
                            System.out.print(num[i]+" . ");
                            }
                        }
                        
                
                
                    
                }
                break;
                
                
                
        }
        System.out.println("Gracias por usar el programa");
             
    }
}
                
