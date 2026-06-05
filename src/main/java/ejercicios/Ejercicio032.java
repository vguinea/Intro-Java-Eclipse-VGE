package ejercicios;

import java.util.Scanner;

public class Ejercicio032 {

    public void contarParesArray() {
        Scanner sc = new Scanner(System.in);

        int contador = 0;

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                contador++;
            }
        }

        System.out.print("Hay " + contador + " números pares.");
    }
}

