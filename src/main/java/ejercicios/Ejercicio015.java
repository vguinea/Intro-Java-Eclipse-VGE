package ejercicios;

public class Ejercicio015 {

    public void mostrarMultiplosTres(int n) {

        if (n < 3) {
            System.out.print("No debe mostrar múltiplos si N < 3");
            return;
        }

        System.out.print("Múltiplos de 3 hasta " + n + ": ");

        for (int i = 3; i <= n; i += 3) {
            System.out.print(i + " ");
        }
    }
}

