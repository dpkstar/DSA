import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class KclosestElement{
    public static void main(String[] args) {
        int[] arr = {12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56};
        int k = 4;
        int x = 35;

        List<Integer> result = findKClosestElements(arr, k, x);

        System.out.println("K Closest Elements:");
        result.forEach(num -> System.out.print(num + " "));
    }

    public static List<Integer> findKClosestElements(int[] arr, int k, int x) {
        // Convert the array to a list of integers
        List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());

        // Sort the list based on the absolute difference from X
        arrList.sort(Comparator.comparingInt(num -> Math.abs(num - x)));

        // Take the first k elements from the sorted list
        List<Integer> result = arrList.subList(0, k);

        // Sort the result list in ascending order
        result.sort(Comparator.naturalOrder());

        return result;
    }
}
