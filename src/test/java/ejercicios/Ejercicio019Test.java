package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio019Test {

	Ejercicio019 ejercicio019 = new Ejercicio019();

    @Test
    void testPotenciaCasosBase() {
        assertEquals(1, ejercicio019.potencia(5, 0));
        assertEquals(3, ejercicio019.potencia(3, 1));
    }

    @Test
    void testPotenciasNormales() {
        assertEquals(9, ejercicio019.potencia(3, 2));
        assertEquals(8, ejercicio019.potencia(2, 3));
        assertEquals(16, ejercicio019.potencia(4, 2));
        assertEquals(81, ejercicio019.potencia(3, 4));
    }

    @Test
    void testPotenciasGrandes() {
        assertEquals(32, ejercicio019.potencia(2, 5));
        assertEquals(243, ejercicio019.potencia(3, 5));
    }

    @Test
    void testExponenteNegativo() {
        IllegalArgumentException exception = 
            assertThrows(IllegalArgumentException.class, 
                () -> ejercicio019.potencia(2, -1));
        assertEquals("El exponente debe ser no negativo", exception.getMessage());
    }

}
