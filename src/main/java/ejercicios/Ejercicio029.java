package ejercicios;

import java.util.Scanner;

public class Ejercicio029 {

    public void secuenciaFibonacci() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print("Secuencia Fibonacci (" + n + " términos): ");

        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}


