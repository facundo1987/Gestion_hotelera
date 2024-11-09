/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2024;
import java.util.ArrayList;
/**
 *
 * @author 46390835
 */
public class Habitacion {
    
    String tipo_habitacion;
    int numero_habitacion;
    double tarifa;
    
    
    public Habitacion (String tipo_habitacion, int numero_habitacion, double tarifa){
        
        this.tipo_habitacion = tipo_habitacion;
        this.numero_habitacion = numero_habitacion;
        this.tarifa = tarifa;
    
    
    }

    public String getTipo_habitacion() {
        return tipo_habitacion;
    }

    public void setTipo_habitacion(String tipo_habitacion) {
        this.tipo_habitacion = tipo_habitacion;
    }

    public int getNumero_habitacion() {
        return numero_habitacion;
    }

    public void setNumero_habitacion(int numero_habitacion) {
        this.numero_habitacion = numero_habitacion;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
