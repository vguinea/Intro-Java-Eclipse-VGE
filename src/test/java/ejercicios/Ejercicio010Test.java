package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class Ejercicio010Test {
	Ejercicio010 ejercicio010 = new Ejercicio010();
	
	@Test
    void testFor() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(out));
        
        ejercicio010.mostrarFor();
        System.setOut(original);
        
        String salida = out.toString();
        assertTrue(salida.contains("FOR"));
        assertTrue(salida.contains("1 "), "Debe mostrar el 1");
        assertTrue(salida.contains("100 "), "Debe mostrar el 100");
    }

    @Test
    void testWhile() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(out));
        
        ejercicio010.mostrarWhile();
        System.setOut(original);
        
        String salida = out.toString();
        assertTrue(salida.contains("WHILE"));
        assertTrue(salida.contains("1 "));
        assertTrue(salida.contains("4 "));
        assertTrue(salida.contains("9 "));
        assertTrue(salida.contains("18 "));
        assertTrue(salida.contains("100 "));
    }

    @Test
    void testDoWhile() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(out));
        
        ejercicio010.mostrarDoWhile();
        System.setOut(original);
        
        String salida = out.toString();
        assertTrue(salida.contains("DO-WHILE"));
        assertTrue(salida.contains("1 "));
        assertTrue(salida.contains("7 "));
        assertTrue(salida.contains("26 "));
        assertTrue(salida.contains("29 "));
        assertTrue(salida.contains("37 "));
        assertTrue(salida.contains("100 "));
    }

}
