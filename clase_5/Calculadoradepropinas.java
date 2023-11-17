package clase_5;

import java.util.Scanner;

public class Calculadoradepropinas {
    public static void main(String[] arg){
        System.out.println("Ingresa el total de la cuenta");
        Scanner cargaDeDatos = new Scanner(System.in);
        double totalCuenta = cargaDeDatos.nextDouble();

        System.out.println("Ingresa el porcentaje de propina que desea dejar");
        double porcentajePropina = cargaDeDatos.nextDouble();

        double propina = totalCuenta * (porcentajePropina / 100);
        System.out.println("La propina debera ser:" + propina);
    }
}
