package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio014Test {
	
	Ejercicio014 ejercicio014 = new Ejercicio014();

	@Test
    void testFactorialCasosBase() {
        assertEquals(1, ejercicio014.calcularFactorial(0));
        assertEquals(1, ejercicio014.calcularFactorial(1));
        assertEquals(2, ejercicio014.calcularFactorial(2));
    }

    @Test
    void testFactorialNumerosMedianos() {
        assertEquals(6, ejercicio014.calcularFactorial(3));
        assertEquals(24, ejercicio014.calcularFactorial(4));
        assertEquals(120, ejercicio014.calcularFactorial(5));
        assertEquals(720, ejercicio014.calcularFactorial(6));
    }

    @Test
    void testFactorialNumeroGrande() {
        assertEquals(3628800, ejercicio014.calcularFactorial(10));
    }

    @Test
    void testNumeroNegativo() {
        IllegalArgumentException exception = 
            assertThrows(IllegalArgumentException.class, 
                () -> ejercicio014.calcularFactorial(-1));
        assertEquals("El factorial no se puede calcular para números negativos", exception.getMessage());
    }

}
