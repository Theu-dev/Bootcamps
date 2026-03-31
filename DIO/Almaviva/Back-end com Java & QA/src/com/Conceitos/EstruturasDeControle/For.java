package com.Conceitos.EstruturasDeControle;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {

       var scanner = new Scanner(System.in);

       for(var i = 1; i <= 100; i++)
       {
           i--;
           System.out.println(i++);

           if (i == 100){
               System.out.printf("\nChegamos no numero: %s\nFim da execução!\n", i);
               break;
           }

       }

    }
}
