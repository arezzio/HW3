import java.util.Scanner;

public class 3.29_Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();
        String lastName = scanner.next();
        int number = scanner.nextInt();

        String shortFirst = firstName.length() > 6 ? firstName.substring(0, 6) : firstName;

        char lastInitial = lastName.charAt(0);

        int lastDigit = number % 10;

        String loginName = shortFirst + lastInitial + "_" + lastDigit;

        System.out.println("Your login name: " + loginName);
    }
}
