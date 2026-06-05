package ejercicios;

public class Ejercicio010 {

    public void mostrarFor() {
        System.out.print("FOR ");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }

    public void mostrarWhile() {
        System.out.print("WHILE ");
        int i = 1;
        while (i <= 100) {
            System.out.print(i + " ");
            i++;
        }
    }

    public void mostrarDoWhile() {
        System.out.print("DO-WHILE ");
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 100);
    }
}




