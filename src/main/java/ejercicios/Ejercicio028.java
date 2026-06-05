package ejercicios;

import java.util.Scanner;

public class Ejercicio028 {

    public void cajeroAutomatico() {
        Scanner sc = new Scanner(System.in);

        int saldo = 1000;
        int opcion;

        // ✅ IMPORTANTE: imprimir saldo inicial
        System.out.print("Saldo actual: " + saldo);

        do {
            opcion = sc.nextInt();

            if (opcion == 2) {
                int ingreso = sc.nextInt();
                saldo += ingreso;
                System.out.print("Ingreso realizado. Nuevo saldo: " + saldo);
            } 
            else if (opcion == 3) {
                int retiro = sc.nextInt();
                saldo -= retiro;
                System.out.print("Retiro realizado. Nuevo saldo: " + saldo);
            } 
            else if (opcion == 1) {
                System.out.print("Saldo actual: " + saldo);
            }

        } while (opcion != 0);
    }
}
