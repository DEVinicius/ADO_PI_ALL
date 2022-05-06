package ADO3.Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        /*
        * Uma loja oferece para seus clientes um desconto de acordo com o valor dacompra.
        * Este desconto é de 20% se o valor da compra for maior ou igual a R$300,00 e 15% se for menor.
        * Dado o valor do produto, mostre o valor (descontado)da compra do cliente e o valor do desconto obtido;
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da Compra: ");
        double compra = scanner.nextDouble();

        if(compra >= 300) {
            compra = compra - (0.2 * compra);
        } else {
            compra = compra - (0.15 * compra);
        }

        String message = String.format("A valor da compra com desconto ficou igual a %.2f", compra);
        System.out.println(message);
    }
}
