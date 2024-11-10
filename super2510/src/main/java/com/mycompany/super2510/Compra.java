
package com.mycompany.super2510;


public class Compra {
    String nombre;
    int cantidad;
    double precio;    

public Compra(String nombre,int cantidad,double precio){
    this.nombre=nombre;
    this.cantidad=cantidad;
    this.precio=precio;
}

    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this. nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
public double calcularTotal(){
    return this.precio * this.cantidad;
    
    }


}


