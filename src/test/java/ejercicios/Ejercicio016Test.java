package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio016Test {
	
	Ejercicio016 ejercicio016 = new Ejercicio016();

	@Test
    void test01() {
        assertTrue(ejercicio016.esPar(2));
        assertTrue(ejercicio016.esPar(-2));
        assertFalse(ejercicio016.esPar(1));
        assertFalse(ejercicio016.esPar(3));
    }

    @Test
    void test02() {
    	assertTrue(ejercicio016.esPar(4));
        assertTrue(ejercicio016.esPar(100));
        assertFalse(ejercicio016.esPar(7));
        assertFalse(ejercicio016.esPar(99));
        assertFalse(ejercicio016.esPar(-1));
    }

}
