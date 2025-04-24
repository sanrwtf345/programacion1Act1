package tp1;


import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio6 {
    public static final Logger log = Logger.getLogger(Ejercicio6.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creamos el vector de cadenas original
        String[] vectorCaracteres = new String[5];

        for (int i=0;i<vectorCaracteres.length;i++){
            log.info("Porfavor ingrese una cadena de caracteres");
            vectorCaracteres[i]= sc.nextLine();

        }

        //creamos otro String para la cadena invertida
        String[] cadenaInvertida = new String[5];

        for (int i=0;i<cadenaInvertida.length;i++){
            //hacemos que los datos de la lista de vectores original se guarde en el array nuevo pero de atras hacia adelante
            cadenaInvertida[i]=vectorCaracteres[vectorCaracteres.length-1-i];

        }

        for (String s : cadenaInvertida) {
            log.info("Los caracteres son: " + s);

        }



    }

}
