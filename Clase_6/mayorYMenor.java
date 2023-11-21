package Clase_6;

import java.util.Scanner;

public class mayorYMenor {
    public static void main(String[] arg){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Mayor y menor de 3 numeros");
        System.out.println("ingrese el primer numero");
        int numero1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero2 = teclado.nextInt();
        System.out.println("Ingrese el tercer numero");
        int numero3 = teclado.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El número mayor es: " + numero1);
        }

        if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("El número mayor es: " + numero3);
        }

        if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El número mayor es: " + numero2);
        }

        if (numero1 < numero2 && numero1 < numero3) {
            System.out.println("El número mayor es: " + numero1);
        }

        if (numero3 < numero1 && numero3 < numero2) {
            System.out.println("El número menor es: " + numero3);
        }

        if (numero2 < numero1 && numero2 < numero3) {
            System.out.println("El número menor es: " + numero2);
        }


    }
}

