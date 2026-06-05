package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class Ejercicio029Test {

	Ejercicio029 ejercicio029 = new Ejercicio029();

    @Test
    void testFibonacci5Terminos() throws Exception {
        String input = "5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;
        
        System.setOut(new PrintStream(out));
        System.setIn(in);
        
        ejercicio029.secuenciaFibonacci();
        
        System.setOut(originalOut);
        System.setIn(originalIn);
        
        String salida = out.toString();
        assertTrue(salida.contains("Secuencia Fibonacci (5 términos):"));
        assertTrue(salida.contains("0 1 1 2 3"));
    }

    @Test
    void testFibonacci10Terminos() throws Exception {
        String input = "10\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        
        System.setOut(new PrintStream(out));
        System.setIn(in);
        
        ejercicio029.secuenciaFibonacci();
        
        System.setOut(System.out);
        System.setIn(System.in);
        
        String salida = out.toString();
        assertTrue(salida.contains("0 1 1 2 3 5 8 13 21 34"));
    }

}
