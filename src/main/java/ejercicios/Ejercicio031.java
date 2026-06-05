package ejercicios;

import java.util.Scanner;

public class Ejercicio031 {

    public void sumarElementosArray() {
        Scanner sc = new Scanner(System.in);

        int suma = 0;

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            suma += num;
        }

        System.out.print("La suma total es: " + suma);
    }
}

