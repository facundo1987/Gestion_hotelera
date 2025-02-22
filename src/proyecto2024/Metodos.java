package proyecto2024;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Random;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public class Metodos {

public static void panelGestionGeneral() {
        System.out.println("Bienvenidos al menu general del sistema hotelero\n1 - Huesped \n2 - Habitaciones\n3 - Reservas\n4 - Salir");
        System.out.print("Opcion: ");
    }

    public static void panelPasajeros() {
        System.out.println("1 - Ingresar nuevo huesped\n2 - Consulta huesped\n3 - Editar huesped\n4 - Borrar huesped");
        System.out.println("Opcion: ");
    }

    public static void panelHabitaciones() {
        System.out.println("1 - Crear nueva habitacion\n2 - Ver habitacion\n3 - Editar habitacion\n4 - Borrar habitacion");
        System.out.print("Opcion: ");
    }

    public static void panelReservas() {
        System.out.println("1 - Ingresar nueva reserva\n2 - Modificar reserva\n3 - Consultar reserva\n4 - Eliminar reserva");
        System.out.print("Opcion: ");
    }
    public static Pasajero ingresarPasajero() {
        Scanner input = new Scanner(System.in);
        System.out.println("Cual es el nombre del pasajero  ");
        String nombre = input.nextLine();
        System.out.println("Cual es el apellido del pasajero  ");
        String apellido = input.nextLine();
        System.out.println("ingrese dni ");
        int dni = input.nextInt();
        System.out.println("Ingrese nacionalidad  ");
        input.nextLine();
        String nacionalidad = input.nextLine();
        
        System.out.println("ingrese edad ");
        int edad = input.nextInt();

        Pasajero pasajero_nuevo = new Pasajero(nombre, apellido, dni, nacionalidad, edad);

        return pasajero_nuevo;
    }

    public static void consultaPasajero(ArrayList<Pasajero> pasajeros) {
        Scanner input = new Scanner(System.in);
        System.out.println("Seleccione el dni del pasajero que desea ver ");
        int resp = input.nextInt();

        boolean pasajero_existe = false;

        if (pasajeros.isEmpty()) {
            System.out.println("No hay pasajeros ingresados en el sistema");
        } else {

            for (int i = 0; i < pasajeros.size(); i++) {

                if (resp == pasajeros.get(i).dni && i < pasajeros.size()) {

                    System.out.println("Nombre:" + " " + pasajeros.get(i).nombre);
                    System.out.println("Apellido:" + " " + pasajeros.get(i).apellido);
                    System.out.println("Dni:" + " " + pasajeros.get(i).dni);
                    System.out.println("Nacionalidad:" + " " + pasajeros.get(i).nacionalidad);
                    System.out.println("Edad:" + " " + pasajeros.get(i).edad);
                    pasajero_existe = true;

                }
            }

            if (!pasajero_existe) {

                System.out.println("Pasajero no encontrado ");

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
            pasajeros.get(contador).setDni(nuevoDni);

            System.out.println("Ingrese la nueva nacionalidad del pasajero:");
            input.nextLine();
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

    public static void eliminarPasajero(ArrayList<Pasajero> pasajeros, int respuesta_eliminar) {

        boolean existe_pasajero = false;

        for (int i = 0; i < pasajeros.size(); i++) {
            if (respuesta_eliminar == pasajeros.get(i).dni) {
                pasajeros.remove(i);
                System.out.println("Pasajero eliminado con exito ");
                existe_pasajero = true;
                break;
            }

        }
        if (!existe_pasajero) {
            System.out.println("Este pasajero no existe en la base, no hay datos para eliminar");
        }
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
        System.out.println("Habitacio "+habitaciones.get(0).getNumero_habitacion()+": "+habitaciones.get(0).getTipo_habitacion()+" Costo por dia: US$ "+habitaciones.get(0).getTarifa());
        System.out.println("Habitacio "+habitaciones.get(1).getNumero_habitacion()+": "+habitaciones.get(1).getTipo_habitacion()+" Costo por dia: US$ "+habitaciones.get(1).getTarifa());
        System.out.println("Habitacio "+habitaciones.get(2).getNumero_habitacion()+": "+habitaciones.get(2).getTipo_habitacion()+" Costo por dia: US$ "+habitaciones.get(2).getTarifa());
        System.out.println("Seleccione el numero de habitacion que desea ver ");
        int resp = input.nextInt();
        
        boolean existe = false;
        if (habitaciones.isEmpty()) {
            System.out.println("No hay habitaciones ingresadas en el sistema");
        } else {
            for (int i = 0; i < habitaciones.size(); i++) {
                
                if (resp == habitaciones.get(i).numero_habitacion) {

                    System.out.println("Tipo de habitacion:" + " " + habitaciones.get(i).tipo_habitacion);
                    System.out.println("Numero de habitacion:" + " " + habitaciones.get(i).numero_habitacion);
                    System.out.println("Tarifa:" + " " + habitaciones.get(i).tarifa);
                    System.out.println("Estado: " + habitaciones.get(i).estado);
                    existe = true;
                    break;
                }
                
            }
            if (!existe) {
                System.out.println("La habitacion ingresada no existe");
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
            input.nextLine();
            String nuevo_tipo = input.nextLine();
            habitaciones.get(contador).setTipo_habitacion(nuevo_tipo);
            

            System.out.println("Ingrese la nueva tarifa: ");
            int nueva_tarifa = input.nextInt();
            habitaciones.get(contador).setTarifa(nueva_tarifa);

            System.out.println("Nueva habitacion creada con exito! ");

        } else {
            System.out.println("La habitacion consultada no se encontro en la base");
        }
    }

    public static void eliminarHabitacion(ArrayList<Habitacion> habitaciones) {
        Scanner input = new Scanner(System.in);
        System.out.println("Seleccione el numero de habitacion que desea borrar ");
        int respuesta_eliminar = input.nextInt();
        int cont = 0;
        boolean habitacion_existe = false;

        for (int i = 0; i < habitaciones.size(); i++) {
            if (respuesta_eliminar == habitaciones.get(i).numero_habitacion) {
                habitaciones.remove(i);
                habitacion_existe = true;
                System.out.println("Tipo de habitacion eliminada con exito!");
                break;

            }

        }
        if (!habitacion_existe) {

            System.out.println("Este tipo de habitacion no existe en la base, no hay datos para eliminar");
        }

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
        boolean existe = false;
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
        //cambio
        long dif = fechaSalida.getTime() - fechaEntrada.getTime();
        long dias = TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);
        while (dias <= 0) {
            System.out.println("ERROR, la fecha de salida debe ser posterior a la de ingreso");
            System.out.println("ingrese fecha de salida nuevamente");
            fechaSalida = formato.parse(input.next());
            dif = fechaSalida.getTime() - fechaEntrada.getTime();
            dias = TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);
        }
        //
        System.out.println("Ingrese el N° de habitacion entre las disponibles");
        for (int i = 0; i < habitacion.size(); i++) {
            if (habitacion.get(i).estado.equals("Disponible")) {
                System.out.println("Habitacion " + habitacion.get(i).numero_habitacion + " tipo " + habitacion.get(i).tipo_habitacion);
            }
        }
        int Nrohab = input.nextInt();
        while (Nrohab != habitacion.get(cont).numero_habitacion && cont < habitacion.size()) {
            if (habitacion.get(cont).numero_habitacion == Nrohab) {
                habitacion.get(cont).setEstado("Ocupado");
            }
            cont++;
        }

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
                for (int i = 0; i < reserva.size(); i++) {
                    if (titReserva == reserva.get(i).titularReserva.getDni()) {
                        reserva.get(i).setFechaEntrada(NuevaEntrada);
                        //cambio
                        while (reserva.get(i).dias() <= 0) {
                            System.out.println("La fecha ingresada es posterior a la salida por lo que no puede ser ingresada");
                            System.out.println("Recuerde que la fecha de entrada debe ser anterior a la salida, ingrese nuevamente la fecha de entrada:");
                            NuevaEntrada = formato.parse(input.next());
                            reserva.get(i).setFechaEntrada(NuevaEntrada);
                        }
                        //
                        break;
                    }

                }
                System.out.println("Reserva modificada con exito");
                break;
            case 2:
                System.out.println("Ingrese la nueva fecha de salida:");
                Date NuevaSalida = formato.parse(input.next());
                for (int i = 0; i < reserva.size(); i++) {
                    if (titReserva == reserva.get(i).titularReserva.getDni()) {
                        reserva.get(i).setFechaSalida(NuevaSalida);
                        //cambio
                        while (reserva.get(i).dias() <= 0) {
                            System.out.println("La fecha ingresada es anterior a la fecha de ingreso");
                            System.out.println("Recuerde que la fecha de entrada debe ser anterior a la salida, ingrese nuevamente la fecha de entrada:");
                            NuevaSalida = formato.parse(input.next());
                            reserva.get(i).setFechaSalida(NuevaSalida);
                        }
                        //
                        break;
                    }
                }
                System.out.println("Reserva modificada con exito");
                break;

            case 3:
                if (disponibilidad(habitacion)){
                int nroReserva = 0;
                for (int i = 0; i < reserva.size(); i++) {
                    if (titReserva == reserva.get(i).titularReserva.getDni()) {
                        cambiarEstadoHabit(habitacion, reserva.get(i).habitacion.numero_habitacion);
                        nroReserva = i;
                        break;
                    }
                }
                System.out.println("Seleccione la nueva habitacion reservada:");
                for (int i = 0; i < habitacion.size(); i++) {
                    if (habitacion.get(i).estado.equals("Disponible") && habitacion.get(i).numero_habitacion != reserva.get(nroReserva).habitacion.numero_habitacion) {
                        System.out.println("Habitacion " + habitacion.get(i).numero_habitacion + " tipo " + habitacion.get(i).tipo_habitacion);
                    }
                }
                int Nrohab = input.nextInt();
                
                for (int i=0; i<habitacion.size(); i++){
                    if (habitacion.get(i).numero_habitacion == Nrohab) {
                        cambiarEstadoHabit(habitacion, habitacion.get(i).numero_habitacion);

                        reserva.get(nroReserva).setHabitacion(habitacion.get(i));
                        break;
                    }
                    
                } 
                System.out.println("Reserva modificada con exito");
                }else{
                    System.out.println("Todas las habitaciones estan ocupadas por lo que no se puede modificar la misma");
                }
                break;
            default:
                System.out.println("Opcion no valida.");
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
                System.out.println("Codigo de reserva: " + reservas.get(cont).codigo);
                System.out.println("Titular: " + dni);
                System.out.println("Habitacion: " + reservas.get(cont).habitacion.getNumero_habitacion() + " " + reservas.get(cont).habitacion.getTipo_habitacion());
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

    public static void eliminarReserva(ArrayList<Reserva> reservas, int dniPasajero) {

        boolean reserva_encontrada = false;

        if (reservas.isEmpty()) {
            System.out.println("No hay reservas ingresadas en el sistema para eliminar");
        } else {
            for (int i = 0; i < reservas.size(); i++) {

                if (dniPasajero == reservas.get(i).titularReserva.dni) {
                    reservas.remove(i);
                    reserva_encontrada = true;
                    System.out.println("Reserva vinculada al pasajero eliminada");
                    reserva_encontrada = true;
                    break;
                }
                if (!reserva_encontrada) {

                    System.out.println("No hay reservas vinculadas a este pasajero que se deban eliminar ");

                }
            }
        }
    }

//metodo para cambiar estado de habitacion
    public static void cambiarEstadoHabit(ArrayList<Habitacion> habitaciones, int Nrohabitacion) {
        for (int i = 0; i < habitaciones.size(); i++) {
            if (habitaciones.get(i).numero_habitacion == Nrohabitacion) {
                if (habitaciones.get(i).estado.equals("Disponible")) {
                    habitaciones.get(i).setEstado("Ocupado");
                } else {
                    habitaciones.get(i).setEstado("Disponible");
                }
            }
        }
    }
    
    //metodo para saber si hay habitaciones disponibles
    public static boolean disponibilidad(ArrayList <Habitacion> habitaciones){
        boolean disponibles = false;
        for (int i = 0; i < habitaciones.size(); i++) {
            if (habitaciones.get(i).estado.equals("Disponible")) {
                disponibles = true;
            }
            
        }
        return disponibles;
    }
}