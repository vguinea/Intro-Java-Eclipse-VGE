package ejercicios;

public class Ejercicio019 {
    public static int potencia(int base, int exp) {
        if (exp < 0) {
            throw new IllegalArgumentException("El exponente debe ser no negativo");
        }

        int r = 1;
        for (int i = 0; i < exp; i++) r *= base;
        return r;
    }
}
