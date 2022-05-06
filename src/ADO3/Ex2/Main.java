package ADO3.Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Dados 3 valores (possíveis lados) verificar se eles formam um triângulo, e em
        * casopositivo, dizer se é equilátero, isósceles ou escaleno;
        * */

        double[] ladosTriangulo = new double[3];
        Scanner scanner = new Scanner(System.in);

        for(int ladoTriangulo = 0; ladoTriangulo < 3; ladoTriangulo++) {
            System.out.println(
                String.format("Digite o tamanho do %d lado do triangulo: ", (ladoTriangulo + 1))
            );

            ladosTriangulo[ladoTriangulo] = scanner.nextDouble();
        }

        if((ladosTriangulo[0] == ladosTriangulo[1]) && (ladosTriangulo[0] == ladosTriangulo[2])) {
            System.out.println("Triangulo Equilatero");
        } else if(
                ((ladosTriangulo[0] == ladosTriangulo[1]) && (ladosTriangulo[0] != ladosTriangulo[2])) ||
                ((ladosTriangulo[1] == ladosTriangulo[0]) && (ladosTriangulo[1] != ladosTriangulo[2])) ||
                ((ladosTriangulo[2] == ladosTriangulo[0]) && (ladosTriangulo[2] != ladosTriangulo[1]))
        ) {
            System.out.println("Triangulo Isósceles");
        } else {
            System.out.println("Triangulo escaleno");
        }
    }
}
