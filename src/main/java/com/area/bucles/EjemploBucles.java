package com.area.bucles;

/**
 *
 * @author Ordinador
 */
public class EjemploBucles {

    public static void main(String[] args) {
        int array[];
        array = new int[10];
        int i = 0;

        System.out.println("\nPrueba con for");

        for (i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println("array[" + i + "]: " + array[i]);
        }

        i = 0;

        System.out.println("\nPrueba con While");
        while (i < array.length) {
            System.out.println("array[" + i + "]: " + array[i]);
            i++;
        }
        System.out.println("\nPrueba con do While");
        do {
            array[i] = i;

            i++;
        } while (i < array.length);
    }
}
