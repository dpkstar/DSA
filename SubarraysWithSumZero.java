import java.util.*;

public class SubarraysWithSumZero {
    public static void main(String[] args) {
        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        findSubarraysWithSumZero(arr);
    }

    public static void findSubarraysWithSumZero(int[] arr) {
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        List<List<Integer>> subarrays = new ArrayList<>();
        int sum = 0;

        // Initialize the sumMap with zero sum at index -1
        List<Integer> initialList = new ArrayList<>();
        initialList.add(-1);
        sumMap.put(0, initialList);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If sum is already in the map, there's a subarray with sum zero
            if (sumMap.containsKey(sum)) {
                List<Integer> indices = sumMap.get(sum);
                for (int index : indices) {
                    subarrays.add(Arrays.asList(index + 1, i));
                }
            }

            // Add or update the sum in the map
            if (sumMap.containsKey(sum)) {
                sumMap.get(sum).add(i);
            } else {
                List<Integer> newList = new ArrayList<>();
                newList.add(i);
                sumMap.put(sum, newList);
            }
        }

        // Print the found subarrays
        for (List<Integer> subarray : subarrays) {
            int start = subarray.get(0);
            int end = subarray.get(1);
            System.out.println("Subarray found from Index " + start + " to " + end);
        }
    }
}
