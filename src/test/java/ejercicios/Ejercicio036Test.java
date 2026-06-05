package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class Ejercicio036Test {

	Ejercicio036 ejercicio = new Ejercicio036();

    @Test
    void testPalindromo() throws Exception {
        String input = "1\n2\n3\n2\n1\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        
        ejercicio.comprobarPalindromo();
        
        System.setOut(System.out);
        System.setIn(System.in);
        
        assertTrue(out.toString().contains("¡El array ES palíndromo!"));
    }
    
    @Test
    void testNoPalindromo() throws Exception {
        String input = "1\n2\n3\n4\n5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        
        ejercicio.comprobarPalindromo();
        
        System.setOut(System.out);
        System.setIn(System.in);
        
        assertTrue(out.toString().contains("El array NO es palíndromo."));
    }

}
