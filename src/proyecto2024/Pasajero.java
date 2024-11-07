
package proyecto2024;

import java.util.ArrayList;


public class Pasajero {

    String nombre;
    String apellido;
    String nacionalidad;
    int edad;

    public Pasajero(String nombre, String apellido, String nacionalidad, int edad) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
