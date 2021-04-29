package com.area.decisiones;

import java.util.Scanner;

/**
 *
 * @author Ordinador
 */
public class Principal {

    public static void main(String[] args) {
        int num1, num2;

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        num1 = s.nextInt();

        System.out.print("Ingrese el primer numero: ");
        num2 = s.nextInt();

        s.close(); //try-catch with resources
        //java Stringbuilder vs StringBuffer vs concatenation
        if (num1 > num2) {
            System.out.println("El número " + num1 + " es mayor que el número " + num2);
        } else {
            System.out.println("El número " + num1 + " es menor que el número " + num2);
        }
    }
}
