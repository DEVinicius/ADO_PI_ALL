package ADO6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Utilize a instrução switch e o laço/loop do-while para implementar umaquestão de
        * múltipla escolha referente a alguma das outras disciplinas que
        * vocêestá cursando neste semestre. Primeiro deverá ser apresentado o
        * enunciado daquestão com as 5 opções/alternativas de resposta, que são (a), (b), (c), (d) e (e).
        *
Depois que o usuário escolher uma opção, se for a resposta correta deveráserimpresso “Resposta correta”,
* caso contrário “Resposta incorreta”.
* No caso de“Resposta incorreta” a
* questão deve ser apresentada novamente para outratentativa.
* Deve ser permitido no máximo 3 tentativas, quando a respostacorreta
* for escolhida deve ser informado em qual tentativa isso ocorreu,
* casoisso não ocorra em nenhuma das 3 tentativas deve ser impresso “Respostaincorreta nas 3 tentativas”
        * */

        int numeroTentativas = 1;
        Scanner scanner = new Scanner(System.in);


        do {

            System.out.println("x + 4 = 9\nQual o valor do x ?\n\na - 3\nb - 4\nc - 5\nd - 6\ne - 7");
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
                    return;

                case 'e':
                    System.out.println("Resposta Incorreta");

                    break;

                default:
                    System.out.println("Valor inválido");
                    break;
            }
            numeroTentativas ++;
        } while(numeroTentativas <= 3);
        System.out.println("Limite de respostas atingido");
    }
}
