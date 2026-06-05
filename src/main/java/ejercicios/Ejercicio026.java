package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio026 {

    public void gestorUsuarios() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        while (true) {
            String nombre = sc.nextLine();

            if (nombre.equals("fin")) {
                break;
            }

            nombres.add(nombre);
        }

        if (nombres.isEmpty()) {
            System.out.print("No se introdujeron nombres.");
        } else {
            System.out.println("Cantidad de nombres: " + nombres.size());

            for (String n : nombres) {
                System.out.println(n);
            }
        }
    }
}
