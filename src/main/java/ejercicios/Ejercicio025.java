package ejercicios;

import java.util.Scanner;

public class Ejercicio025 {

    public void numerosPrimosHastaN() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print("Números primos hasta " + n + ": ");

        for (int i = 2; i <= n; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private boolean esPrimo(int num) {
        if (num < 2) return false;

        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                return false;
            }
        }

        return true;
    }
}

