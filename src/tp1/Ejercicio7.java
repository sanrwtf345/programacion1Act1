package tp1;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio7 {
      public static final  Logger log = Logger.getLogger(Ejercicio7.class.getName());

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            //Creamos array con los nombres de los meses
            String[] nombresMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
                    "Septiembre", "Octubre", "Noviembre", "Diciembre"};

            //creo otro arrray con la cantidad de dias de cada mes
            int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31,
                    30, 31, 30, 31};

            // Pedimos el número del mes
            log.info("Ingrese el número del mes (1-12): ");
            int numeroMes = sc.nextInt();

            // Uso el if para saber si esta dentro del rango aceptable
            if (numeroMes >= 1 && numeroMes <= 12) {
                String nombre = nombresMeses[numeroMes - 1];
                int dias = diasMes[numeroMes - 1];

                log.info("El mes de " + nombre + " tiene " + dias + " días.");
            } else {
                log.info("Número de mes inválido. Debe estar entre 1 y 12.");
            }

        }


}
