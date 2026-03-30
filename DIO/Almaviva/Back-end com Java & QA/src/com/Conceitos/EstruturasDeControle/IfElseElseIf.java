package com.Conceitos.EstruturasDeControle;

import java.util.Scanner;

public class IfElseElseIf {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        var name = scanner.next();
        System.out.println("Infome sua idade");
        var age = scanner.nextInt();

        if (age >=18) {
            System.out.println("\nBem vindo!");
            System.out.printf("%s, você tem %s anos, você pode dirigir\n", name, age);

        /*Dentro de uma operação condicional,
        se trabalhamos com uma linha de código não precisa "{}"*/
        } else if (age > 15 && age < 18){

            System.out.printf("\n%s, você é emancipado? ", name);
            var isEmancipated = scanner.next().equalsIgnoreCase("Sim");

            if (isEmancipated) System.out.printf("\n%s, apesar de você ter %s anos é emancipado,Logo, pode dirigir.\n", name, age);
            else System.out.printf("\nDesculpe %s, você não é emancipado e não tem idade suficiente para dirigir.\n", name);

        } else System.out.printf("\nDesculpe %s, você não tem idade suficiente para dirigir.\n", name);


        System.out.println("Fim da execução!");


    }
}
