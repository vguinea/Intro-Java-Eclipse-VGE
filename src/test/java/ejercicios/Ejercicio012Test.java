package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class Ejercicio012Test {
	Ejercicio012 ejercicio012 = new Ejercicio012();

	@Test
	void testSumaNumerosPositivos() throws Exception {
	    String input = "1\n2\n3\n4\n0\n";
	    InputStream originalIn = System.in;
	    ByteArrayOutputStream out = new ByteArrayOutputStream();
	    
	    System.setIn(new ByteArrayInputStream(input.getBytes()));
	    System.setOut(new PrintStream(out)); 
	    int resultado = ejercicio012.sumarHastaCero();
	    System.setIn(originalIn);
	    System.setOut(System.out);
	    
	    assertEquals(10, resultado);
	}
	
	@Test
	void testSoloCero() throws Exception {
	    String input = "0\n";
	    InputStream originalIn = System.in;
	    
	    System.setIn(new ByteArrayInputStream(input.getBytes()));
	    int resultado = ejercicio012.sumarHastaCero();
	    System.setIn(originalIn);
	    
	    assertEquals(0, resultado);
	}
	
	@Test
	void testNumerosNegativos() throws Exception {
	    String input = "-1\n2\n-3\n4\n0\n";
	    InputStream originalIn = System.in;
	    
	    System.setIn(new ByteArrayInputStream(input.getBytes()));
	    int resultado = ejercicio012.sumarHastaCero();
	    System.setIn(originalIn);
	    
	    assertEquals(2, resultado);
	}
}
