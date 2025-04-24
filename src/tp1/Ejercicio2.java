package tp1;

import java.util.Scanner;
import java.util.logging.Logger;


public class Ejercicio2 {

    public static final Logger log = Logger.getLogger(Ejercicio2.class.getName());

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //definimos el String para nuestro texto
        log.info("Porfavor introduzca el texto");
        String texto = sc.nextLine();
        //definimos nuestro char para la letra que se desa contar
        log.info("Ahora introduzca la letra");
        char letra = sc.next().charAt(0);

        //variable entera para analizar todas las letras del texto
        int contadorPosicionLetras = 0;
        //variable entera para contar cuantas letras se repiten
        int contadorRepLetra = 0;

        for (int i=0;i<texto.length(); i++){
            if (letra == texto.charAt(contadorPosicionLetras)){
                contadorRepLetra++;
                contadorPosicionLetras++;
            }else {
                contadorPosicionLetras++;
            }

        }

        if (contadorRepLetra>0){
            log.info("La letra: "+letra+" se repitio "+contadorRepLetra+" vez/veces");
        }else {
            log.info("La letra: "+letra+" no aparece en este texto");
        }

    }
}
