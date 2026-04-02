package com.Exercicios.EstruturasDeControle;

import java.util.Scanner;

public class RestoZero {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        var value = scanner.nextInt();

        boolean difere = true;
        do {

            System.out.println("\nDigite o divisor do primeiro número: ");
            var value2 = scanner.nextInt();

            if (value2 < value) {
                System.out.println("Número ignorado (menor que o inicial)");
                continue;
            }

                if (value2 % value == 0) {
                    System.out.printf("\nO número %s é divisor de %s\n\n", value, value2);
                } else {
                    difere = false;
                    System.out.printf("\nO número %s não é divisor de %s\nFinalizando programa!\n", value, value2);
                }

        } while(difere);

    }
}
