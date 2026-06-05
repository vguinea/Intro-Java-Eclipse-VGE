package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class Ejercicio034Test {

	Ejercicio034 ejercicio = new Ejercicio034();

    @Test
    void testNumeroEncontrado() throws Exception {
        String input = "1\n2\n3\n4\n5\n3\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        
        ejercicio.buscarNumeroArray();
        
        System.setOut(System.out);
        System.setIn(System.in);
        
        assertTrue(out.toString().contains("¡El número 3 SÍ existe en el array!"));
    }
    
    @Test
    void testNumeroNoEncontrado() throws Exception {
        String input = "1\n2\n3\n4\n5\n9\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        
        ejercicio.buscarNumeroArray();
        
        System.setOut(System.out);
        System.setIn(System.in);
        
        assertTrue(out.toString().contains("El número 9 NO existe en el array."));
    }

}
