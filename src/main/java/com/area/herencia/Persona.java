package com.area.herencia;

/**
 *
 * @author Ordinador
 */
public class Persona {
    
    private final String nombre;
    private final String apellidos;
    private final int edad;

    //Els attributs només es editen a traves de un constructor
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

}
