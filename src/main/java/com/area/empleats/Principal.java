package com.area.empleats;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Halima
 */
public class Principal {
    /*    
    //TODO crear una clase principal amb el method main
    en el method main crear un array de 5 empleats amb els seus respectius 
    attributs inicialitzats per contructos i amb un bucle for each calcular 
    el sueldo total de tots els empleats
    
    --crear un array de objectes
    --for each 
    
    20 min
    */
    public static void main(String[] args) {
        
        Empleat[] empleats = new Empleat[5];
        Empleat e1 = new Empleat("Jesica", "Coma", 1200.00f);
        empleats[0] = e1;
        Empleat e2 = new Empleat("Monica", "Mola", 1220.20f);
        empleats[1] = e2;
        Empleat e3 = new Empleat("Marta", "Colina", 1201.05f);
        empleats[2] = e3;
        Empleat e4 = new Empleat("Camila", "Basta", 1300.10f);
        empleats[3] = e4;
        Empleat e5 = new Empleat("Xavier", "Roma", 1200.30f);
        empleats[4] = e5;
        
        float totalSueldo=0;
        for (Empleat e : empleats) {
            totalSueldo=totalSueldo+e.sueldo;
        }
        BigDecimal total = new BigDecimal(Float.toString(totalSueldo));
        BigDecimal around=total.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("Total Sueldos de los empleados: " + around);
    }
}
