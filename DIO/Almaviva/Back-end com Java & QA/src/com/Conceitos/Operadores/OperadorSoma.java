package com.Conceitos.Operadores;

import java.util.Scanner;

public class OperadorSoma {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Quando é 2 + 2?");
        var result = scanner.nextInt();

        System.out.printf("Resposta 1: O resultado é 4, você acertou? (%s)", result == 4);
        /*Boolean
         *Comparando o valor da variável "result" com valor pré-posto dentro do sistema de saída
         */

        var isRight = result == 4;
        System.out.printf("\nResposta 2: O resultado é 4, você acertou? (%s)", isRight);
        /*Boolean
         *Usando a variável "isRight" para comparar o valor da variável "result" com valor pré-posto
         * Usando "isRight" dentro do sistema de saída para retornar o valor boolean
         */

        var isWrong = result != 4;
        System.out.printf("\nResposta 3: O resultado é 4, você errou? (%s)", isWrong);
        /*Lógica inversa
         *Verificando diferença de valores na variavel "isWrong"
         */

        var isWrong2 = result != 4;
        System.out.printf("\nResposta 4: O resultado é 4, você Acertou? (%s)", !isWrong2);
        /*Lógica inversa
         *Mantendo padrão de texto, trocando valor da variável no sistema de saída
         */
    }
}