import java.util.Scanner;

public class 3.25_Lab {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int totalPennies = scnr.nextInt();
      
      if (totalPennies <= 0) {
         System.out.println("No change");
         return;
      }
      
      int dollars = totalPennies / 100;
      totalPennies %= 100;
      
      int quarters = totalPennies / 25;
      totalPennies %= 25;
      
      int dimes = totalPennies / 10;
      totalPennies %= 10;
      
      int nickels = totalPennies / 5;
      totalPennies %= 5;
      
      int pennies = totalPennies;
      
      if (dollars > 0) {
         System.out.println(dollars + (dollars == 1 ? " Dollar" : " Dollars"));
      }
      if (quarters > 0) {
         System.out.println(quarters + (quarters == 1 ? " Quarter" : " Quarters"));
      }
      if (dimes > 0) {
         System.out.println(dimes + (dimes == 1 ? " Dime" : " Dimes"));
      }
      if (nickels > 0) {
         System.out.println(nickels + (nickels == 1 ? " Nickel" : " Nickels"));
      }
      if (pennies > 0) {
         System.out.println(pennies + (pennies == 1 ? " Penny" : " Pennies"));
      }
   }
}
