package ejercicios;

import java.util.Scanner;

public class Ejercicio033 {

    public void invertirArray() {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        // Leer números
        for (int i = 0; i < 5; i++) {
            numeros[i] = sc.nextInt();
        }

        // Mostrar array original
        System.out.print("Array original: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " ");
        }

        // Mostrar array invertido
        System.out.print("\nArray invertido: ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}

