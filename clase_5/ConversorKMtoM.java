package clase_5;

import java.util.Scanner;

public class ConversorKMtoM {
    public static void main(String[] arg){
        System.out.println("Engrese las millas que deseas convetir");
        Scanner cargaDeDatos = new Scanner(System.in);
        double millas = cargaDeDatos.nextDouble();

        double kilometros = millas * 1.60934;
        System.out.println("las millas convertidas a Kilometros son: " + kilometros + " km");

    }
}
