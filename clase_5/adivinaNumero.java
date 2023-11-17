package clase_5;

import java.util.Scanner;

public class adivinaNumero {
    public static void main(String[] arg){
        Scanner cargaDeDatos = new Scanner(System.in);
        //double millas = cargaDeDatos.nextDouble();
        System.out.println("Bienvenido a este juego de adivinacion");

        int valorDado = (int)Math.floor(Math.random()*100);
        System.out.println("A continuacion; ingresa un numero entre el 1 al 100");
        int numeroDado = cargaDeDatos.nextInt();

        if (numeroDado == valorDado){
            System.out.println("Felicidades! lo adivinaste correctamente.");
        } else {
            System.out.println("Lo siente, el numero: " + numeroDado + " no es: " + valorDado + " Intenta nuevamente :D");
        }
    }
}
