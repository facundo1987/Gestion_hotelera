package proyecto2024;

import java.util.*;

public class Proyecto2024 {

    public static void main(String[] args) {
        
       

        ArrayList<Pasajero> pasajeros = new ArrayList();
          

        //Agregamos pasajeros para poder testear luego el sistema
        Pasajero huesped_1 = new Pasajero("Facundo", "Bustamante", 46390835, "Uruguay", 37);
        pasajeros.add(huesped_1);

        Pasajero huesped_2 = new Pasajero("Gonzalo", "Bergessio", 55667831, "Argentina", 40);
        pasajeros.add(huesped_2);

        Pasajero huesped_3 = new Pasajero("Rosa", "Melano",44233958, "Francia", 22);
        pasajeros.add(huesped_3);

        Pasajero huesped_4 = new Pasajero("Sabrina", "Rojas",123456, "Argentina", 44);
        pasajeros.add(huesped_4);

        Pasajero huesped_5 = new Pasajero("Gilberto", "Gil",44356541, "Brasil", 82);
        pasajeros.add(huesped_5);
        // fin de los casos de prueba

        Scanner input = new Scanner(System.in);
        int opcion;
        int option;
        boolean bandera = false;  // NO SE ESTA UTILIZANDO, CONSULTAR A FACU SU IDDEA

        while (true) {
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
                        case 2:

                            Metodos.consultaPasajero(pasajeros);
                            break;

                        case 3:

                            Metodos.editarPasajero(pasajeros);
                            break;

                        case 4:

                            int cont = Metodos.eliminarPasajero(pasajeros);
                            pasajeros.remove(cont);
                            break;

                        default:
                            System.out.println("Opcion no valida, ingrese una opcion correcta ");
                            break;
                    }
            }

        }

    }

}
