import java.util.Scanner;

public class Escadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de níveis da escada: ");
        int niveis = scanner.nextInt();

        for (int i = 1; i <= niveis; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
