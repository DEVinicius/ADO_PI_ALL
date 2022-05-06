package ADO4.Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Implemente uma questão de múltipla escolha referente a alguma das outrasdisciplinas que você
        * está cursando neste semestre. Primeiro deverá ser apresentadoo enunciado da questão com as
        *  5 opções/alternativas de resposta, que são (a), (b), (c), (d) e (e). Depois que o usuário
        * escolher uma opção, se for a resposta corretadeverá ser impresso “Resposta correta”,
        * caso contrário “Resposta incorreta”. Utilize a instrução switch, invés de if, na implementação.
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("x + 4 = 9\nQual o valor do x ?\n\na - 3\nb - 4\nc -5\nd - 6\ne - 7");
        char resposta = scanner.next().charAt(0);

        switch (resposta) {
            case 'a':
                System.out.println("Resposta Incorreta");

                break;

            case 'b':
                System.out.println("Resposta Incorreta");

                break;

            case 'c':
                System.out.println("Resposta Incorreta");

                break;

            case 'd':
                System.out.println("Resposta Correta");

                break;

            case 'e':
                System.out.println("Resposta Incorreta");

                break;

            default:
                System.out.println("Valor inválido");
                break;
        }

    }
}
