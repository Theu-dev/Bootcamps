import java.util.Scanner;

public class Saudacao {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        var name = scanner.next();

        System.out.println("Qual sua idade?");
        var age = scanner.nextInt();

        System.out.printf("\nOlá %s\nVocê tem é %s anos\n",name, age);
    }
}
