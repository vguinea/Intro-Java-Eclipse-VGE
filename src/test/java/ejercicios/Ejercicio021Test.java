package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio021Test {

	Ejercicio021 ejercicio021 = new Ejercicio021();

    @Test
    void testTextoConVocales() {
        assertEquals(4, ejercicio021.contarVocales("Hola mundo"));
        assertEquals(5, ejercicio021.contarVocales("aeiou"));
    }

    @Test
    void testMayusculasYMinusculas() {
        assertEquals(2, ejercicio021.contarVocales("HOLA"));
        assertEquals(2, ejercicio021.contarVocales("hola"));
        assertEquals(5, ejercicio021.contarVocales("AeIoU"));
    }

    @Test
    void testCasosSinVocales() {
        assertEquals(0, ejercicio021.contarVocales("123"));
        assertEquals(0, ejercicio021.contarVocales("bcd fgh"));
    }

    @Test
    void testCasosEspeciales() {
        assertEquals(0, ejercicio021.contarVocales(""));
        assertEquals(0, ejercicio021.contarVocales(null));
    }

}
