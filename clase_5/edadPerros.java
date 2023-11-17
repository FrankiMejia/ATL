package clase_5;

import java.util.Scanner;

public class edadPerros {
    public static void main(String[] arg) {
        System.out.println("Escribe la edad de tu perrro");
        Scanner cargaDeDatos = new Scanner(System.in);
        Integer edad = cargaDeDatos.nextInt();

        Integer añosDePerro = 7;
        Integer edadCalculada = añosDePerro *  edad;
        System.out.println("La edad es de: " + edadCalculada);
    }
}
