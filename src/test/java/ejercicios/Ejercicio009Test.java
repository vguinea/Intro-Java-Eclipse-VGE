package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio009Test {
	Ejercicio009 ejercicio009 = new Ejercicio009();
	
	@Test
    void testPrimerNumeroMayor() {
        assertEquals(10.0, ejercicio009.obtenerMayor(10.0, 5.0, 7.0));
    }

    @Test
    void testSegundoNumeroMayor() {
        assertEquals(15.0, ejercicio009.obtenerMayor(5.0, 15.0, 10.0));
    }

    @Test
    void testTercerNumeroMayor() {
        assertEquals(20.0, ejercicio009.obtenerMayor(12.0, 8.0, 20.0));
    }

    @Test
    void testNumerosIguales() {
        assertEquals(10.0, ejercicio009.obtenerMayor(10.0, 10.0, 10.0));
        assertEquals(15.0, ejercicio009.obtenerMayor(15.0, 10.0, 15.0));
    }

    @Test
    void testNumerosDecimales() {
        assertEquals(3.14, ejercicio009.obtenerMayor(3.14, 2.71, 1.41), 0.001);
    }

    @Test
    void testNumerosNegativos() {
        assertEquals(-1.0, ejercicio009.obtenerMayor(-5.0, -3.0, -1.0), 0.001);
    }

}
