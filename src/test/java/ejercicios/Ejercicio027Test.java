package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class Ejercicio027Test {

	Ejercicio027 ejercicio027 = new Ejercicio027();

    @Test
    void testDecimalABinarioNumerosBasicos() throws Exception {
        String input = "13\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;
        
        System.setOut(new PrintStream(out));
        System.setIn(in);
        
        ejercicio027.decimalABinario();
        
        System.setOut(originalOut);
        System.setIn(originalIn);
        
        String salida = out.toString();
        assertTrue(salida.contains("Binario: 1101"));
    }

    @Test
    void testDecimalABinarioPotencias2() throws Exception {
        String input = "8\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        
        System.setOut(new PrintStream(out));
        System.setIn(in);
        
        ejercicio027.decimalABinario();
        
        System.setOut(System.out);
        System.setIn(System.in);
        
        String salida = out.toString();
        assertTrue(salida.contains("Binario: 1000"));
    }

}
