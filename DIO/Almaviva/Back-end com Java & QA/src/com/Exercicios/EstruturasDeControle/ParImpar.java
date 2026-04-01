package com.Exercicios.EstruturasDeControle;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);


        System.out.println("Digite o primeiro número apartir de 1:");
        var value = scanner.nextFloat();

        System.out.println("Digite o segundo número(Deve ser maior que o primeiro):");
        var value2 = scanner.nextFloat();


        System.out.println("Digite par para saber os números pares ou ímpar para saber os números ímpares:");
        var parOuImpar = scanner.next();

        if (value < value2 && (parOuImpar.equalsIgnoreCase("par") || parOuImpar.equalsIgnoreCase("impar"))){

            System.out.println("Números pares do intervalo:");
            for (int i = 1; i < value2; value2--){
                var par = value % i;
                if (par == 0){

                 System.out.printf("%d", value2);

                }
            }
        }
    }
}
