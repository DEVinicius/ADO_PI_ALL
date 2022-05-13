package ADO10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Sortear um valor aleatorio  entre 1 e 100
        int numeroAleatorio = (int) (Math.random() * 100);

        int numeroTentativas = 0;
        int numeroEscolhidoPeloUsuario = 0;

        boolean usuarioAcertouNumero = false;

        System.out.println("\nBem-vindo ao jogo de adivinhe o numero de 1 a 100\n* O seu objetivo é adivinhar qual o numero sorteado de forma" +
                " aleatória entre 1 a 100\n* Voce tem apenas 5 chances para resolver esse desafio\n\n\n* Relaxa que no decorrer do jogo vamos te ajudando a acertar\n\n");

        while(numeroTentativas < 5) {
            System.out.println("Digite seu palpite: ");
            numeroEscolhidoPeloUsuario = scanner.nextInt();

            if(
                    (numeroEscolhidoPeloUsuario + 1 == numeroAleatorio) ||
                    (numeroEscolhidoPeloUsuario - 1 == numeroAleatorio)
            ) {
                System.out.println("TA QUENTE");
            }
            else if(numeroEscolhidoPeloUsuario > numeroAleatorio) {
                System.out.println("O numero sorteado é menor.");
            } else if(numeroEscolhidoPeloUsuario < numeroAleatorio) {
                System.out.println("O numero sorteado é maior.");
            }

            if(numeroEscolhidoPeloUsuario == numeroAleatorio) {
                numeroTentativas = 5;
                usuarioAcertouNumero = true;
            }

            numeroTentativas ++;
        }

        if(usuarioAcertouNumero) {
            System.out.println("\n\nParabens, voce venceu o jogo");
            return;
        }

        System.out.println("\n\nPoxa! Suas chances acabaram, foi um bom jogo.\n\nO numero sorteado foi " + numeroAleatorio);
    }
}
