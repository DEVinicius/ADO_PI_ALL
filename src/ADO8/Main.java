package ADO8;

import java.lang.Math;

class Main {
    public static void main(String[] args) {

    /*Criacao de um vetor para armazenar a quantidade de vezes
      Que um numero foi selecionado de forma aleatória
    */
        int[] resultado = { 0, 0, 0, 0, 0, 0 };

        //Variavel para definir a quantidade de numeros que serão sorteados
        float contagemMaxima = 1000000;


        //Criacao dos numeros aleatorios
        for (int contador = 0; contador < contagemMaxima; contador ++) {
            //Logica para criar numeros entre 0 e 6
            // (int) conversao da conta para numero inteiro
            // Math.random() -> funcao para criar numero entre 0 e 1
            // (Math.random() * 6) + 1 -> Lógica para numero entre 1 e 6
            int numeroAleatorio = (int) (Math.random() * 6) + 1;

            // Contabilizar o resultado no vetor
            /* A cada vez que um numero aleatorio sai, é adicionado 1 em sua posicao*/
            resultado[numeroAleatorio - 1] = resultado[numeroAleatorio - 1] + 1;

            //[] -> É sempre referencia ao vetor
            //[numeroAleatorio - 1] -> Significa a posicao do vetor
            // ex: resultado[5] => Estamos acessando a sexta posicao do vetor, pois o mesmo comeca em 0
        }

        for(int i = 0; i < 6; i ++) {
            //Calculo da porcentagem de vezes que um resultado foi obtido
            float porcentagemValor = (float)((resultado[i] * 100)/contagemMaxima);
            //exibicao da porcentagem
            System.out.println("Numero " + (i + 1)+": " + porcentagemValor + " %");
        }
    }
}
