package tp1;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio8 {
    public static final Logger log = Logger.getLogger(Ejercicio8.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notasAlumnos =new double[5];

        for (int i=0;i< notasAlumnos.length;i++){
            log.info("Porfavor ingrese las notas ");
            notasAlumnos[i]=sc.nextDouble();
        }
        double promedio = calcularPromedio(notasAlumnos);
        double notaMayor = notaMasAlta(notasAlumnos);

        log.info("El promedio es: "+promedio);
        log.info("La nota mas alta es: "+notaMayor);

    }
    public static double calcularPromedio(double[] notasAlumnos){
        double promedio=0;
        for (double notasAlumno : notasAlumnos) {
            promedio += notasAlumno / 5;
        }
        return (promedio);
    }
    public static double notaMasAlta(double[] notasAlumnos) {
        double notaMayor=0;
        for (double notasAlumno : notasAlumnos) {
            if (notasAlumno > notaMayor) {
                notaMayor = notasAlumno;
            }
        }
        return (notaMayor);

    }
}



