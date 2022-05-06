package ADO2.Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Dado um nome (String) não composto, imprimir a quantidade decaracteres deste nome.
        * */

        String text = "";

        Scanner scanner = new Scanner(System.in);
        boolean isTextCorrect = false;

        while(!isTextCorrect) {
            System.out.println("Digite um texto nao composto: ");
            text = scanner.next();

            boolean hasWhitespace = false;
            for(int position = 0; position < text.length(); position++) {
                if(text.charAt(position) == ' ') {
                    hasWhitespace = true;
                }
            }

            if(!hasWhitespace) {
                System.out.println(text  );
                isTextCorrect = true;
            }

            scanner.nextLine();
        }

        int numeroDeCaracteres = text.length();
        String message = String.format("O numero de caracteres do texto %s eh: %d", text, numeroDeCaracteres);
        System.out.println(message);
    }
}
