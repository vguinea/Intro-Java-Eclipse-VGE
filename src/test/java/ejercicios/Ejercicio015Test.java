package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class Ejercicio015Test {
	Ejercicio015 ejercicio015 = new Ejercicio015();
	
	@Test
    void test01() {
		
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(out));
        
        ejercicio015.mostrarMultiplosTres(10);
        System.setOut(original);
        
        String salida = out.toString();
        assertTrue(salida.contains("Múltiplos de 3 hasta 10"));
        assertTrue(salida.contains("3 "));
        assertTrue(salida.contains("6 "));
        assertTrue(salida.contains("9 "));
    }

    @Test
    void test02() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(out));
        
        ejercicio015.mostrarMultiplosTres(20);
        System.setOut(original);
        
        String salida = out.toString();
        assertTrue(salida.contains("3 6 9 12 15 18 "));
    }

    @Test
    void test03() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(out));
        
        ejercicio015.mostrarMultiplosTres(2);
        System.setOut(original);
        
        String salida = out.toString();
        assertTrue(salida.contains("No debe mostrar múltiplos si N < 3"));
    }

}
