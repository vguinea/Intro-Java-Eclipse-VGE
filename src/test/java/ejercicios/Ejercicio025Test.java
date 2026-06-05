package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class Ejercicio025Test {
	Ejercicio025 ejercicio025 = new Ejercicio025();

	@Test
    void testNumerosPrimosHasta10() throws Exception {
        String input = "10\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;
        
        System.setOut(new PrintStream(out));
        System.setIn(in);
        
        ejercicio025.numerosPrimosHastaN();
        
        System.setOut(originalOut);
        System.setIn(originalIn);
        
        String salida = out.toString();
        assertTrue(salida.contains("Números primos hasta 10:"));
        assertTrue(salida.contains("2 3 5 7"));
    }

    @Test
    void testNumerosPrimosHasta20() throws Exception {
        String input = "20\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        
        System.setOut(new PrintStream(out));
        System.setIn(in);
        
        ejercicio025.numerosPrimosHastaN();
        
        System.setOut(System.out);
        System.setIn(System.in);
        
        String salida = out.toString();
        assertTrue(salida.contains("2 3 5 7 11 13 17 19"));
    }
}
