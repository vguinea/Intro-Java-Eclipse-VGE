package ejercicios;

import java.util.Scanner;

public class Ejercicio035 {

    public void calcularMediaArray() {
        Scanner sc = new Scanner(System.in);

        int suma = 0;

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            suma += num;
        }

        int media = suma / 5;

        System.out.print("La media es: " + media);
    }
}

