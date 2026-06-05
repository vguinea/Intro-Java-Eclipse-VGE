package ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio004Test {
	
	Ejercicio004 ejercicio004 = new Ejercicio004();
	
	@Test
    void testAreaTriangulo_ValoresEnteros() {
        double area = ejercicio004.calcularArea(10.0, 5.0);
        assertEquals(25.0, area);
    }

    @Test
    void testAreaTriangulo_BaseOCero() {
        double area = ejercicio004.calcularArea(0.0, 5.0);
        assertEquals(0.0, area);
    }

    @Test
    void testAreaTriangulo_AlturaOCero() {
        double area = ejercicio004.calcularArea(10.0, 0.0);
        assertEquals(0.0, area);
    }

    @Test
    void testAreaTriangulo_Decimales() {
        double area = ejercicio004.calcularArea(3.5, 4.2);
        assertEquals((3.5 * 4.2) / 2.0, area);
    }
}
