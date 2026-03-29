package com.Conceito.Operadores;

import java.util.Scanner;

public class OperadoesAritmeticos {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        var num1 = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        var num2 = scanner.nextInt();

        var result = num1 + num2;
        var result2 = num1 - num2;
        var result3 = num1 * num2;
        float result4 = (float) num1 / num2; // Um dos operandos é convertido para Float para promover a operação
        var result5 = num1 % num2;
        float result6 = (5 + 9) * (10 - 5) / 2; //Usando regra matemática para que o compilador entenda a opeação desejada.



        System.out.printf("%s + %s = %s\n",num1, num2, result);
        System.out.printf("%s - %s = %s\n",num1, num2, result2);
        System.out.printf("%s * %s = %s\n",num1, num2, result3);
        System.out.printf("%s / %s = %s\n",num1, num2, result4);
        System.out.printf("%s %% %s = %s\n",num1, num2, result5);
        System.out.printf("(5 + 9) * (10 - 5) / 2 = %s\n",num1, num2, result6);

        System.out.println("Calculo de Raiz");

        System.out.println("De qual numero quer descobrir a raiz?");
        var num3 = scanner.nextDouble();

        System.out.printf("A raiz de %s é = %s\n",num3, Math.sqrt(num3));

        System.out.println("Calculo de potência");

        System.out.println("De qual numero quer descobrir a potência (^2)?");
        /*Você pode escolher o numero da potencia criando uma variável de entrada para potencia*/
        var num4 = scanner.nextDouble();

        System.out.printf("O quadrador de %s é = %s\n",num3, Math.pow(num4, 2));
        /*O número 2 dentro de pow é referente a potência que deseja submeter o numero escolhido*/

        System.out.println("Operador de incremento x decremento");
        var value = 50;
        System.out.println(++value);
        /*Funcionaria também com o seguinte script
        *value += 1;
        * System.out.println(value);
        * ou
        * value = value + 1;
        * System.out.println(value);
        */

        System.out.println(--value);
        /*Funcionaria também com o seguinte script
         *value -= 1;
         * System.out.println(value);
         * ou
         * value = value - 1;
         * System.out.println(value);
         */

        /* Ambos os System.out.println(++50);
        * Se usado o operador depois do "value" acrescentará o valor após a linha de comando presente*/
    }
}
