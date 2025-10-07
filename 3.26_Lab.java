import java.util.Scanner;

public class 3.26_Lab {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inputYear;
      boolean isLeapYear;
      
      isLeapYear = false;
      inputYear = scnr.nextInt();
      
      if (inputYear % 4 == 0) {
         if (inputYear % 100 == 0) {
            if (inputYear % 400 == 0) {
               isLeapYear = true;
            } else {
               isLeapYear = false;
            }
         } else {
            isLeapYear = true;
         }
      }

      if (isLeapYear) {
         System.out.println(inputYear + " - leap year");
      } else {
         System.out.println(inputYear + " - not a leap year");
      }
   }
}
