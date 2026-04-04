package com.Exercicios.EstruturasDeControle;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número apartir de 1:");
        var value = scanner.nextInt();

        System.out.println("Digite o segundo número(Deve ser maior que o primeiro):");
        var value2 = scanner.nextInt();


        System.out.println("Digite par para saber os números pares ou ímpar para saber os números ímpares:");
        var parOuImpar = scanner.next();

        int i;

        if (value < value2 && parOuImpar.equalsIgnoreCase("par")) {

            System.out.println("\nNúmeros pares do intervalo:");

            for (i = value; i <= value2; value2--) {
                float par = (float) value2 % 2;
                if (par == 0) {

                    System.out.printf("%s ", value2);

                }
            }
        } else if (value < value2 && parOuImpar.equalsIgnoreCase("impar")) {

            System.out.println("\nNúmeros ímpares do intervalo:");

            for (i = value; i <= value2; value2--) {
                float impar = (float) value2 % 2;
                if (impar != 0) {

                    System.out.printf("%s ", value2);

                }
            }
        }

    }
}



