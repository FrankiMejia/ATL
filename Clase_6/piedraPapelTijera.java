package Clase_6;

import java.util.Scanner;

public class piedraPapelTijera {
    public static void main(String[] arg){
        Scanner teclado = new Scanner(System.in);
        double numeroRandom = Math.random();

        int resultado = 0;
        if (numeroRandom < 1.0 / 3) {
            resultado = 1;
            System.out.println(resultado);
        } else if (numeroRandom < 2.0 / 3) {
            resultado = 2;
            System.out.println(resultado);
        } else {
            resultado = 3;
            System.out.println(resultado);
        }
        System.out.println("Escribe a continuacion 1. para piedra. 2. para papel y 3. para tijera");
        int jugador = teclado.nextInt();

        int piedra = 1;
        int papel = 2;
        int tijera = 3;

        if (jugador == piedra){
            if (resultado == 1 ){
                System.out.println("EMPATE");
            } else if (resultado ==2 ){
                System.out.println("TU GANAS");
            } else {
                System.out.println("YO GANO,LUCERRR compu");
            }
        } else if (jugador == papel) {
            if (resultado == 1 ){
                System.out.println("YO GANO, LUCERRR compu");
            } else if (resultado == 2 ){
                System.out.println("EMPATE");
            } else {
                System.out.println("YO PIERDO");
            }
        } else if (jugador == tijera) {
                if (resultado == 1 ){
                    System.out.println("TU GANAS");
                } else if (resultado ==2 ){
                    System.out.println("YO GANO, LUCERRR compu");
                } else {
                    System.out.println("EMPATE");
                }
        }
    }
}

