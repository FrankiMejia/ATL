package Clase_6;

import java.util.Scanner;

public class buscadorPasise {
    public static void  main(String[] arg){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el pais que deseas buscar");
        String pais = teclado.nextLine();
        System.out.println("https://www.google.com/maps/search/" + pais);
    }
}
