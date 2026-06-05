package ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio037 {

    public void contarRepeticiones() {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        Map<Integer, Integer> conteo = new HashMap<>();

        // Leer números
        for (int i = 0; i < 5; i++) {
            numeros[i] = sc.nextInt();

            conteo.put(numeros[i], conteo.getOrDefault(numeros[i], 0) + 1);
        }

        // Mostrar resultados
        for (Map.Entry<Integer, Integer> entry : conteo.entrySet()) {
            System.out.print(entry.getKey() + " se repite " + entry.getValue() + " vez/veces ");
        }
    }
}


