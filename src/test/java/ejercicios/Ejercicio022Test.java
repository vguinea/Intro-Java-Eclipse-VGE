package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class Ejercicio022Test {

	Ejercicio022 ejercicio022 = new Ejercicio022();

    @Test
    void testMenuSumaYSalir() throws Exception {
        String input = "1\n5\n3\n0\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;
        
        System.setOut(new PrintStream(out));
        System.setIn(in);
        
        ejercicio022.mostrarMenu();
        
        System.setOut(originalOut);
        System.setIn(originalIn);
        
        String salida = out.toString();
        assertTrue(salida.contains("=== MENÚ CALCULADORA ==="));
        assertTrue(salida.contains("Resultado: 8.0"));
        assertTrue(salida.contains("¡Hasta luego!"));
    }

}
