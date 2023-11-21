package Clase_6;

import java.util.Scanner;

public class promedio5 {
    public static void main(String[] arg){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Promedio de 3 numeros");
        System.out.println("Escribe el primer numero");
        float numero1 = teclado.nextFloat();
        System.out.println("Escribe el segundo numero");
        float numero2 = teclado.nextFloat();
        System.out.println("Escribe el tercer numero");
        float numero3 = teclado.nextFloat();
        float promedio = (numero1+numero2+numero3)/3;
        System.out.println("El promedio es: " + promedio);
    }
}
