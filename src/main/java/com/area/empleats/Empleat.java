package com.area.empleats;

/**
 *
 * @author Halima
 */
public class Empleat {
    //TODO crear una clase empleado amb 3 attributs
    /*nombre--Strin
    apellidos--String
    sueldo--float
    .00
    */
    String nombre;
    String apellidos;
    float sueldo;
    
    public Empleat(String nombre, String apellidos, float sueldo){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldo = sueldo;
    }
    
    public void mostrar(){
        System.out.println("Mi nombre complero es " + this.nombre + " "+
                this.apellidos + " y sueldo es " + this.sueldo);
    }
}
