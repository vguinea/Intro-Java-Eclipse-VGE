package ejercicios;

public class Ejercicio009 {

    public static double obtenerMayor(double a, double b, double c) {
        double max = a;

        if (b > max) max = b;
        if (c > max) max = c;

        return max;
    }
}
