package com.Exercicios;

import java.util.Scanner;

public class DiferencaIdades {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa: ");
        var name = scanner.next();
        System.out.printf("Digite a idade de %s = ",name);
        var age = scanner.nextInt();

        System.out.println("\nDigite o nome da segunda pessoa: ");
        var name2 = scanner.next();
        System.out.printf("Digite a idade de %s = ",name2);
        var age2 = scanner.nextInt();

        var compare = Math.abs(age - age2);

        System.out.printf("\n%s tem %s anos\n%s tem %s anos\n\nA diferença de idade entre %s e %s é de %s anos\n",name, age, name2, age2,name, name2, compare);

    }

}
