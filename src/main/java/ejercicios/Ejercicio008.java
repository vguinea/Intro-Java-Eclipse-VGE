package ejercicios;

public class Ejercicio008 {

    public static boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    public static String describirAño(int año) {
        if (esBisiesto(año)) {
            return año + " ES bisiesto";
        } else {
            return año + " NO es bisiesto";
        }
    }
}
