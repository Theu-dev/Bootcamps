package com.conceito;

import java.util.Scanner;

import static java.lang.System.*;

public class TiposPrimitivos {

    private static final String AGRADECER = "Obrigado por participar";
    /*FINAL STATIC:
     * VALOR FIXO DE MEMÓRIA ÚNICA.
     * Garante que a mensagem de agradecimento seja uma verdade absoluta no sistema,
     * impedindo reatribuições e eliminando a necessidade de múltiplas cópias
     * na memória heap durante a execução.
     */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);
        //SE USASSE-MOS:
        // * var scanner = new Scanner(System.in);
        // * FUNCIONARIA.
        // * O 'var' simplifica a declaração de variáveis locais,
        //  * deixando o código mais limpo sem perder a tipagem forte.

        System.out.println("Olá, informe o seu nome: ");
        var name = scanner.next();

        System.out.println("Informe sua idade: ");
        var age= scanner.nextInt();

        System.out.println("Olá " + name + " Sua idade é " + age);

        System.out.println(AGRADECER);
    }
}