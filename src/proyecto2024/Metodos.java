package proyecto2024;

import java.util.*;
import java.util.Random;

public class Metodos {
    
    
    // Joptionpane.showinputdialog
    //Msj para menu general de gestiones
    // probando git nnnnnn
    public static void panelGestionGeneral() {
        System.out.println("Bienvenido al menu general del sistema hotelero ");
        System.out.println("1 ---- Pasajeros");
        System.out.println("2 ---- Habitaciones");
        System.out.println("3 ---- Reservas");
        System.out.println("4 ---- Salir");
    }

    public static void panelPasajeros() {
        System.out.println("1 ---- Ingresar nuevo pasajero");
        System.out.println("2 ---- Consultar pasajero");
        System.out.println("3---- Editar pasajero");
        System.out.println("4 ---- Borrar pasajero");
    }
    
      public static void panelHabitaciones() {
        System.out.println("1 ---- Crear nuevo habitacion");
        System.out.println("2 ---- Ver habitacion");
        System.out.println("3---- Editar habitacion");
        System.out.println("4 ---- Borrar habitacion");
    }
    //metodos de la clase pasajero

    public static Pasajero ingresarPasajero() {
        Scanner input = new Scanner(System.in);
        System.out.println("Cual es el nombre del pasajero  ");
        String nombre = input.nextLine();
        System.out.println("Cual es el apellido del pasajero  ");
        String apellido = input.nextLine();
        System.out.println("ingrese dni ");
        int dni = input.nextInt();
        System.out.println("Ingrese nacionalidad  ");
        String nacionalidad = input.nextLine();
        input.nextLine();
        System.out.println("ingrese edad ");
        int edad = input.nextInt();

        Pasajero pasajero_nuevo = new Pasajero(nombre, apellido,dni, nacionalidad, edad);

        return pasajero_nuevo;
    }

    public static void consultaPasajero(ArrayList<Pasajero> pasajeros) {
        Scanner input = new Scanner(System.in);
        System.out.println("Seleccione el dni del pasajero que desea ver ");
        int resp = input.nextInt();
        int x = 0;

        if (pasajeros.isEmpty()) {
            System.out.println("No hay pasajeros ingresados en el sistema");
        } else {
            while (resp != pasajeros.get(x).dni) {

                x++;

                if (resp == pasajeros.get(x).dni){

                    System.out.println("Nombre:" + " " + pasajeros.get(x).nombre);
                    System.out.println("Apellido:" + " " + pasajeros.get(x).apellido);
                    System.out.println("Dni:" + " " + pasajeros.get(x).dni);
                    System.out.println("Nacionalidad:" + " " + pasajeros.get(x).nacionalidad);
                    System.out.println("Edad:" + " " + pasajeros.get(x).edad);

                } else {

                    System.out.println("Pasajero no encontrado ");
                }
            }

        }

    }

    public static void editarPasajero(ArrayList<Pasajero> pasajeros) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el dni del pasajero que desea editar: ");
        
        int respuesta_modificar = input.nextInt();
        int contador = 0;

