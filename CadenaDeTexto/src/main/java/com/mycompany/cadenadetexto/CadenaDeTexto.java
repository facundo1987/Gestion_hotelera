
package com.mycompany.cadenadetexto;
import java.util.Scanner;

public class CadenaDeTexto {

    public static void main(String[] args) {
        System.out.println("que programa desea utilizar?");
        System.out.println("-primero : Metodo java charAt() 1");
        System.out.println("-segundo : Metodo java charAt() 2");
        System.out.println("-tercero : Cadena de texto length");
        System.out.println("-cuarto : Cadena de texto toUpeerCase");
        System.out.println("-cinco : Concatenacion de cadenas");
        
        System.out.print("opcion:");
        Scanner tec=new Scanner(System.in);
        String opcion=tec.next();
        switch (opcion.toLowerCase()) {
            
            case "primero":
                
                char letra;
                Scanner entrada=new Scanner(System.in);
                System.out.print("ingrese 3 letras por favor: ");
                letra=entrada.next().charAt(0);
                System.out.println("muestra la primera letra charAt 0 ");
                System.out.println("y salio: "+letra );
                //esto hace que charAt(0) libere la primera letra
                break;
            case "segundo":
                System.out.println("escribir algo: ");
                Scanner tec2=new Scanner(System.in);
                String algo=tec2.next();
                char resultado=algo.charAt(1);
                System.out.println("muestra la segunda letra: "+resultado);
                break;
            
            case "tercero":
                System.out.println("Esto es solo un ejemplo de como se ejecuta");
                // aca comienza el codigo dado en clase
                String txt = "abcdefghijklmnopqrstuvwxyz"; // en total hay 26 cifras 
                    System.out.println("the length of the txt string is "+txt.length());
                    System.out.println("en total tendria que haber 26 cifras");
                break;
            case "cuarto":
                System.out.println("muestra las dos posibilidades de toUpeerCase y toLowerCase");
                
                String text ="Hello World"; 
                    System.out.println(text.toUpperCase()); // HELLO WORLD 
                    System.out.println(text.toLowerCase()); // hello world 
                break;
            case "cinco":
                System.out.println("Concatenacion de cadenas");
                
                    String firstName = "john "; 
                    String lastName =  "Doe"; 
                    System.out.println(firstName+""+lastName);    
                
                
            }
        }
            
                

    }

