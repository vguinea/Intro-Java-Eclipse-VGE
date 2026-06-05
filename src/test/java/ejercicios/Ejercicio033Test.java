package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class Ejercicio033Test {

	Ejercicio033 ejercicio = new Ejercicio033();

	@Test
    void testInvertirCompleto() throws Exception {
        String input = "1\n2\n3\n4\n5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        
        ejercicio.invertirArray();
        
        System.setOut(System.out);
        System.setIn(System.in);
        
        String salida = out.toString();
        assertTrue(salida.contains("Array original: 1 2 3 4 5"));
        assertTrue(salida.contains("Array invertido: 5 4 3 2 1"));
    }

}
