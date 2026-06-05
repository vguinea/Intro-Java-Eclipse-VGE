package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio038Test {

	Ejercicio038 ejercicio = new Ejercicio038();

    @Test
    void testGenerarNumeroSecretoRango() {
        int secreto = ejercicio.generarNumeroSecreto();
        assertTrue(secreto >= 1 && secreto <= 50);
        secreto = ejercicio.generarNumeroSecreto();
        assertTrue(secreto >= 1 && secreto <= 50);
        secreto = ejercicio.generarNumeroSecreto();
        assertTrue(secreto >= 1 && secreto <= 50);
        secreto = ejercicio.generarNumeroSecreto();
        assertTrue(secreto >= 1 && secreto <= 50);
    }

    @Test
    void testComprobarIntento() {
        assertEquals("¡Más alto!", ejercicio.comprobarIntento(30, 42));
        assertEquals("¡Más bajo!", ejercicio.comprobarIntento(50, 42));
        assertEquals("¡CORRECTO! El número era: 42", ejercicio.comprobarIntento(42, 42));
    }

}
