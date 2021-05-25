package com.area.multiplesopciones;

/**
 *
 * @author Ordinador
 */
public class Principal2 {
    public static void main(String[] args) {
        int number = 0;
        
        //Checks i number is greater then 0
        if (number > 0) {
            System.out.println("The number is positive.");
        }
        //checks if number is less than 0
        else if (number < 0) {
            System.out.println("The number is negative.");
        }
        //if both condition is false
        else {
            System.out.println("The number is 0.");
        }
    }
}
