package com.area.herencia;

/**
 *
 * @author Ordinador
 */
public class Principal {
    public static void main(String[] args) {
        Profesor p = new Profesor("Juan", "Hernandez Garcia", 33);
        p.setIdProfesor("Prof 22-387-11");
        p.mostrarNombreApellidosYCarnet();
        
        //Aixo lo que permet el Polimorfisme de clases
        Persona p2 = new Profesor("Juan", "Hernandez Garcia", 33);
    }
  
}
