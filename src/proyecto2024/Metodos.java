package proyecto2024;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Random;
import java.text.ParseException;

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
        System.out.println("1 ---- Crear nueva habitacion");
        System.out.println("2 ---- Ver habitacion");
        System.out.println("3---- Editar habitacion");
        System.out.println("4 ---- Borrar habitacion");
    }
    
        public static void panelReservas(){
        System.out.println("1 ---- Ingresar nueva reserva");
        System.out.println("2 ---- Modificar reserva");
        System.out.println("3 ---- Consultar reserva");
        System.out.println("4 ---- Eliminar reserva");
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

        Pasajero pasajero_nuevo = new Pasajero(nombre, apellido, dni, nacionalidad, edad);

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

                if (resp == pasajeros.get(x).dni) {

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
        if (cont < pasajeros.size()) {
            System.out.println("Pasajero eliminado con exito!");
        } else {
            System.out.println("Este pasajero no se existe en la base, no hay datos para eliminar");
        }
        return cont;
    }

    // CRUD de habitacion
    public static Habitacion nuevaHabitacion() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tipo de habitacion ");
        String tipo_habitacion = input.nextLine();
        System.out.println("Ingrese el numero de habitacion ");
        int numero_habitacion = input.nextInt();
        System.out.println("Seleccione la tarifa ");
        double tarifa = input.nextDouble();
        String estado = "Disponible";

        Habitacion habitacion_nueva = new Habitacion(tipo_habitacion, numero_habitacion, tarifa, estado);

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

                if (resp == habitaciones.get(x).numero_habitacion) {

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
        if (cont < habitaciones.size()) {
            System.out.println("Tipo de habitacion eliminada con exito!");
        } else {
            System.out.println("Este tipo de habitacion no existe en la base, no hay datos para eliminar");
        }
        return cont;
    }
    //generador de codigos de reservas

    public static int codigoReserva() {
        Random random = new Random();
        int codigo = random.nextInt(100);
        return codigo;
    }

    //Modificar estado de habitacion
    //METODOS DE RESERVA
    public static Reserva ingresarReserva(ArrayList<Pasajero> pasajero, ArrayList<Habitacion> habitacion) throws ParseException {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        int titReserva = 0, cont = 0;
        boolean existe = true;
        System.out.println("Ingrese el dni del titular de la reserva: ");
        int dni = input.nextInt();
        for (int i = 0; i < pasajero.size(); i++) {
            if (pasajero.get(i).dni == dni) {
                titReserva = i;
                existe = true;
                break;
            }
        }
        if (!existe) {
            System.out.println("Este pasajero aún no se encuentra ingresado en la base");
            System.out.println("A continuacion le pediremos unos datos para completar su ingreso al sistema");

            pasajero.add(ingresarPasajero());
        }
        System.out.println("Ingrese la fecha de entrada para la reserva (DD/MM/AAAA): ");
        Date fechaEntrada = formato.parse(input.next());
        System.out.println("Ingrese la fecha de salida para la reserva (DD/MM/AAAA): ");
        Date fechaSalida = formato.parse(input.next());
        System.out.println("Ingrese el N° de habitacion entre las disponibles");
        for (int i = 0; i < habitacion.size(); i++) {
            if (habitacion.get(i).estado.equals("Disponible")) {
                System.out.println("Habitacion " + habitacion.get(i).numero_habitacion + " tipo " + habitacion.get(i).tipo_habitacion);
            }
        }
        int Nrohab = input.nextInt();
        do {
            if (habitacion.get(cont).numero_habitacion == Nrohab) {
                habitacion.get(cont).setEstado("Ocupado");
            }
            cont++;
        } while (Nrohab != habitacion.get(cont).numero_habitacion && cont < habitacion.size());

        Reserva reservaNueva = new Reserva(codigoReserva(), pasajero.get(titReserva), fechaEntrada, fechaSalida, habitacion.get(cont));

        return reservaNueva;
    }

    public static void modificarReserva(ArrayList<Reserva> reserva, ArrayList<Habitacion> habitacion) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el titular de la reserva que desea modificar:");
        int titReserva = input.nextInt();
        System.out.println("Ahora seleccione la opcion de lo que desea modificar: ");
        System.out.println("1- Fecha de entrada");
        System.out.println("2- Fecha de salida");
        System.out.println("3- Habitacion");
        int opc = input.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Ingrese la nueva fecha de entrada:");
                Date NuevaEntrada = formato.parse(input.next());
                break;
            case 2:
                System.out.println("Ingrese la nueva fecha de salida:");
                Date NuevaSalida = formato.parse(input.next());
                break;
            case 3:
                for (int i = 0; i < reserva.size(); i++) {
                    if (titReserva == reserva.get(i).titularReserva.getDni()) {
                        reserva.get(i).habitacion.setEstado("Disponible");
                    }
                }
                System.out.println("Seleccione la nueva habitacion reservada:");
                for (int i = 0; i < habitacion.size(); i++) {
                    if (habitacion.get(i).estado.equals("Disponible")) {
                        System.out.println("Habitacion " + habitacion.get(i).numero_habitacion + " tipo " + habitacion.get(i).tipo_habitacion);
                    }
                }
                int Nrohab = input.nextInt();
                int cont = 0;
                do {
                    if (habitacion.get(cont).numero_habitacion == Nrohab) {
                        habitacion.get(cont).setEstado("Ocupado");
                    }
                    cont++;
                } while (Nrohab != habitacion.get(cont).numero_habitacion && cont < habitacion.size());
                break;
        }

    }

    public static void consultarReserva(ArrayList<Reserva> reservas) {
        Scanner input = new Scanner(System.in);
        int cont = 0;
        boolean existe = false;
        System.out.println("Ingrese el DNI del titular de la reserva: ");
        int dni = input.nextInt();
        do {
            if (dni == reservas.get(cont).getTitularReserva().dni) {
                existe = true;
                System.out.println("Esta es la informacion de la reserva consultada:");
                System.out.println("Titular: " + dni);
                System.out.println("Fecha de ingreso: " + reservas.get(cont).fechaEntrada);
                System.out.println("Fecha de salida: " + reservas.get(cont).fechaSalida);
                System.out.println("Canitdad de noches: " + reservas.get(cont).dias());
                System.out.println("Precio total a pagar: U$S " + reservas.get(cont).precioTotal());
            }
            cont++;
        } while (cont < reservas.size() && dni != reservas.get(cont).getTitularReserva().dni);
        if (!existe) {
            System.out.println("No hay reservas existentes con la CI indicada.");
        }

    }

}
