package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class Ejercicio013Test {

	@Test
    void testSalidaCompleta() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(out));
        
        Ejercicio013 ejercicio013 = new Ejercicio013();
        ejercicio013.mostrarPrimeros20Pares();
        System.setOut(original);
        
        String salida = out.toString();
        assertTrue(salida.contains("Los primeros veinte números pares:"));
        assertTrue(salida.contains("2 "));
        assertTrue(salida.contains("40 "));
        
        String[] numeros = salida.split("\\s+");
        long countPares = java.util.Arrays.stream(numeros)
            .filter(s -> s.matches("\\d+"))
            .count();
        assertEquals(20, countPares);
    }

}
