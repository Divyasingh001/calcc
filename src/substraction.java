import java.util.Scanner;

public class substraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display a menu
        System.out.println("Simple Calculator");
        System.out.println("-----------------");

        // Prompt user for numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        
        double result = num1 - num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);

        // Close scanner
        scanner.close();
    }
}
