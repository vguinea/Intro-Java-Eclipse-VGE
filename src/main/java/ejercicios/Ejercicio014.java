package ejercicios;

public class Ejercicio014 {

    public static long calcularFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                "El factorial no se puede calcular para números negativos"
            );
        }

        long r = 1;
        for (int i = 2; i <= n; i++) r *= i;
        return r;
    }
}
