package tp1;

import java.util.logging.Logger;

public class Ejercicio5 {
    public static final Logger log = Logger.getLogger(Ejercicio5.class.getName());

    public static void main(String[] args) {

        //inicializo el array para los vectores
        int[] vectorNumeros= new int[10];

        //inicializo las variables para guardar los cuadrados y los cubos de los vectores
        int cuadradoVector = 0;
        int cuboVector = 0;
        //contador para ver la posicion del vector
        int contadorVectores=0;

        for (int i=0;i< vectorNumeros.length;i++){
            vectorNumeros[i]=(int)(Math.random() * 11);
        }
        for (int i=0;i< vectorNumeros.length;i++){
            cuadradoVector = vectorNumeros[i]*vectorNumeros[i];
            cuboVector = vectorNumeros[i]*vectorNumeros[i]*vectorNumeros[i];
            contadorVectores++;
            log.info("El vector "+contadorVectores+"° es: "+vectorNumeros[i]+" Su cuadrado es: "+cuadradoVector+" Y su cubo es: "+cuboVector);

            //reinicio los cubos y cuadrados
            cuadradoVector = 0;
            cuboVector = 0;

        }

    }
}
