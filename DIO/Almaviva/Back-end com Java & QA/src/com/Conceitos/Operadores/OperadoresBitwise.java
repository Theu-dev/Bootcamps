package com.Conceitos.Operadores;

import static java.lang.Integer.toBinaryString;

public class OperadoresBitwise {

    public static void main(String[] args) {

        int num = 16;
        var binary = toBinaryString(num);
        System.out.printf("Primeiro número da operação = %s\n Representação binária = %s", num,binary);

        int num2 = 4;
        var binary2 = toBinaryString(num2);
        System.out.printf("\n\nSegundo número da operação = %s\n Representação binária = %s", num2,binary2);

        var result = num | num2;
        /*Precisa apenas que um dos valores seja 1  para retornar 1
        Se um os dois operadores forem 0 retorna 0
         */

        var result2 = num & num2;
        /*Se os dois valores forem 1
        *retona 1 se um deles for 0
        *retorna 0*/

        var result3 = num ^ num2;
        /*Compara se os numeros são diferentes
        * Sefor iguais retorna 0 se for diferente retorna 1*/

        var result4 = ~num;
        /*Usando apenas o numero da vaiável num para operação,
        *a função do ( ~ ) é inverter o sinal do numero binário,
        *ou seja, se for positivo vira negativo e vice-versa.*/

        var result5 = num << num2;
        /*
        O operador de deslocamento à esquerda ( << )
        move os bits de um número para a esquerda
        por um número especificado de posições.
         */

        var result6 = num >> num2;
        /*
        O operador de deslocamento à esquerda ( << )
        move os bits de um número para a esquerda
        por um número especificado de posições.
         */

        System.out.printf("\n\nResultado da operação OR ( | ) = %s\n Representação binária = %s", result, toBinaryString(result));
        System.out.printf("\n\nResultado da operação AND ( & ) = %s\n Representação binária = %s", result2, toBinaryString(result2));
        System.out.printf("\n\nResultado da operação XOR ( ^ ) = %s\n Representação binária = %s", result3, toBinaryString(result3));
        System.out.printf("\n\nResultado da operação Complement ( ~ ) = %s\n Representação binária = %s", result4, toBinaryString(result4));
        System.out.printf("\n\nResultado da operação Left ( << ) = %s\n Representação binária = %s", result5, toBinaryString(result5));
        System.out.printf("\n\nResultado da operação Left ( >> ) = %s\n Representação binária = %s\n", result6, toBinaryString(result6));
            }

    /*
     * Para visualizar a representação binária do maior valor positivo de um int,
     * usamos: Integer.toBinaryString(Integer.MAX_VALUE).
     * O Java omite os zeros à esquerda em números positivos para simplificar a exibição.
     * Em números negativos, todos os 32 bits são exibidos porque o bit mais significativo
     * (bit de sinal) é 1, devido à representação em Complemento de 2.
     * Portanto, em negativos, os bits "à esquerda" tornam-se 1 e não são omitidos.
     *
     * Para ver os 32 numeros:
     * String bits = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
     */
}
