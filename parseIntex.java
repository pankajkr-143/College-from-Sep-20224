import java.util.Scanner;

public class parseIntex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("Square of " + number + " is: " + (number * number));
            System.out.println("The work has been done successfully.");
        } catch (NumberFormatException e) {
            System.out.println("Entered input is not a valid format for an integer.");
        }
    }
}