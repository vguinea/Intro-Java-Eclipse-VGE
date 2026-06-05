package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class Ejercicio023Test {

	Ejercicio023 ejercicio023 = new Ejercicio023();

    @Test
    void testContarVocales() throws Exception {
    	String input = "Hola mundo\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;
        
        System.setOut(new PrintStream(out));
        System.setIn(in);
        
        ejercicio023.contarVocales();
        
        System.setOut(originalOut);
        System.setIn(originalIn);
        
        String salida = out.toString();
        assertTrue(salida.contains("Introduce una frase:"));
        assertTrue(salida.contains("La frase tiene 4 vocales."));
    }

}
