
package com.mycompany.switchclase;

import java.util.Scanner;

public class SwitchClase {

    public static void main(String[] args) {
            System.out.println("que ejercicio quiere hacer?");
            System.out.println("primero");
            System.out.println("segundo");
            System.out.println("tercero");

    Scanner tec =new Scanner(System.in);
    String opcion=tec.next();


        switch (opcion.toLowerCase()) {
            
            case "primero":
                System.out.println("por favor pon un numero");
                Scanner tec1=new Scanner(System.in);
                int num1=tec1.nextInt();
                System.out.print("tu numero es: "+num1);
                 //par y positivo
                    if ((num1%2)==0){
                        
                        System.out.print(" el numero es par");
                    
                        if (num1>0){
                        System.out.println(" y positivo");
                            }
                        if (num1<0){
                        System.out.println(" y negativo");
                            
                        }

                } else {
                        System.out.print(" el numero es inpar");
                        if (num1>0){
                            System.out.print(" y positivo");
                        }
                        if (num1<0){
                            System.out.print(" y negativo");
                        }
                    }
                
                break;
            case "segundo":
                System.out.print("Por favor ingresar su contraseña: ");
                Scanner tec2=new Scanner(System.in);
                int contra=159951;
                contra=tec2.nextInt();
                while (contra!=159951){
                    System.out.println("Contraseña incorrecta");
                    System.out.print("intente de nuevo porfavor: ");
                    contra=tec2.nextInt();
                }
                if (contra==159951){
                    System.out.println("correcto");
                    System.out.print("ingrese el valor que tiene en su banco: ");
                    int saldo;
                    
                    Scanner tec3=new Scanner(System.in);
                    saldo=tec3.nextInt();
                    
                    while (saldo<=0){
                        System.out.println("por favor ingrese un numero valido");
                        saldo=tec3.nextInt();
                    }
                    if (saldo>=0){
                        System.out.println("Cuanto desea retirar de su cuenta");
                        Scanner tec4=new Scanner(System.in);
                        int retiro=tec4.nextInt();
                        while (retiro>saldo){
                            System.out.println("no es posible realizar el retiro, intente con otra cifra: ");
                            retiro=tec4.nextInt();
                        }
                        if(retiro<saldo){
                            System.out.println("se desconto "+retiro +" de su cuenta");
                        }
                    }
                 
                System.out.println("tu saldo en el banco es de: " );//no se porque no me deja hacer +saldo-retiro
                
                }
            default:

           
            } 

        }

    
    }


