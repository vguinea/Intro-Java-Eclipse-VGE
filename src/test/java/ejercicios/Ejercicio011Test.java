package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class Ejercicio011Test {
	
	Ejercicio011 ejercicio011 = new Ejercicio011();

	 @Test
	    void testTabla5() {
	        ByteArrayOutputStream out = new ByteArrayOutputStream();
	        PrintStream original = System.out;
	        System.setOut(new PrintStream(out));
	        
	        ejercicio011.mostrarTabla(5);
	        System.setOut(original);
	        
	        String salida = out.toString();
	        assertTrue(salida.contains("Tabla del 5:"));
	        assertTrue(salida.contains("5 x 1 = 5"));
	        assertTrue(salida.contains("5 x 5 = 25"));
	        assertTrue(salida.contains("5 x 10 = 50"));
	    }

	    @Test
	    void testTabla10() {
	        ByteArrayOutputStream out = new ByteArrayOutputStream();
	        PrintStream original = System.out;
	        System.setOut(new PrintStream(out));
	        
	        ejercicio011.mostrarTabla(10);
	        System.setOut(original);
	        
	        String salida = out.toString();
	        assertTrue(salida.contains("10 x 10 = 100"));
	    }

	    @Test
	    void testTabla1() {
	        ByteArrayOutputStream out = new ByteArrayOutputStream();
	        PrintStream original = System.out;
	        System.setOut(new PrintStream(out));
	        
	        ejercicio011.mostrarTabla(1);
	        System.setOut(original);
	        
	        String salida = out.toString();
	        assertTrue(salida.contains("1 x 1 = 1"));
	        assertTrue(salida.contains("1 x 10 = 10"));
	    }

}
