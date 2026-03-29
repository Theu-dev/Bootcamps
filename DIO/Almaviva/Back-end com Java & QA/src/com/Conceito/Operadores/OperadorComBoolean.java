package com.Conceito.Operadores;

import java.util.Scanner;

public class OperadorComBoolean {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Qual sua idade? ");
        var age = scanner.nextInt();

        var canDrive = age > 17;// Podemos usar a comparação por "<=",">",">=" e "< " para fazer comparação de valores
        System.out.printf("Resposta 1: Permissão para dirigir: (%s)", canDrive);

        System.out.println("\n\nVocê é emancipado? ");
        var isEmancipated = scanner.nextBoolean();//Aqui deve-se escrever "true" ou "false" para o sistema de saída retornar o valor boolean

        var canDrive2 = age >= 18 || (isEmancipated && age >= 16);
        /*Multipla verificação usando o operador lógico "||"
        *para verificar se a idade é maior ou igual a 18 ou se a pessoa é emancipada */

        System.out.printf("Resposta 2: Permissão para dirigir: (%s)", canDrive2);
    }
}