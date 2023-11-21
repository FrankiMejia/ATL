package Clase_6;

import java.util.Scanner;

public class historiaIntectiva {
    public static void main(String[] arg){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido a tu historia interactiva");
        System.out.println("El Misterio del Reloj Encantado");
        System.out.println("Estás caminando por un antiguo mercado lleno de curiosidades cuando encuentras un reloj antiguo en una tienda de objetos raros. El dueño de la tienda te advierte que el reloj es mágico y puede llevarte a lugares inexplorados en el tiempo. ¿Qué decides hacer?");
        System.out.println("1. elige esta opcion 1");
        System.out.println("2. elige esta opcion 2");
        System.out.println("3. elige esta opcion 3");
        System.out.println("Pon el numero de la opcion que eliges");
        int opcion = teclado.nextInt();
        if (opcion == 1) {
            System.out.println("Opción 1 segundo nivel");
            System.out.println("1. elige esta opcion 1");
            System.out.println("2. elige esta opcion 2");
            System.out.println("3. elige esta opcion 3");
            System.out.println("Pon el numero de la opcion que eliges");
            opcion = teclado.nextInt();
            if (opcion == 1 || opcion == 2 || opcion == 3){
                System.out.println("tercer nivel");
                System.out.println("FIN");
            } else {
                System.out.println("elige  un numero correcto");
            }
        } else if (opcion == 2) {
            System.out.println("Opción 2 segundo nivel");
            System.out.println("1. elige esta opcion 1");
            System.out.println("2. elige esta opcion 2");
            System.out.println("3. elige esta opcion 3");
            System.out.println("Pon el numero de la opcion que eliges");
            opcion = teclado.nextInt();
            if (opcion == 1 || opcion == 2 || opcion == 3){
                System.out.println("tercer nivel");
                System.out.println("FIN");
            }  else {
                System.out.println("elige  un numero correcto");
            }
        } else if (opcion == 3) {
            System.out.println("Opción 3 segundo nivel");
            System.out.println("1. elige esta opcion 1");
            System.out.println("2. elige esta opcion 2");
            System.out.println("3. elige esta opcion 3");
            System.out.println("Pon el numero de la opcion que eliges");
            opcion = teclado.nextInt();
            if (opcion == 1) {
                System.out.println("tercer nivl final");
                System.out.println("1. elige esta opcion 1");
                System.out.println("2. elige esta opcion 2");
                System.out.println("3. elige esta opcion 3");
                System.out.println("Pon el numero de la opcion que eliges");
                opcion = teclado.nextInt();
                if (opcion == 1 || opcion == 2 || opcion == 3){
                    System.out.println("cuarto nivel");
                    System.out.println("FIN");
                }
            } else if (opcion == 2) {
                System.out.println("tercer nivel 2");
                System.out.println("1. elige esta opcion 1");
                System.out.println("2. elige esta opcion 2");
                System.out.println("3. elige esta opcion 3");
                System.out.println("Pon el numero de la opcion que eliges");
                opcion = teclado.nextInt();
                if (opcion == 1 || opcion == 2 || opcion == 3){
                    System.out.println("cuarto nivel");
                    System.out.println("FIN");
                }
            } else if (opcion == 3) {
                System.out.println("tercer nivel 3");
                System.out.println("1. elige esta opcion 1");
                System.out.println("2. elige esta opcion 2");
                System.out.println("3. elige esta opcion 3");
                System.out.println("Pon el numero de la opcion que eliges");
                opcion = teclado.nextInt();
                if (opcion == 1 || opcion == 2 || opcion == 3){
                    System.out.println("cuarto nivel");
                    System.out.println("FIN");
                }
            } else {
                System.out.println("elige un numero correcto");
            }
        }  else {
            System.out.println("elige  un numero correcto");
        }
    }
}

