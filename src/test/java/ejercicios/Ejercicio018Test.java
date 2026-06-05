package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class Ejercicio018Test {

	Ejercicio018 ejercicio018 = new Ejercicio018();

    @Test
    void testSaludoAna() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(out));
        
        ejercicio018.saludar("Ana");
        System.setOut(original);
        
        String salida = out.toString();
        assertTrue(salida.contains("¡Hola Ana!"));
    }

    @Test
    void testSaludoJose() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(out));
        
        ejercicio018.saludar("José");
        System.setOut(original);
        
        String salida = out.toString();
        assertTrue(salida.contains("¡Hola José!"));
    }

    @Test
    void testSaludoConEspacios() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(out));
        
        ejercicio018.saludar("María García");
        System.setOut(original);
        
        String salida = out.toString();
        assertTrue(salida.contains("¡Hola María García!"));
    }

}
