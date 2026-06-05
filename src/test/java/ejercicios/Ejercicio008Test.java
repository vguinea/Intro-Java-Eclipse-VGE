package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio008Test {
	Ejercicio008 ejercicio008 = new Ejercicio008();
	@Test
    void testAñosBisiestosCorrectos() {
        assertTrue(ejercicio008.esBisiesto(2024));
        assertTrue(ejercicio008.esBisiesto(2000));
        assertTrue(ejercicio008.esBisiesto(1600));
        assertTrue(ejercicio008.esBisiesto(400));
    }

    @Test
    void testAñosNoBisiestosCorrectos() {
        assertFalse(ejercicio008.esBisiesto(2023));
        assertFalse(ejercicio008.esBisiesto(2025));
        assertFalse(ejercicio008.esBisiesto(1900));
        assertFalse(ejercicio008.esBisiesto(2100));
    }

    @Test
    void testDescripcion() {
        assertEquals("2024 ES bisiesto", ejercicio008.describirAño(2024));
        assertEquals("2023 NO es bisiesto", ejercicio008.describirAño(2023));
    }

}
