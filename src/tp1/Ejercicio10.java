package tp1;

import java.util.logging.Logger;

public class Ejercicio10 {
    public static final Logger log = Logger.getLogger(Ejercicio10.class.getName());

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        int posicion = 1;

        log.info("Array en orden original");
        for (int i = 0; i < numeros.length; i++) {
            log.info("Posicion " + posicion + ": " + numeros[i]);
            posicion++;
        }

        posicion = 1;

        int[] arrayRotado = rotarDerecha(numeros);

        log.info("Array rotado una posición a la derecha");
        for (int i = 0; i < arrayRotado.length; i++) {
            log.info("Posicion " + posicion + ": " + arrayRotado[i]);
            posicion++;
        }
    }

    public static int[] rotarDerecha(int[] array) {
        int[] nuevoArray = new int[array.length];
        // Guardo el último valor del array original en la primera posición del nuevo
        nuevoArray[0] = array[array.length - 1];

        // Copio el resto de los valores desplazados una posición a la derecha
        for (int i = 0; i < array.length - 1; i++) {
            nuevoArray[i + 1] = array[i];
        }

        return nuevoArray;
    }

}
