import java.util.Scanner;

public class ConversorBinario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();
        String binario = "";
        
        while (numero > 0) {
            int resto = numero % 2;
            binario = resto + binario;
            numero = numero / 2;
        }
        
        System.out.println("Representação binária: " + binario);
    }
}