        while (respuesta_modificar != pasajeros.get(contador).dni) {

            contador++;
        }
        if (contador < pasajeros.size()) {

            System.out.println("Ingrese el nuevo nombre del pasajero:");
            String nuevoNombre = input.nextLine();
            pasajeros.get(contador).setNombre(nuevoNombre);
            input.nextLine();

            System.out.println("Ingrese el nuevo apellido del pasajero:");
            String nuevoApellido = input.nextLine();
            pasajeros.get(contador).setApellido(nuevoApellido);
            
            System.out.println("Ingrese el nuevo dni del pasajero:");
            int nuevoDni = input.nextInt();
            pasajeros.get(contador).setApellido(nuevoApellido);

            System.out.println("Ingrese la nueva nacionalidad del pasajero:");
            String nuevaNacionalidad = input.nextLine();
            pasajeros.get(contador).setNacionalidad(nuevaNacionalidad);
            input.nextLine();
            
            System.out.println("Ingrese la nueva edad del pasajero:");
            int nuevaEdad = input.nextInt();
            pasajeros.get(contador).setEdad(nuevaEdad);

            System.out.println("El pasajero ha sido editado con exito.");

        } else {
            System.out.println("El pasajero consultado no se encontro en la base");
        }
    }

    public static int eliminarPasajero(ArrayList<Pasajero> pasajeros) {
        Scanner input = new Scanner(System.in);
        System.out.println("Seleccione dni del pasajero que desea borrar ");
        int respuesta_eliminar = input.nextInt();
        int cont = 0;

        while (respuesta_eliminar != pasajeros.get(cont).dni) {
            cont++;
        }
        if (cont<pasajeros.size()){
            System.out.println("Pasajero eliminado con exito!");
        }else{
            System.out.println("Este pasajero no se existe en la base, no hay datos para eliminar");
        }
        return cont;
    }
    
    // CRUD de habitacion
    
    public static Habitacion nuevaHabitacion(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tipo de habitacion ");
        String tipo_habitacion = input.nextLine();
        System.out.println("Ingrese el numero de habitacion ");
        int numero_habitacion = input.nextInt();
        System.out.println("Seleccione la tarifa ");
        double tarifa = input.nextDouble();
        
        Habitacion habitacion_nueva = new Habitacion (tipo_habitacion, numero_habitacion, tarifa);
        
        return habitacion_nueva;
        
    }
    
      public static void consultaHabitacion(ArrayList<Habitacion> habitaciones) {
        Scanner input = new Scanner(System.in);
        System.out.println("Seleccione el numero de habitacion que desea ver ");
        int resp = input.nextInt();
        int x = 0;

        if (habitaciones.isEmpty()) {
            System.out.println("No hay habitaciones ingresadas en el sistema");
        } else {
            while (resp != habitaciones.get(x).numero_habitacion) {

                x++;

                if (resp == habitaciones.get(x).numero_habitacion){

                    System.out.println("Tipo de habitacion:" + " " + habitaciones.get(x).tipo_habitacion);
                    System.out.println("Numero de habitacion:" + " " + habitaciones.get(x).numero_habitacion);
                    System.out.println("Tarifa:" + " " + habitaciones.get(x).tarifa);

                } else {

                    System.out.println("Habitacion no encontrada ");
                }
            }

        }

    }
      
      public static void editarHabitacion(ArrayList<Habitacion> habitaciones) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero de habitacion que desea editar: ");
        
        int respuesta_modificar = input.nextInt();
        int contador = 0;

        while (respuesta_modificar != habitaciones.get(contador).numero_habitacion) {

            contador++;
        }
        if (contador < habitaciones.size()) {


            System.out.println("Ingrese el nuevo tipo de habitacion: ");
            String nuevo_tipo = input.nextLine();
            habitaciones.get(contador).setTipo_habitacion(nuevo_tipo);
            input.nextLine();
            
            System.out.println("Ingrese la nueva tarifa: ");
            int nueva_tarifa = input.nextInt();
            habitaciones.get(contador).setTarifa(nueva_tarifa);
            
            System.out.println("Nueva habitacion creada con exito! ");

        } else {
            System.out.println("La habitacion consultada no se encontro en la base");
        }
    }
          public static int eliminarHabitacion(ArrayList<Habitacion> habitaciones) {
        Scanner input = new Scanner(System.in);
        System.out.println("Seleccione el numero de habitacion que desea borrar ");
        int respuesta_eliminar = input.nextInt();
        int cont = 0;

        while (respuesta_eliminar != habitaciones.get(cont).numero_habitacion) {
            cont++;
        }
        if (cont<habitaciones.size()){
            System.out.println("Tipo de habitacion eliminada con exito!");
        }else{
            System.out.println("Este tipo de habitacion no existe en la base, no hay datos para eliminar");
        }
        return cont;
    }

}
