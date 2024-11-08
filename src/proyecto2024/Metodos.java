package proyecto2024;

import java.util.*;

public class Metodos {

    //Msj para menu general de gestiones
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

    public static Pasajero ingresarPasajero() {
        Scanner input = new Scanner(System.in);
        System.out.println("Cual es el nombre del pasajero  ");
        String nombre = input.nextLine();
        System.out.println("Cual es el apellido del pasajero  ");
        String apellido = input.nextLine();
        System.out.println("Ingrese nacionalidad  ");
        String nacionalidad = input.nextLine();
        System.out.println("ingrese edad ");
        int edad = input.nextInt();

        Pasajero pasajero_nuevo = new Pasajero(nombre, apellido, nacionalidad, edad);

        return pasajero_nuevo;
    }

    public static void consultaPasajero(ArrayList<Pasajero> pasajeros) {
        Scanner input = new Scanner(System.in);
        System.out.println("Seleccione el apellido del pasajero que desea ver ");
        input.nextLine();
        String resp = input.nextLine();
        int x = 0;

        if (pasajeros.isEmpty()) {
            System.out.println("No hay pasajeros ingresados en el sistema");
        } else {
            while (!resp.equalsIgnoreCase(pasajeros.get(x).apellido)) {

                x++;

                if (resp.equalsIgnoreCase(pasajeros.get(x).apellido)) {

                    System.out.println("Nombre:" + " " + pasajeros.get(x).nombre);
                    System.out.println("Apellido:" + " " + pasajeros.get(x).apellido);
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
        System.out.println("Ingrese el apellido del pasajero que desea editar: ");
        input.nextLine();
        String respuesta_modificar = input.nextLine();
        int contador = 0;

        while (!respuesta_modificar.equalsIgnoreCase(pasajeros.get(contador).apellido)) {

            contador++;
        }
        if (contador < pasajeros.size()) {

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

        } else {
            System.out.println("El pasajero consultado no se encontro en la base");
        }
    }

    public static int eliminarPasajero(ArrayList<Pasajero> pasajeros) {
        Scanner input = new Scanner(System.in);
        System.out.println("Seleccione apellido del pasajero que desea borrar ");
        input.nextLine();
        String respuesta_eliminar = input.nextLine();
        int cont = 0;

        while (!respuesta_eliminar.equalsIgnoreCase(pasajeros.get(cont).apellido)) {
            cont++;
        }
        if (cont<pasajeros.size()){
            System.out.println("Pasajero eliminado con exito!");
        }else{
            System.out.println("Este pasajero no se existe en la base, no hay datos para eliminar");
        }
        return cont;
    }
}
