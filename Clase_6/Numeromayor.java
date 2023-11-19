package Clase_6;

import java.util.Scanner;

public class Numeromayor {
    public static void main(String[] arg){
        //Cargar 3 numeros, y mostar el mayor y el menor
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cargue el primer numero");
        Integer numero1 = teclado.nextInt();


        int resto = numero1 % 2;
        if (resto == 0){
            System.out.println("es par");
        } else {
            System.out.println("es impar");

        }

    }
}

    // mayor de los tres digitos
     /*if ( numero1 > numero2 && numero1 > numero3);
             System.out.println("El numero menor es: " + numero1);

             if ( numero3 > numero1 && numero3 > numero2);
             System.out.println("El numero mas grande es: " + numero3);

             if ( numero2 > numero1 && numero2 > numero3);
             System.out.println("El numero de en medio es: " + numero2);*/


    //sacar promedio
    /*float promeidio = (numero1 + numero2 + numero3) / 3;
        System.out.println("El promedio de los tres numero es: " + promeidio);*/

