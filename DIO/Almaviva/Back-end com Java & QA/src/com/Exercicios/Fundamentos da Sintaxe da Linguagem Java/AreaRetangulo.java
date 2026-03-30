import java.util.Scanner;

public class AreaRetangulo {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Informe a base do retangulo: ");
        var base = scanner.nextDouble();

        System.out.println("Informe a altura do retangulo: ");
        var altura = scanner.nextDouble();

        var area = base * altura;

        System.out.printf("A área do retangulo é = %s\n", area);
    }
}
