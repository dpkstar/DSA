import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = arr.length + 1; // n is the original size of the array including the missing element

        int missingElement = findMissingElement(arr, n);
        System.out.println("The missing element is: " + missingElement);
    }

    public static int findMissingElement(int[] arr, int n) {
        int expectedSum = (n * (n + 1)) / 2; // Sum of integers from 1 to n
        int actualSum = Arrays.stream(arr).sum(); // Sum of elements in the array

        return expectedSum - actualSum;
    }
}
