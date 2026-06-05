package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class Ejercicio037Test {

	Ejercicio037 ejercicio = new Ejercicio037();

    @Test
    void testRepeticionesMixtas() throws Exception {
        String input = "1\n2\n1\n3\n2\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        
        ejercicio.contarRepeticiones();
        
        System.setOut(System.out);
        System.setIn(System.in);
        
        String salida = out.toString();
        assertTrue(salida.contains("1 se repite 2 vez/veces"));
        assertTrue(salida.contains("2 se repite 2 vez/veces"));
        assertTrue(salida.contains("3 se repite 1 vez/veces"));
    }
    
    @Test
    void testTodosUnicos() throws Exception {
        String input = "1\n2\n3\n4\n5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        
        ejercicio.contarRepeticiones();
        
        System.setOut(System.out);
        System.setIn(System.in);
        
        assertTrue(out.toString().contains("1 se repite 1 vez/veces"));
        assertTrue(out.toString().contains("5 se repite 1 vez/veces"));
    }

}
