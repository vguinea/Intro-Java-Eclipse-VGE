package ejercicios;

import java.util.Scanner;

public class Ejercicio027 {

    public void decimalABinario() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String binario = Integer.toBinaryString(n);

        System.out.print("Binario: " + binario);
    }
}

