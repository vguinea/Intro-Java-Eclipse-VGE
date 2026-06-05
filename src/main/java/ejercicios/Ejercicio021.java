package ejercicios;

public class Ejercicio021 {

    public int contarVocales(String texto) {
        if (texto == null) return 0;

        int count = 0;
        texto = texto.toLowerCase();

        for (char c : texto.toCharArray()) {
            if ("aeiou".contains("" + c)) count++;
        }

        return count;
    }
}

