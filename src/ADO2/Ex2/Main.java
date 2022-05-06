package ADO2.Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Dado um valor inteiro N imprimir os 3 primeiros múltiplos deste valor;
        * */

        double numero1 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");

        numero1 = scanner.nextDouble();

        String message = String.format("Os multiplos do numero %.2f são: \n%.2f, %.2f e %.2f", numero1, (numero1 * 0), (numero1 * 1), (numero1 * 2));
        System.out.println(message);
    }
}
