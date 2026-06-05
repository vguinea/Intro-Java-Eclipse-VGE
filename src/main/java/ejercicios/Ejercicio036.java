package ejercicios;

import java.util.Scanner;

public class Ejercicio036 {

    public void comprobarPalindromo() {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            numeros[i] = sc.nextInt();
        }

        boolean esPalindromo = true;

        for (int i = 0; i < 5 / 2; i++) {
            if (numeros[i] != numeros[4 - i]) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.print("¡El array ES palíndromo!");
        } else {
            System.out.print("El array NO es palíndromo.");
        }
    }
}
