package ejercicios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Ejercicio001Test {
	
	Ejercicio001 calculadora = new Ejercicio001();

    @Test
    void testOperacionesBasicas() {
        assertEquals(5.0, calculadora.suma(2, 3));
        assertEquals(-1.0, calculadora.resta(2, 3));
        assertEquals(6.0, calculadora.multiplicacion(2, 3));
        assertEquals(3, calculadora.division(9, 3));
    }

    @Test
    void testDivisionCero() {
        assertThrows(ArithmeticException.class, () -> calculadora.division(5, 0));
    }

}
