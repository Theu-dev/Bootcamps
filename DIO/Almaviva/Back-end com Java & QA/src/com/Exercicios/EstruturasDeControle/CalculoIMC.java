package com.Exercicios.EstruturasDeControle;

import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Digite sua altura:");
        var altura = scanner.nextFloat();

        System.out.println("Digite seu peso:");
        var peso = scanner.nextFloat();

        var IMC = peso/(altura * altura);
        var relatorio = "";

        if (IMC <= 18.5) {
            relatorio = "Abaixo do peso";
        } else if(IMC > 18.5 && IMC < 24.9){
             relatorio = "Peso ideal";
        } else if(IMC > 24.9 && IMC < 29.9){
            relatorio = "Levemente acima do peso";
        } else if(IMC > 29.9 && IMC < 34.9){
            relatorio = "Obsesidade grau I";
        } else if(IMC > 34.9 && IMC < 39.9){
            relatorio = "Obsesidade grau II(Severa)";
        } else if(IMC > 39.9){
            relatorio = "Obsesidade grau III(Mórbida)";
        }

        System.out.printf("\nSeu IMC é = %.2f", IMC);
        System.out.printf("\nClassificação : %s\n", relatorio);
    }
}
