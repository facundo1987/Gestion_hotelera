package com.mycompany.si;

import java.util.Scanner;

public class Si {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        // Componentes
        int computadora = 150;
        int impresora = 100;
        int monitor = 50;
        int router = 20;
        int cargador = 10;
        int lampara = 40;
        
        // Variables para zapatilla
        int total = 0;
        int contador = 0;
        int limiteComponentes = 6;  // Limite
        
        // Mensaje de bienvenida
        System.out.println("Bienvenido a mi programa de zapatilla");
        
        // Menú
        System.out.println("\nMenu:");
        System.out.println("1. Computadora (" + computadora + ")");
        System.out.println("2. Impresora (" + impresora + ")");
        System.out.println("3. Monitor (" + monitor + ")");
        System.out.println("4. Router (" + router + ")");
        System.out.println("5. Cargador (" + cargador + ")");
        System.out.println("6. Lampara (" + lampara + ")");
        System.out.println("0. Salir");
        
        while (contador < limiteComponentes) {
            System.out.println("Ingrese el numero del componente que desea sumar (0 para salir): ");
            int opcion = tec.nextInt();
            
            if (opcion == 0) {
                System.out.println("Saliendo del programa.");
                break;
            }
            
            System.out.println("Ingrese la cantidad que desea sumar: ");
            int cantidad = tec.nextInt();
            
            if (cantidad + contador > limiteComponentes) {
                System.out.println("No quedan mas conectores en la zapatilla" + (limiteComponentes - contador) + " componentes mas.");
                continue;
            }
            
            switch (opcion) {
                case 1:
                    total += computadora * cantidad;
                    contador += cantidad;
                    System.out.println("Se ha conectado " + cantidad + " computadoras.");
                    break;
                case 2:
                    total += impresora * cantidad;
                    contador += cantidad;
                    System.out.println("Se ha conectado" + cantidad + " impresoras.");
                    break;
                case 3:
                    total += monitor * cantidad;
                    contador += cantidad;
                    System.out.println("Se ha conectado" + cantidad + " monitores.");
                    break;
                case 4:
                    total += router * cantidad;
                    contador += cantidad;
                    System.out.println("Se ha conectado" + cantidad + " routers.");
                    break;
                case 5:
                    total += cargador * cantidad;
                    contador += cantidad;
                    System.out.println("Se ha conectado" + cantidad + " cargadores.");
                    break;
                case 6:
                    total += lampara * cantidad;
                    contador += cantidad;
                    System.out.println("Se ha conectado " + cantidad + " lamparas.");
                    break;
                default:
                    System.out.println("Opcion no valida. Ingrese una opcion valida del menu.");
                    break;
            }
            
            System.out.println("La conexion en total es: " + total);
            System.out.println("Ha conectado " + contador + " de " + limiteComponentes + " componentes permitidos.");
        }
        
        // Mostrar el total final
        System.out.println("La conexion en total es: " + total);
        
        tec.close();
    }
}

