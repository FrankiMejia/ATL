package Clase_6;

import java.util.Scanner;

public class buscadorDeTweets {
    public static void main(String[] arg){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime que palabra en x quieres buscar");
        String tweet = teclado.nextLine();
        System.out.println("https://twitter.com/search?q=" + tweet);
    }
}
