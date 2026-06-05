package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio002Test {

	@Test
	void testSaludoCorrecto() {
	    String resultado = Ejercicio002.generarSaludo("Ana", 20);
	    assertEquals("Hola Ana, tienes 20 años.", resultado);
	}
	
	@Test
	void testSaludoConDiferentesValores() {
	    String resultado = Ejercicio002.generarSaludo("José", 25);
	    assertEquals("Hola José, tienes 25 años.", resultado);
	}
	
	@Test
	void testNombreConEspacios() {
	    String resultado = Ejercicio002.generarSaludo("María García", 30);
	    assertEquals("Hola María García, tienes 30 años.", resultado);
	}

}
