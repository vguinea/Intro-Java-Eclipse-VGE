package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio020Test {

	Ejercicio020 ejercicio020 = new Ejercicio020();

    @Test
    void testNumerosPrimos() {
        assertTrue(ejercicio020.esPrimo(2));
        assertTrue(ejercicio020.esPrimo(3));
        assertTrue(ejercicio020.esPrimo(5));
        assertTrue(ejercicio020.esPrimo(7));
        assertTrue(ejercicio020.esPrimo(11));
        assertTrue(ejercicio020.esPrimo(13));
        assertTrue(ejercicio020.esPrimo(17));
    }

    @Test
    void testNumerosNoPrimos() {
        assertFalse(ejercicio020.esPrimo(0));
        assertFalse(ejercicio020.esPrimo(1));
        assertFalse(ejercicio020.esPrimo(4));
        assertFalse(ejercicio020.esPrimo(6));
        assertFalse(ejercicio020.esPrimo(9));
        assertFalse(ejercicio020.esPrimo(15));
        assertFalse(ejercicio020.esPrimo(25));
    }

    @Test
    void testPrimosGrandes() {
        assertTrue(ejercicio020.esPrimo(97));
        assertTrue(ejercicio020.esPrimo(101));
    }

}
