import java.util.Scanner;

public class Tabuada {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Digite um número: ");
      int num = sc.nextInt();

      System.out.println("Tabuada de " + num + ":");
      for(int i=1; i<=10; i++){
         System.out.println(num + " x " + i + " = " + num*i);
      }
      sc.close();
   }
}
