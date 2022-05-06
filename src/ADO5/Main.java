package ADO5;

import java.util.Scanner;

public class Main {
    /*
    * Crie um menu que permita o usuário escolher as seguintes opções para umjogo:
        1 – Instruções
        2 – Jogar
        3 – Créditos
        4 – Sair
        Utilize a estrutura switch dentro de um laço do-while, na implementação.
        * Omenu deixará de ser mostrado apenas quando o usuário escolher a opção 4 –Sair
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isMenuOpen = true;
        int escolhaUsuario = 0;

        do {
            System.out.println("Digite: \n1 - Instrucoes\n2 - Jogar\n3 - Creditos\n4 - Sair");
            escolhaUsuario = scanner.nextInt();

            switch (escolhaUsuario) {
                case 1:
                    System.out.println("INSTRUCOES");
                    break;

                case 2:
                    System.out.println("Jogar");
                    break;

                case 3:
                    System.out.println("CREDITOS");
                    break;

                case 4:
                    System.out.println("ATE MAIS");
                    isMenuOpen = false;
                    break;

                default:
                    System.out.println("Operacao invalida");
                    break;
            }
        } while(isMenuOpen);
    }
}
