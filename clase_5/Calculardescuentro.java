package clase_5;

import java.util.Scanner;

public class Calculardescuentro {
    public static void main(String[] arg){
        System.out.println("Engrese el precio orginal del producto");
        Scanner cargaDeDatos = new Scanner(System.in);
        double precioOriginal = cargaDeDatos.nextDouble();

        System.out.println("Engresa el porcentaje de descuento");
        double porcertanjeDescuento = cargaDeDatos.nextDouble();

        double precioFinal = precioOriginal - (precioOriginal * porcertanjeDescuento / 100);
        System.out.println("El precio final despues de aplicar el descuento es: " + precioFinal);
    }
}
