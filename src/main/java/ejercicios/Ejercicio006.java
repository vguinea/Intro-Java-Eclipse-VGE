package ejercicios;


public class Ejercicio006 {

    public static String obtenerCalificacion(double nota) {

        if (nota < 0 || nota > 10) return "Nota no válida";

        if (nota < 5) return "Insuficiente";
        else if (nota < 6) return "Suficiente";
        else if (nota < 7) return "Bien";
        else if (nota < 9) return "Notable";
        else return "Sobresaliente";
    }
}

