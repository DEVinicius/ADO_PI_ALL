package ADO3.Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Dado um ano com 4 dígitos dizer ser ele é um ano bissexto ou não.
        * (Lembre-seque um ano é bissexto se ele for divisível por 400 ou se
        * ele for divisível por 4 enão por 100.)
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de um ano com 4 digitos");
        int ano = scanner.nextInt();

        if((ano % 400 == 0) || (ano % 4 == 0 && !(ano % 100 == 0))) {
            System.out.println("Ano Bissexto");
        } else {
            System.out.println("Ano nao Bissexto");
        }
    }
}
