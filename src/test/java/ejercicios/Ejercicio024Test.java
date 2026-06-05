package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class Ejercicio024Test {

	Ejercicio024 ejercicio024 = new Ejercicio024();

    @Test
    void testCalculadoraNotas() throws Exception {
        String input = "8\n7\n9\n6\n5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;
        
        System.setOut(new PrintStream(out));
        System.setIn(in);
        
        ejercicio024.calculadoraNotas();
        
        System.setOut(originalOut);
        System.setIn(originalIn);
        
        String salida = out.toString();
        assertTrue(salida.contains("Introduce nota"));
        assertTrue(salida.contains("=== RESULTADOS ==="));
        assertTrue(salida.contains("Media: 7"));
        assertTrue(salida.contains("Nota más alta: 9"));
        assertTrue(salida.contains("Nota más baja: 5"));
    }

}
