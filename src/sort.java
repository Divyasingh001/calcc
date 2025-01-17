import java.util.Arrays;

public class sort {


    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 6, 2, 7, 4, 1};

        System.out.println("Original Array: " + Arrays.toString(numbers));

        Arrays.sort(numbers); // Sort the array in ascending order

        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}