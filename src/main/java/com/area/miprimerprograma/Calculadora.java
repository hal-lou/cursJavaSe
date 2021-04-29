package com.area.miprimerprograma;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Ordinador
 */
public class Calculadora {

    public int suma(int num1, int num2) {
        return num1 + num2;
    }

    public float suma(float num1, float num2) {
        return num1 + num2;
    }

    public BigDecimal suma(BigDecimal num1, BigDecimal num2) {
        BigDecimal resultat = num1.add(num2);
        BigDecimal rounded = resultat.setScale(2, RoundingMode.HALF_EVEN);
        return rounded;
    }

    public int multiplicacio(int num1, int num2) {
        return num1 * num2;
    }

    public BigDecimal multiplicacio(BigDecimal num1, BigDecimal num2) {
        BigDecimal resultat = num1.multiply(num2);
        BigDecimal rounded = resultat.setScale(2, RoundingMode.HALF_EVEN);
        return rounded;
    }

    public int divisio(int num1, int num2) {
        return num1 / num2;
    }

    public BigDecimal divisio(BigDecimal num1, BigDecimal num2) {
        BigDecimal resultat = num1.divide(num2);
        BigDecimal rounded = resultat.setScale(2, RoundingMode.HALF_EVEN);
        return rounded;
    }

    public int resta(int num1, int num2) {
        return num1 - num2;
    }

    public BigDecimal resta(BigDecimal num1, BigDecimal num2) {
        BigDecimal resultat = num1.subtract(num2);
        BigDecimal rounded = resultat.setScale(2, RoundingMode.HALF_EVEN);
        return rounded;
    }

    public float modulo(int num1, int num2) {
        return num1 % num2;
    }

    public BigDecimal modulo(BigDecimal num1, BigDecimal num2) {
        BigDecimal resultat = num1.remainder(num2);
        BigDecimal rounded = resultat.setScale(2, RoundingMode.HALF_EVEN);
        return rounded;
    }
}
