package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio017Test {
	
	Ejercicio017 ejercicio017 = new Ejercicio017();

	@Test
    void testPrimerNumeroMayor() {
        assertEquals(10, ejercicio017.maximo(10, 5));
        assertEquals(100, ejercicio017.maximo(100, 20));
    }

    @Test
    void testSegundoNumeroMayor() {
        assertEquals(15, ejercicio017.maximo(5, 15));
        assertEquals(99, ejercicio017.maximo(50, 99));
    }

    @Test
    void testNumerosIguales() {
        assertEquals(7, ejercicio017.maximo(7, 7));
        assertEquals(0, ejercicio017.maximo(0, 0));
    }

    @Test
    void testNumerosNegativos() {
        assertEquals(-1, ejercicio017.maximo(-5, -1));
        assertEquals(-10, ejercicio017.maximo(-10, -15));
    }

}
