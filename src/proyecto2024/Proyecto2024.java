/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2024;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 46390835
 */
public class Proyecto2024 {

    public static void main(String[] args) {

        ArrayList<Pasajero> pasajeros = new ArrayList();
        Pasajero huesped_1 = new Pasajero("Facundo", "Bustamante", "Uruguay", 37);
        pasajeros.add(huesped_1);

        Pasajero huesped_2 = new Pasajero("Gonzalo", "Bergessio", "Argentina", 40);
        pasajeros.add(huesped_2);

        Pasajero huesped_3 = new Pasajero("Rosa", "Melano", "Francia", 22);
        pasajeros.add(huesped_3);

        Pasajero huesped_4 = new Pasajero("Sabrina", "Rojas", "Argentina", 44);
        pasajeros.add(huesped_4);

        Pasajero huesped_5 = new Pasajero("Gilberto", "Gil", "Brasil", 82);
        pasajeros.add(huesped_5);

        Scanner input = new Scanner(System.in);
        int opcion;
        int option;
        boolean bandera = false;
        
        while  (true){

        System.out.println("Bienvenido al menu del sistema hotelero ");
        System.out.println("1 ---- Pasajeros");
        System.out.println("2 ---- Habitaciones");
        System.out.println("3 ---- Reservas");
        option = input.nextInt();

        switch (option) {

            case 1:

                System.out.println("1 ---- Ingresar nuevo pasajero");
                System.out.println("2 ---- Consultar pasajero");
                System.out.println("3---- Editar pasajero");
                System.out.println("4 ---- Borrar pasajero");

                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        input.nextLine();
                        System.out.println("Cual es el nombre del pasajero  ");
                        String nombre = input.nextLine();
                        System.out.println("Cual es el apellido del pasajero  ");
                        String apellido = input.nextLine();
                        System.out.println("Ingrese nacionalidad  ");
                        String nacionalidad = input.nextLine();
                        System.out.println("ingrese edad ");
                        int edad = input.nextInt();

                        Pasajero pasajero_nuevo = new Pasajero(nombre, apellido, nacionalidad, edad);

                        pasajeros.add(pasajero_nuevo);

                        System.out.println("Huesped agregado con exito!");

                        break;

                    case 2:

                        System.out.println("Seleccione el apellido del pasajero que desea ver ");
                        input.nextLine();
                        String resp = input.nextLine();
                        int x = 0;

                        if (pasajeros.isEmpty()) {
                            System.out.println("No hay pasajeros ingresados");
                        } else {
                            while (!resp.equalsIgnoreCase(pasajeros.get(x).apellido)) {

                                x++;

                                if (resp.equalsIgnoreCase(pasajeros.get(x).apellido)) {

                                    System.out.println("Nombre:" + " " + pasajeros.get(x).nombre);
                                    System.out.println("Apellido:" + " " + pasajeros.get(x).apellido);
                                    System.out.println("Nacionalidad:" + " " + pasajeros.get(x).nacionalidad);
                                    System.out.println("Edad:" + " " + pasajeros.get(x).edad);

                                }else{
                                
                                System.out.println("Pasajero no encontrado ");
                                }
                            }

                            

                        }

                        break;

                    case 3:

                        System.out.println("Ingrese el apellido del pasajero que desea editar ");
                        input.nextLine();
                        String respuesta_modificar = input.nextLine();
                        int contador = 0;

                        while (!respuesta_modificar.equalsIgnoreCase(pasajeros.get(contador).apellido)) {

                            contador++;
                        }

                        System.out.println("Ingrese el nuevo nombre del pasajero:");
                        String nuevoNombre = input.nextLine();
                        pasajeros.get(contador).setNombre(nuevoNombre);

                        System.out.println("Ingrese el nuevo apellido del pasajero:");
                        String nuevoApellido = input.nextLine();
                        pasajeros.get(contador).setApellido(nuevoApellido);

                        System.out.println("Ingrese la nueva nacionalidad del pasajero:");
                        String nuevaNacionalidad = input.nextLine();
                        pasajeros.get(contador).setNacionalidad(nuevaNacionalidad);

                        System.out.println("Ingrese la nueva edad del pasajero:");
                        int nuevaEdad = input.nextInt();
                        pasajeros.get(contador).setEdad(nuevaEdad);

                        System.out.println("El pasajero ha sido editado con exito.");

                        break;

                    case 4:

                        System.out.println("Seleccione apellido del pasajero que desea borrar ");
                        input.nextLine();
                        String respuesta_eliminar = input.nextLine();
                        int cont = 0;

                        while (!respuesta_eliminar.equalsIgnoreCase(pasajeros.get(cont).apellido)) {
                            cont++;
                        }
                        pasajeros.remove(cont);
                        System.out.println("pasajero eliminado con exito!");

                    default:
                        System.out.println("Ingrese una opcion correcta ");

                        break;
                }
           

              
        }

    }

}
}