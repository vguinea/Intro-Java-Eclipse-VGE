package ejercicios;

import java.util.Scanner;

public class Ejercicio024 {

    public void calculadoraNotas() {
        Scanner sc = new Scanner(System.in);

        int suma = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce nota: ");
            int nota = sc.nextInt();

            suma += nota;

            if (nota > max) {
                max = nota;
            }

            if (nota < min) {
                min = nota;
            }
        }

        int media = suma / 5;

        System.out.println("=== RESULTADOS ===");
        System.out.println("Media: " + media);
        System.out.println("Nota más alta: " + max);
        System.out.println("Nota más baja: " + min);
    }
}


