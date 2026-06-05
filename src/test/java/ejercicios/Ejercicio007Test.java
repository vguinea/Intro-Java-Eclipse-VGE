package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio007Test {
	Ejercicio007 ejercicio007 = new Ejercicio007();
	
	@Test
	void testDiasValidos() {
	    assertEquals("Lunes", ejercicio007.obtenerDiaSemana(1));
	    assertEquals("Martes", ejercicio007.obtenerDiaSemana(2));
	    assertEquals("Miércoles", ejercicio007.obtenerDiaSemana(3));
	    assertEquals("Jueves", ejercicio007.obtenerDiaSemana(4));
	    assertEquals("Viernes", ejercicio007.obtenerDiaSemana(5));
	    assertEquals("Sábado", ejercicio007.obtenerDiaSemana(6));
	    assertEquals("Domingo", ejercicio007.obtenerDiaSemana(7));
	}
	
	@Test
	void testNumeroInvalido() {
	    assertEquals("Número inválido (usa 1-7)", ejercicio007.obtenerDiaSemana(0));
	    assertEquals("Número inválido (usa 1-7)", ejercicio007.obtenerDiaSemana(8));
	    assertEquals("Número inválido (usa 1-7)", ejercicio007.obtenerDiaSemana(-1));
	}

}
