package tp1;


import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    public static final Logger log=

            Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //definimos los strings de alumnos y sus notas
        String[] alumnos = {"Juan","Pablo","Tomas","Franco","Matias"};
        double[] notas = {6,7,6,9,8};

        log.info("Porfavor introduzca el nombre del estudiante buscado");
        //defino un string que nos permita comparar el nombre con la lista
        String alumnoBuscado = sc.nextLine();
        //creo una variable del tipo boolean para poder mostrar un mensaje en caso de que no exista el alumno
        boolean alumnoEncontrado = false;

        for (int i=0; i< alumnos.length; i++){
            if (alumnos[i].equalsIgnoreCase(alumnoBuscado)){
                log.info("La nota del alumno "+ alumnos[i] +" es: " + notas[i]);
                alumnoEncontrado = true;
                break;
            }
        }
        if (!alumnoEncontrado){
            log.warning("Alumno no encontrado");
        }

    }
}