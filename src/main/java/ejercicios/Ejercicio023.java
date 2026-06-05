package ejercicios;

import java.util.Scanner;

public class Ejercicio023 {

    public void contarVocales() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase:");
        String frase = sc.nextLine();

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = Character.toLowerCase(frase.charAt(i));

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }

        System.out.print("La frase tiene " + contador + " vocales.");
    }
}

