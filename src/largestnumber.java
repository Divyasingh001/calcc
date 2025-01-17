import java.util.Scanner;
public class largestnumber {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input array size
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();

            int[] numbers = new int[n];

            // Input array elements
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }

            // Find the largest number
            int largest = numbers[0];
            for (int i = 1; i < n; i++) {
                if (numbers[i] > largest) {
                    largest = numbers[i];
                }
            }

            // Output the result
            System.out.println("The largest number is: " + largest);

            // Close scanner
            scanner.close();
        }

}
