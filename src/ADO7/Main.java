package ADO7;

import java.util.*;

public class Main {
    private static int asciiLetter = 97;
    private static List<TypeAnswer> typeAnswers = Arrays.asList();

    public static  void changeAsciiLetter() {
        asciiLetter = asciiLetter + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Answer> answerList = Arrays.asList(
            new Answer("Funcao Quadrática", true),
            new Answer("Funcao Exponencial", false),
            new Answer("Funcao Afim", false),
            new Answer("Funcao Logaritima", false),
            new Answer("Funcao Modular", false)
        );

        System.out.println("Qual a funcao que no gráfico exibe uma parabola? ");
        Collections.shuffle(answerList);


        answerList.forEach(ans -> {
            System.out.println(
                    String.format("%c - %s", (char) asciiLetter, ans.value)
            );

            typeAnswers.add(new TypeAnswer((char) asciiLetter, ans.isCorrect));

            changeAsciiLetter();
        });
        char escolhaUsuario = scanner.next().charAt(0);

        switch (escolhaUsuario) {
            case 'a':
                TypeAnswer answer =  typeAnswers.stream()
                        .filter(item -> item.value == escolhaUsuario).findAny().orElse(null);

                System.out.println(answer);
                break;

            /*case 'b':
                TypeAnswer answerB =  typeAnswers.stream()
                        .filter(item -> item.value == escolhaUsuario).findAny().orElse(null);

                System.out.println(answerB);

                break;

            case 'c':
                TypeAnswer answerC =  typeAnswers.stream()
                        .filter(item -> item.value == escolhaUsuario).findAny().orElse(null);

                System.out.println(answerC);

                break;

            case 'd':
                TypeAnswer answerD =  typeAnswers.stream()
                        .filter(item -> item.value == escolhaUsuario).findAny().orElse(null);

                System.out.println(answerD);
                return;

            case 'e':
                TypeAnswer answerE =  typeAnswers.stream()
                        .filter(item -> item.value == escolhaUsuario).findAny().orElse(null);

                System.out.println(answerE);

                break;*/

            default:
                System.out.println("Valor inválido");
                break;
        }
    }
}
