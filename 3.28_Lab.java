import java.util.Scanner;

public class 3.28_Lab {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      String firstName = scnr.next();
      String middleName = "";
      String lastName = "";
      
      if (scnr.hasNext()) {
         String second = scnr.next();
         if (scnr.hasNext()) {
            middleName = second;
            lastName = scnr.next();
            System.out.println(lastName + ", " + firstName.charAt(0) + "." + middleName.charAt(0) + ".");
         } else {
            lastName = second;
            System.out.println(lastName + ", " + firstName.charAt(0) + ".");
         }
      }
   }
}
