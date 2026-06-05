package ejercicios;

import java.util.Scanner;

public class Ejercicio022 {

    public void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== MENÚ CALCULADORA ===");
            System.out.println("1. Sumar");
            System.out.println("0. Salir");

            opcion = sc.nextInt();

            if (opcion == 1) {
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double resultado = a + b;

                System.out.println("Resultado: " + resultado);
            }

        } while (opcion != 0);

        System.out.println("¡Hasta luego!");
    }
}


