package ejercicios;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Ejercicio005Test {
	
	Ejercicio005 ejercicio005 = new Ejercicio005();
	
	@Test
    void testNumeroPositivo() {
        String resultado = ejercicio005.describirNumero(10);
        assertEquals("El número es positivo.", resultado);
    }

    @Test
    void testNumeroNegativo() {
        String resultado = ejercicio005.describirNumero(-5);
        assertEquals("El número es negativo.", resultado);
    }

    @Test
    void testNumeroCero() {
        String resultado = ejercicio005.describirNumero(0);
        assertEquals("El número es cero.", resultado);
    }

}
