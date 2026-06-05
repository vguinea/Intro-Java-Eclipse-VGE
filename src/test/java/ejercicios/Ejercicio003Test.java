package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio003Test {
	Ejercicio003 ejercicio003 = new Ejercicio003();
	
	@Test
	void testCelsiusAFahrenheit_Cero() {
	    double resultado = ejercicio003.celsiusAFahrenheit(0.0);
	    assertEquals(32.0, resultado);
	}
	
	@Test
	void testCelsiusAFahrenheit_Positivo() {
	    double resultado = ejercicio003.celsiusAFahrenheit(100.0);
	    assertEquals(212.0, resultado);
	}
	
	@Test
	void testCelsiusAFahrenheit_Negativo() {
	    double resultado = ejercicio003.celsiusAFahrenheit(-40.0);
	    assertEquals(-40.0, resultado);
	}
}
