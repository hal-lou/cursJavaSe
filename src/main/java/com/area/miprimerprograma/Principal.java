package com.area.miprimerprograma;

import java.math.BigDecimal;

/**
 *
 * @author Ordinador
 */
public class Principal {

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println("La suma de enteros es "
                + c.suma(2, 2));
        System.out.println("La suma de bigDecimals es "
                + c.suma(new BigDecimal(1.505), new BigDecimal(1.440)));
        //1.945-->1.94
        //1.955-->1.96

    }
}
