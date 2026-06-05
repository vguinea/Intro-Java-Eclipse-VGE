package ejercicios;

import java.util.Scanner;

public class Ejercicio034 {

    public void buscarNumeroArray() {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        // Leer los 5 números
        for (int i = 0; i < 5; i++) {
            numeros[i] = sc.nextInt();
        }

        // Número a buscar
        int buscado = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < 5; i++) {
            if (numeros[i] == buscado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.print("¡El número " + buscado + " SÍ existe en el array!");
        } else {
            System.out.print("El número " + buscado + " NO existe en el array.");
        }
    }
}



