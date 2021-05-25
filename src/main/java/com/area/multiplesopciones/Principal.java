package com.area.multiplesopciones;

/**
 *
 * @author Ordinador
 */
public class Principal {
    public static void main(String[] args) {
        int day = 5;
        String dayString;
        
        switch (day)
        {
            case 1: dayString="Lunes";
                break;//Bona practica
            case 2 : dayString="Martes";
                break;
            case 3: dayString="Miercoles";
                break;
            case 4: dayString="Jueves";
                break;
            case 5: dayString="Viernes";
                break;
            case 6: dayString="Sabado";
                break;
            case 7: dayString="Domingo";
                break;
            default: dayString="Dia inválido"; //Bona practica
                break;
        }
        
        System.out.println("Hoy es " + dayString);
    }
}
