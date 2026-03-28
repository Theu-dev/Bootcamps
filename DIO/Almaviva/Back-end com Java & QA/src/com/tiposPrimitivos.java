package com;

import java.util.Scanner;

public class tiposPrimitivos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, informe o seu nome: ");
        String name = scanner.next();

        System.out.println("Informe sua idade: ");
        int age = scanner.nextInt();

        System.out.println("Olá " + name + " Sua idade é " + age);
    }
}