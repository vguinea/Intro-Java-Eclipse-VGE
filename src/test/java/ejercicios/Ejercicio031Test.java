package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class Ejercicio031Test {

	Ejercicio031 ejercicio = new Ejercicio031();

    @Test
    void testSumaCompleta() throws Exception {
        String input = "1\n2\n3\n4\n5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        
        ejercicio.sumarElementosArray();
        
        System.setOut(System.out);
        System.setIn(System.in);
        
        assertTrue(out.toString().contains("La suma total es: 15"));
    }

}
