package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class Ejercicio032Test {

	Ejercicio032 ejercicio = new Ejercicio032();

    @Test
    void testContarParesMixtos() throws Exception {
        String input = "1\n2\n3\n4\n5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        
        ejercicio.contarParesArray();
        
        System.setOut(System.out);
        System.setIn(System.in);
        
        assertTrue(out.toString().contains("Hay 2 números pares."));
    }
    
    @Test
    void testTodosPares() throws Exception {
        String input = "2\n4\n6\n8\n10\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        
        ejercicio.contarParesArray();
        
        System.setOut(System.out);
        System.setIn(System.in);
        
        assertTrue(out.toString().contains("Hay 5 números pares."));
    }

}
