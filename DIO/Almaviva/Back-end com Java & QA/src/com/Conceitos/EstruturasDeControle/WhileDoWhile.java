package com.Conceitos.EstruturasDeControle;

import java.util.Scanner;

public class WhileDoWhile {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var  name = "";

    while (!name.equalsIgnoreCase("Exit")) {

        System.out.println("Digite um nome: ");
        name = scanner.next();

        System.out.println("Olá " + name + "\n");
    }

        System.out.println("Laço do while\n");

    do {

        System.out.println("Digite um nome:");
        name = scanner.next();

        if (name.equalsIgnoreCase("Exit")) {
            break;
        }

        System.out.println("Olá " + name + "\n");

    }  while(true);

    }
}
