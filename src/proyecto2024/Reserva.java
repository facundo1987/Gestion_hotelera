
package proyecto2024;

import java.text.ParseException;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Reserva {
    
    // atributos
    int codigo;
    Pasajero titularReserva;
    Date fechaEntrada;
    Date fechaSalida;
    Habitacion habitacion;
    
    // metodo constructor
    public Reserva (int codigo, Pasajero titularReserva, Date fechaEntrada, Date fechaSalida, Habitacion habitacion){
        this.codigo = codigo;
        this.titularReserva = titularReserva;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.habitacion = habitacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public Pasajero getTitularReserva() {
        return titularReserva;
    }

    public void setTitularReserva(Pasajero titularReserva) {
        this.titularReserva = titularReserva;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    
    //metodo para calcular dias de estadia
    public long dias (){
        long dif = this.fechaSalida.getTime() - this.fechaEntrada.getTime();
        long dias = TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);
        return dias;
    }
    
    //metodo para calcular el precio final de la reserva
    public double precioTotal (Habitacion habitacion){
        double precioTotal = (habitacion.tarifa)*(dias());
        return precioTotal;
    }
}
