package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalcoulatorTest {

    @Test
    void testAddition() {
        Calcoulator calc = new Calcoulator();
        assertEquals(6, calc.add(2, 3));
    }

    @Test
    void testSubtraction() {
        Calcoulator calc = new Calcoulator();
        assertEquals(1, calc.subtract(3, 2));
    }
    @Test
    void testMultiply() {
        Calcoulator calc = new Calcoulator();
        assertEquals(12, calc.multiply(6, 2));
    }

    @Test
    void testDivision() {
        Calcoulator calc = new Calcoulator();
        assertEquals(2, calc.divide(6, 3));
    }

    @Test
    void testDivideByZero() {
        Calcoulator calc = new Calcoulator();
        assertThrows(IllegalArgumentException.class, () -> calc.divide(5, 0));
    }

}
