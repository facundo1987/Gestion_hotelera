
package com.mycompany.clase2110;


public class Alumno {
    String nombre, apellido;
    int ci, fdn;
//con este metodo asignamos las variables//
    public Alumno(String nombre, String apellido, int ci, int fdn){
        this.nombre=nombre;
        this.apellido=apellido;
        this.ci=ci;
        this.fdn=fdn;
    
    }
    public String getnombre(){
        return this.nombre;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public String getapellido(){
        return this.apellido;
    }
    public void setapellido(String apellido){
        this.apellido=apellido;
    }
    public int getci(){
        return this.ci;
    }
    public void setci(int ci){
        this.ci=ci;
    }
    public int getfdn(){
        return this.fdn;
    }
    public void setfdn(int fdn){
        this.fdn=fdn;
    }
}
