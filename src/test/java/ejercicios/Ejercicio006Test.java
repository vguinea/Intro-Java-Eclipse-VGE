package ejercicios;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Ejercicio006Test {
	
	Ejercicio006 ejercicio006 = new Ejercicio006();
	
	@Test
    void testInsuficiente() {
        assertEquals("Insuficiente", ejercicio006.obtenerCalificacion(3.5));
        assertEquals("Insuficiente", ejercicio006.obtenerCalificacion(0));
        assertEquals("Insuficiente", ejercicio006.obtenerCalificacion(4.9));
    }

    @Test
    void testSuficiente() {
        assertEquals("Suficiente", ejercicio006.obtenerCalificacion(5.0));
        assertEquals("Suficiente", ejercicio006.obtenerCalificacion(5.5));
        assertEquals("Suficiente", ejercicio006.obtenerCalificacion(5.9));
    }

    @Test
    void testBien() {
        assertEquals("Bien", ejercicio006.obtenerCalificacion(6.0));
        assertEquals("Bien", ejercicio006.obtenerCalificacion(6.5));
        assertEquals("Bien", ejercicio006.obtenerCalificacion(6.9));
    }

    @Test
    void testNotable() {
        assertEquals("Notable", ejercicio006.obtenerCalificacion(7.0));
        assertEquals("Notable", ejercicio006.obtenerCalificacion(8.5));
        assertEquals("Notable", ejercicio006.obtenerCalificacion(8.9));
    }

    @Test
    void testSobresaliente() {
        assertEquals("Sobresaliente", ejercicio006.obtenerCalificacion(9.0));
        assertEquals("Sobresaliente", ejercicio006.obtenerCalificacion(9.5));
        assertEquals("Sobresaliente", ejercicio006.obtenerCalificacion(10.0));
    }

    @Test
    void testNotaNoValida() {
        assertEquals("Nota no válida", ejercicio006.obtenerCalificacion(-1));
        assertEquals("Nota no válida", ejercicio006.obtenerCalificacion(10.5));
    }

}
