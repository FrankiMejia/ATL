package Clase_6;

import java.util.Scanner;

public class llamarWhatsapp {
    public static void main(String[] arg){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime a que numero de whatsapp deseas llamar? por favor incluye codigo de pais como se sugiere en el ejemplo:");
        System.out.println("503888888888 esto sin dejar ningun espacio");
        String telefono = teclado.next();
        System.out.println("https://api.whatsapp.com/send?phone=+" + telefono);
    }
}
