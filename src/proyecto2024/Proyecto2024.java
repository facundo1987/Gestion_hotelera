package proyecto2024;

import java.text.ParseException;
import java.util.*;

public class Proyecto2024 {

    public static void main(String[] args) throws ParseException {

        ArrayList<Pasajero> pasajeros = new ArrayList();

        //Agregamos pasajeros para poder testear luego el sistema
        Pasajero huesped_1 = new Pasajero("Facundo", "Bustamante", 46390835, "Uruguay", 37);
        pasajeros.add(huesped_1);

        Pasajero huesped_2 = new Pasajero("Gonzalo", "Bergessio", 55667831, "Argentina", 40);
        pasajeros.add(huesped_2);

        Pasajero huesped_3 = new Pasajero("Rosa", "Melano", 44233958, "Francia", 22);
        pasajeros.add(huesped_3);

        Pasajero huesped_4 = new Pasajero("Sabrina", "Rojas", 123456, "Argentina", 44);
        pasajeros.add(huesped_4);

        Pasajero huesped_5 = new Pasajero("Gilberto", "Gil", 44356541, "Brasil", 82);
        pasajeros.add(huesped_5);
        // fin de los casos de prueba

        //Agregamos habitaciones para poder testear luego el sistema
        ArrayList<Habitacion> habitaciones = new ArrayList();

        Habitacion habitacion_1 = new Habitacion("Premium", 103, 80.0, "Ocupada");
        habitaciones.add(habitacion_1);
        Habitacion habitacion_2 = new Habitacion("Excecutive", 201, 50.0, "Ocupada");
        habitaciones.add(habitacion_2);
        Habitacion habitacion_3 = new Habitacion("Suite", 302, 120.0, "Ocupada");
        habitaciones.add(habitacion_3);

        //Lista de reservas y agregamos un caso para prueba
        ArrayList<Reserva> reservas = new ArrayList();

// Crear fechas usando Calendar
        Calendar calendar = Calendar.getInstance();

// Fecha de inicio (15 de noviembre de 2024)
        calendar.set(2024, Calendar.NOVEMBER, 15);
        Date fechaInicio = calendar.getTime();

// Fecha de fin (20 de noviembre de 2024)
        calendar.set(2024, Calendar.NOVEMBER, 20);
        Date fechaFin = calendar.getTime();

//Agregamos reserva para prueba
        Reserva r1 = new Reserva(0, huesped_4, fechaInicio, fechaFin, habitacion_3);
        reservas.add(r1);

        Scanner input = new Scanner(System.in);
        int opcion;
        int option;
        boolean continuo = true;  // NO SE ESTA UTILIZANDO, CONSULTAR A FACU SU IDDEA

        while (continuo) {
            //mostramos panel general
            Metodos.panelGestionGeneral();
            option = input.nextInt();

            switch (option) {

                case 1:
                    //mostramos panel de pasajeros
                    Metodos.panelPasajeros();
                    opcion = input.nextInt();

                    switch (opcion) {
                        case 1:

                            input.nextLine();
                            pasajeros.add(Metodos.ingresarPasajero());

                            System.out.println("Huesped agregado con exito!");
                            break;

                        case 2:

                            Metodos.consultaPasajero(pasajeros);
                            break;

                        case 3:

                            Metodos.editarPasajero(pasajeros);
                            break;

                        case 4:
                            System.out.println("Seleccione dni del pasajero que desea borrar ");
                            int respuesta_eliminar = input.nextInt();
                            Metodos.eliminarPasajero(pasajeros, respuesta_eliminar);
                            Metodos.eliminarReserva(reservas, respuesta_eliminar);
                            break;

                        default:
                            System.out.println("Opcion no valida, ingrese una opcion correcta ");
                            break;
                    }
                    break;
                case 2:

                    //mostramos panel de habitaciones
                    Metodos.panelHabitaciones();
                    opcion = input.nextInt();
                    switch (opcion) {

                        case 1:

                            habitaciones.add(Metodos.nuevaHabitacion());

                            System.out.println("Habitacion creada con exito!");
                            break;

                        case 2:

                            Metodos.consultaHabitacion(habitaciones);
                            break;

                        case 3:

                            Metodos.editarHabitacion(habitaciones);
                            break;

                        case 4:

                            Metodos.eliminarHabitacion(habitaciones);
                            break;

                        default:
                            System.out.println("Opcion no valida, ingrese una opcion correcta ");
                            break;

                    }

                    break;
                case 3:
                    Metodos.panelReservas();
                    opcion = input.nextInt();

                    switch (opcion) {
                        case 1:
                            if (Metodos.disponibilidad(habitaciones)) {
                                reservas.add(Metodos.ingresarReserva(pasajeros, habitaciones));

                                System.out.println("Reserva ingresada al sistema correctamente");
                            } else {
                                System.out.println("No hay habitaciones disponibles, por lo que no se pueden igresar nuevas reservas");
                            }
                            break;
                        case 2:
                            if (reservas.isEmpty()) {

                                System.out.println("No hay reservas en el sistema");

                            } else {

                                Metodos.modificarReserva(reservas, habitaciones);
                            }

                            break;
                        case 3:
                            if (reservas.isEmpty()) {
                                System.out.println("No hay reservas ingresadas en el sistema como para modificar");
                            } else {
                                Metodos.consultarReserva(reservas);
                            }
                            break;
                        case 4:
                            if (reservas.isEmpty()) {
                                System.out.println("No hay reservas ingresadas en el sistema como para eliminar");
                            } else {
                                System.out.println("Ingrese el dni del titular de la reserva: ");
                                int respuesta_eliminar = input.nextInt();
                                Metodos.eliminarReserva(reservas, respuesta_eliminar);
                            }
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }
                    break;

                case 4:
                    System.out.println("Gracias por elegir Gestion Hotelera!");
                    continuo = false;
                    break;
            }

        }

    }

}
