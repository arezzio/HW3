import java.util.Scanner;

public class 3.22_LabProgram {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int num1 = scanner.nextInt();
      int num2 = scanner.nextInt();
      int num3 = scanner.nextInt();
      
      int smallest = num1;

      if (num2 < smallest)
         smallest = num2;
      
      if (num3 < smallest)
         smallest = num3;

      System.out.println(smallest);

      scanner.close();
   }
}
