package tp1;

import java.util.logging.Logger;

public class Ejercicio3 {
    public static final Logger log = Logger.getLogger(Ejercicio3.class.getName());

    public static void main(String[] args) {
    //definimos nuestro array
    int[] numeros={1,5,6,2,12,45};
    //esta variable entera solamente sirve para marcar las posiciones de cada valor del array
    int orden = 1;

    log.info("Array en orden original");

    //recorremos array en orden original
    for (int i=0;i< numeros.length;i++){
        log.info(orden+"° :"+numeros[i]);
        orden++;
    }
    //reiniciamos la variable para las posiciones
    orden=1;

    log.info("Array en orden invertido");
    //cambiamos el for para que el recorrido comience de atras hacia adelante
    for (int i = numeros.length - 1; i >= 0; i--){
        log.info(orden+"° :"+numeros[i]);
        orden++;
    }

    }
}
