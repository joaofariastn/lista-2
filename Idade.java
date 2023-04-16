import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade, maisVelho = 0, maisNovo = 0;
        
        for (int i = 1; i <= 12; i++) {
            System.out.printf("Digite a idade da pessoa %d: ", i);
            idade = scanner.nextInt();
            
            if (i == 1) {
                maisVelho = idade;
                maisNovo = idade;
            } else {
                if (idade > maisVelho) {
                    maisVelho = idade;
                }
                if (idade < maisNovo) {
                    maisNovo = idade;
                }
            }
        }
        
        System.out.printf("A pessoa mais velha tem %d anos e a mais nova tem %d anos.", maisVelho, maisNovo);
    }
}
