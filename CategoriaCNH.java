import java.util.Scanner;

public class CategoriaCNH {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de rodas: ");
        int qtdRodas = scanner.nextInt();

        System.out.print("Informe o peso bruto do veículo em kgs: ");
        int peso = scanner.nextInt();

        System.out.print("Informe a quantidade de pessoas no veículo: ");
        int qtdPessoas = scanner.nextInt();

        if (qtdRodas == 2 || qtdRodas == 3) {
            System.out.println("Categoria: A");
        } else if (qtdRodas == 4 && qtdPessoas <= 8 && peso <= 3500) {
            System.out.println("Categoria: B");
        } else if (qtdRodas >= 4 && peso > 3500 && peso <= 6000 && qtdPessoas <= 8) {
            System.out.println("Categoria: C");
        } else if (qtdRodas >= 4 && qtdPessoas > 8) {
            System.out.println("Categoria: D");
        } else if (qtdRodas >= 4 && peso > 6000) {
            System.out.println("Categoria: E");
        } else {
            System.out.println("Não foi possível identificar a categoria.");
        }

        scanner.close();
    }

}
