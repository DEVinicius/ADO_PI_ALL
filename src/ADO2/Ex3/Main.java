package ADO2.Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Dado um valor inteiro de 1 até 10, imprimir a “tabela” da tabuada deste valor;
        * */

        Scanner scanner = new Scanner(System.in);
        int number = 0;

        boolean isNumberWrong = true;

        while (isNumberWrong) {
            System.out.println("Digite um numero entre 1 a 10");
            number = scanner.nextInt();

            if(number > 0 && number < 10) {
                isNumberWrong = false;
            }
        }

        for (int multiplicador = 1; multiplicador <= 10; multiplicador ++) {
            String message = String.format("%d x %d = %d", number, multiplicador, (number * multiplicador));
            System.out.println(message);
        }
    }
}
