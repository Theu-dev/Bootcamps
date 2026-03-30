package com.Conceitos.EstruturasDeControle;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Informe um número de 1 a 7 para escolher o dia da semana:");
        var option = scanner.nextInt();


       var message = switch (option){

            case 1, 7 -> {
                var day = option == 1 ? "Domingo" : "Sábado";
                yield String.format("Hoje é %s, fim de semana, %suuuhhhh!!!", day, day);
            }
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            default -> "Opção inválida";

        };

        System.out.printf(message);

        /*var message = switch (option) {

            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sábado";
            default -> "Opção inválida";

        };


        System.out.printf(message);
        if(option == 1 || option ==7){
            System.out.println("!\nÉ um dia de descanso!");
        }
        */
        /*switch (option){

            case "1":
                System.out.println("Domingo");
                break;
            case "2":
                System.out.println("Segunda");
                break;
            case "3":
                System.out.println("Terça");
                    break;
            case "4":
                System.out.println("Quarta");
                break;
            case "5":
                System.out.println("Quinta");
                break;
            case "6":
                System.out.println("Sexta");
                break;
            case "7":
                System.out.println("Sábado");
                break;

            default:
                System.out.println("Opção inválida");
        }*/
    }
}
