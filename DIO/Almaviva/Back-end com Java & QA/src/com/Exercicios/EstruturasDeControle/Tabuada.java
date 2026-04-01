package com.Exercicios.EstruturasDeControle;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        boolean continuar = true;

        do {
            System.out.println("Digite qualquer numero diferente de 0 e receba sua multiplicacao de 1 a 10");

            if (!scanner.hasNextInt()) {
                System.out.println("\nEntrada invalida.\nDigite apenas numeros.\n");
                scanner.nextLine();
                continue;
            }

            int value = scanner.nextInt();

            if (value != 0) {
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%d * %d = %d%n", value, i, value * i);
                }
            } else {
                System.out.println("\nValor invalido.");
            }

            System.out.println("\nDigite true para tentar novamente ou false para parar");

            while (!scanner.hasNextBoolean()) {
                System.out.println("\nValor invalido. Digite apenas true ou false.\n");
                scanner.nextLine();
            }

            continuar = scanner.nextBoolean();

            if (!continuar) {
                System.out.println("\nPrograma finalizado!");
            }

        } while (continuar);

    }

}
