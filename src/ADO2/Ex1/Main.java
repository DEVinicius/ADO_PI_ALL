package ADO2.Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double numero1 = 0;
        double numero2 = 0;
        double numero3 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        numero2 = scanner.nextDouble();

        System.out.println("Digite o terceiro numero: ");
        numero3 = scanner.nextDouble();

        double produto = numero1 * numero2 * numero3;

        System.out.println("O produto eh: " + produto);
    }
}
