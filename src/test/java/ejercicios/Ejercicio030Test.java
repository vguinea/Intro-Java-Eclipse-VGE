package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class Ejercicio030Test {

	Ejercicio030 ejercicio030 = new Ejercicio030();

	@Test
    void testProcesarNumeros() throws Exception {
        String input = "3\n7\n2\n9\n1\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;
        
        System.setOut(new PrintStream(out));
        System.setIn(in);
        
        ejercicio030.procesarNumeros();
        
        System.setOut(originalOut);
        System.setIn(originalIn);
        
        String salida = out.toString();
        assertTrue(salida.contains("Introduce 5 números:"));
        assertTrue(salida.contains("El mayor número es: 9"));
    }
    
    @Test
    void testTodosIguales() throws Exception {
        String input = "5\n5\n5\n5\n5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        
        ejercicio030.procesarNumeros();
        
        System.setOut(System.out);
        System.setIn(System.in);
        
        String salida = out.toString();
        assertTrue(salida.contains("El mayor número es: 5"));
    }
    
    @Test
    void testNumerosNegativos() throws Exception {
        String input = "-1\n-5\n0\n-10\n-2\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        
        ejercicio030.procesarNumeros();
        
        System.setOut(System.out);
        System.setIn(System.in);
        
        String salida = out.toString();
        assertTrue(salida.contains("El mayor número es: 0"));
    }

}
