package Clase_6;

import java.util.Scanner;

public class pruebas {
    public static void main(String[] arg){
        Scanner teclado = new Scanner(System.in);
        double numeroRandom = Math.random();

        int resultado = 0;
        if (numeroRandom < 1.0 / 3) {
            resultado = 1;
            System.out.println("Computadora eligió: Piedra");
        } else if (numeroRandom < 2.0 / 3) {
            resultado = 2;
            System.out.println("Computadora eligió: Papel");
        } else {
            resultado = 3;
            System.out.println("Computadora eligió: Tijera");
        }

        System.out.println("Escribe a continuación 1 para piedra, 2 para papel y 3 para tijera");
        int jugador = teclado.nextInt();

        if (jugador == 1) {
            if (resultado == 1) {
            System.out.println("EMPATE");
        } else if (resultado == 2) {
            System.out.println("YO GANO, ¡LUCERRR compu!");
        } else {
            System.out.println("TÚ GANAS");
        }
        } else if (jugador == 2) {
            if (resultado == 1) {
                System.out.println("YO GANO");
            } else if (resultado == 2) {
                System.out.println("EMPATE");
            } else {
                System.out.println("YO gaoo compu");
            }
        } else if (jugador == 3) {
            if (resultado == 1) {
                System.out.println("TÚ GANAS");
            } else if (resultado == 2) {
                System.out.println("YO GANO, ¡LUCERRR compu!");
            } else {
                System.out.println("EMPATE");
            }
        }
    }
}
