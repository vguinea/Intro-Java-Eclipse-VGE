package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class Ejercicio028Test {

	Ejercicio028 ejercicio028 = new Ejercicio028();

    @Test
    void testCajeroIngresoRetiro() throws Exception {
        String input = "2\n500\n3\n300\n1\n0\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;
        
        System.setOut(new PrintStream(out));
        System.setIn(in);
        
        ejercicio028.cajeroAutomatico();
        
        System.setOut(originalOut);
        System.setIn(originalIn);
        
        String salida = out.toString();
        assertTrue(salida.contains("Saldo actual: 1000"));
        assertTrue(salida.contains("Ingreso realizado. Nuevo saldo: 1500"));
        assertTrue(salida.contains("Retiro realizado. Nuevo saldo: 1200"));
        assertTrue(salida.contains("Saldo actual: 1200"));
    }

}
