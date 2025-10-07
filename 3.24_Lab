import java.util.Scanner; 

public class 3.24_Lab {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int highwayNumber;
      int primaryNumber;

      highwayNumber = scnr.nextInt();
      
      if (highwayNumber < 1 || highwayNumber > 999 || highwayNumber % 100 == 0) {
         System.out.println(highwayNumber + " is not a valid interstate highway number.");
      }
      else if (highwayNumber <= 99) { 
         if (highwayNumber % 2 == 0) {
            System.out.println("I-" + highwayNumber + " is primary, going east/west.");
         } else {
            System.out.println("I-" + highwayNumber + " is primary, going north/south.");
         }
      }
      else { 
         primaryNumber = highwayNumber % 100;
         
         if (primaryNumber % 2 == 0) {
            System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going east/west.");
         } else {
            System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going north/south.");
         }
      }
   }
}
