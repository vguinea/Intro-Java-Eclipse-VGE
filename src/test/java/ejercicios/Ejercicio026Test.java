package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class Ejercicio026Test {

	Ejercicio026 ejercicio026 = new Ejercicio026();

    @Test
    void testGestorUsuariosVariosNombres() throws Exception {
        String input = "Ana\nJosé\nMaría\nCarlos\nfin\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;
        
        System.setOut(new PrintStream(out));
        System.setIn(in);
        
        ejercicio026.gestorUsuarios();
        
        System.setOut(originalOut);
        System.setIn(originalIn);
        
        String salida = out.toString();
        assertTrue(salida.contains("Cantidad de nombres: 4"));
        assertTrue(salida.contains("Carlos"));
        assertTrue(salida.contains("Ana"));
    }

    @Test
    void testGestorUsuariosSoloFin() throws Exception {
        String input = "fin\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        
        System.setOut(new PrintStream(out));
        System.setIn(in);
        
        ejercicio026.gestorUsuarios();
        
        System.setOut(System.out);
        System.setIn(System.in);
        
        String salida = out.toString();
        assertTrue(salida.contains("No se introdujeron nombres."));
    }

}
