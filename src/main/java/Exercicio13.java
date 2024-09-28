// IMPORTS
import java.util.Scanner;

public class Exercicio13 {

   public static void main(String[] args) {
      // INSTANTIATE
      Scanner sc = new Scanner(System.in);

      // DECLARATE
      double s;
      double p;
      double result;

      // COLLECT DATA
      System.out.print("S : ");
      s = sc.nextDouble();
      System.out.print("P : ");
      p = sc.nextDouble();

      // PROCESSING
      result = s * 0.3;

      // OUTPUT
      if (p <= result) {
         System.out.println("YES");
      } else {
         System.out.println("NO");
      }
   }
}
