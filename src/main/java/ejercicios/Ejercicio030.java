package ejercicios;

import java.util.Scanner;

public class Ejercicio030 {

    public void procesarNumeros() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce 5 números:");

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();

            if (num > max) {
                max = num;
            }
        }

        System.out.print("El mayor número es: " + max);
    }
}


