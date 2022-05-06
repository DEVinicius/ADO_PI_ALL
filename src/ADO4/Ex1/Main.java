package ADO4.Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Utilizando a instrução switch escreva um programa que recebe um valor
        * inteiro de1 a 7 e retorna o correspondente dia da semana. Considere que
        * 1 corresponde adomingo, 2 a segunda-feira, ..., 7 a sábado. Além disso,
        * no caso de uma entradaerrada, como por exemplo 0, deve ser impresso “Valor inválido!”;
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 7 referente a um dia da semana: ");
        int diaDaSemana = scanner.nextInt();

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");

                break;

            case 2:
                System.out.println("Segunda-feira");

                break;

            case 3:
                System.out.println("Terca-feira");

                break;

            case 4:
                System.out.println("Quarta-feira");

                break;

            case 5:
                System.out.println("Quinta-feira");

                break;

            case 6:
                System.out.println("Sexta-feira");

                break;

            case 7:
                System.out.println("Sábado");

                break;

            default:
                System.out.println("Valor inválido");
                break;
        }
    }
}
