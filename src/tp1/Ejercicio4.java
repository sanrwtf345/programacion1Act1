package tp1;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio4 {
    public static final Logger log = Logger.getLogger(Ejercicio4.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //definimos las variables para nuestros arrays con la informacion de los productos
        String[] productos = new String[3];

        int[] unidadesProd = new int[3];

        double[] precioUnitario = new double[3];

        //defino variables para almacenar los totales
        double totalProductos = 0;

        for (int i=0;i< productos.length;i++){
            log.info("Ingrese el producto");
            productos[i] = sc.nextLine();
            log.info("Ingrese el precio unitario del producto");
            precioUnitario[i] = sc.nextDouble();
            log.info("Ingrese el numero de unidades");
            unidadesProd[i] = sc.nextInt();
            sc.nextLine();
            totalProductos = (precioUnitario[i]*unidadesProd[i])+totalProductos;

        }
        for (int i=0;i< productos.length;i++){
            log.info("Producto: "+productos[i]+" Precio unitario: "+precioUnitario[i]+" Unidades del producto: "+ unidadesProd[i]);
        }

        log.info("El total de la compra es de: " +totalProductos);


    }
}
