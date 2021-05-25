package com.area.herencia;

/**
 *
 * @author Ordinador
 */
public class Profesor extends Persona{
    
    private String IdProfesor;
    
    //Constrictos de la subclase: incluim com parametres al ments els del 
    //constructor de la superclase
    public Profesor(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);//Crida al constructor de la clase persona
        
        IdProfesor = "Unknown";
    }

    public String getIdProfesor() {
        return IdProfesor;
    }

    public void setIdProfesor(String IdProfesor) {
        this.IdProfesor = IdProfesor;
    }
    
    public void mostrarNombreApellidosYCarnet(){
        System.out.println("Profesor de nombre: " + getNombre() + " " +
                getApellidos() + " con Id de profesor: "+ getIdProfesor());
    }
    
}
