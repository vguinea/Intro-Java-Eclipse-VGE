package ejercicios;

import java.util.Scanner;

public class Ejercicio012 {

    public static int sumarHastaCero() {
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n == 0) break;
            suma += n;
        }

        return suma;
    }
}
