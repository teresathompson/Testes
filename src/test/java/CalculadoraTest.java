import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void somar() {
        assertEquals(5, calc.somar(2,3));
    }

    @Test
    void dividir() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(10,0));
        assertEquals(10, calc.dividir(20,2));
    }
}