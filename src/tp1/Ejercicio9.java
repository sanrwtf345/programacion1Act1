package tp1;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio9 {
    public static final Logger log = Logger.getLogger(Ejercicio9.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        log.info("Para pasar de Celsius a Fahrenheit seleccione la opcion 1, para pasar de Fahrenheit A Celsius sleccione la opcion 2");
        //variable para seleccionar el tipo de conversion
        int opciones= sc.nextInt();

        //utilizo un switch para elegir el tipo de conversion
        switch (opciones){
            case 1:
                log.info("Introduzca el valor en Fahrenheit a convertir");
                //inicializo e introduzco el valor a convertir y que luego es utilizado por la funcion
                double valorFahrenheit= sc.nextDouble();
                celsiusAFahrenheit(valorFahrenheit);
                break;

            case 2:
                log.info("Introduzca el valor en Celsius a convertir");
                double valorCelsius=sc.nextDouble();
                fahrenheitACelsius(valorCelsius);
                break;
            //El default nos muestra una advertencia en caso de que elijamos una opcion distina a 1 o 2
            default:
                log.warning("Opcion invalida, solo se puede selccionar la opcion 1 o 2");
        }

    }
    //Funcion para pasar de celsius a fahrenheit recibiendo
    public static void celsiusAFahrenheit(double valorFahrenheit){
        double conversionF=(valorFahrenheit-32) * 5/9;
        log.info("El valor: "+valorFahrenheit+"F equivale a: "+conversionF+"C°");

    }
    public static void fahrenheitACelsius(double valorCelsius){
        double conversionC=(valorCelsius * 9/5) + 32;
        log.info("El valor: "+valorCelsius+"C° equivale a: "+conversionC+"F");

    }

}
