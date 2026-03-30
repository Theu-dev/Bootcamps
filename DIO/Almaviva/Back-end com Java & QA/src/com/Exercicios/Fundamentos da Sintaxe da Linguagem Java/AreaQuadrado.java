import java.util.Scanner;

public class AreaQuadrado {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Informe o lado do Quadrado: ");
        var lado = scanner.nextDouble();

        var area = lado * lado;

        System.out.printf("A área do quadrado é = %s\n", area);
    }
}
