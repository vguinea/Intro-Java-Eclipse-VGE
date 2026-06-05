package ejercicios;

public class Ejercicio011 {

    public void mostrarTabla(int num) {
        System.out.println("Tabla del " + num + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
