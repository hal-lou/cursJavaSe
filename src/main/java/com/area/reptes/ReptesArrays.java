package com.area.reptes;

/**
 *
 * @author Ordinador
 */
public class ReptesArrays {

    public static void main(String[] args) {
        System.out.println("---------Repte del arrays---------\n");
        String frase = "ComoseradarconnekgikisV...";

        char[] ch = new char[frase.length()];
        int[] nm = {23, 24, 25, 18, 19, 5, 6, 7, 20, 15, 17, 8, 10,
            11, 4, 3, 12, 2, 16, 14, 9, 21, 0, 1, 13, 22};

        for (int i = 0; i < frase.length(); i++) {
            ch[nm[i]] = frase.charAt(i);
        }

        System.out.print("LA URL SECRETA ÉS -> ");
        for (int i = 0; i < frase.length(); i++) {
            System.out.print(ch[i]);
        }
    }
}
