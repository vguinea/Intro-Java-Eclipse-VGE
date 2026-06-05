package ejercicios;

public class Ejercicio007 {

    public static String obtenerDiaSemana(int dia) {
        switch (dia) {
            case 1: return "Lunes";
            case 2: return "Martes";
            case 3: return "Miércoles";
            case 4: return "Jueves";
            case 5: return "Viernes";
            case 6: return "Sábado";
            case 7: return "Domingo";
            default: return "Número inválido (usa 1-7)";
        }
    }
}
