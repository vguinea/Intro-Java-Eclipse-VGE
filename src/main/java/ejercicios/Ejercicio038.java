package ejercicios;

import java.util.Random;


public class Ejercicio038 {


    public int generarNumeroSecreto() {
        Random rand = new Random();
        return rand.nextInt(50) + 1;
    }


    public String comprobarIntento(int secreto, int intento) {

        if (intento > secreto) {
            return "¡Más alto!";
        } else if (intento < secreto) {
            return "¡Más bajo!";
        } else {
            return "¡CORRECTO! El número era: " + secreto;
        }
    }
}


