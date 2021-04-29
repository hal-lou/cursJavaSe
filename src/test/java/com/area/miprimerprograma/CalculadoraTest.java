package com.area.miprimerprograma;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ordinador
 */
public class CalculadoraTest {

//     TODO add test methods here.
//     The methods must be annotated with annotation @Test. For example:
    Calculadora c = new Calculadora();

    @Test
    public void testSuma() {
        assertEquals(2, c.suma(1, 1));
    }

    @Test
    public void testSumaFloat() {
        assertEquals(5.50, c.suma(2.10f, 3.40f));
    }

    @Test
    public void testSumaBigDecimal() {
        BigDecimal resultat = new BigDecimal("2.94");
        resultat.setScale(2, RoundingMode.HALF_EVEN);
        assertEquals(0, c.suma(new BigDecimal("1.505"),
                new BigDecimal("1.440")).compareTo(resultat));
    }
}
