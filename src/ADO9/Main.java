package ADO9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor minimo");
        double min = scanner.nextDouble();

        System.out.println("Digite o valor maximo");
        double max = scanner.nextDouble();

        if(min > max) {
            double auxiliar = min;
            min = max;
            max = auxiliar;
        }

        double angularCoefficient = (Math.random() * ((max - min) + 1)) + min;
        double linearCoefficient = (Math.random() * ((max - min) + 1)) + min;

        String message = String.format("A respectiva funcao do primeiro grau, obedecendo o intervalo de %.2f a %.2f eh:\nf(x) = %.2f * x + %.2f ", min, max, angularCoefficient, linearCoefficient);
        System.out.println(message);

    }
}
