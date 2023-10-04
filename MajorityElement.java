public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 2, 2, 5};
        
        int candidate = findCandidate(arr);
        
        if (isMajority(arr, candidate)) {
            System.out.println("Majority Element: " + candidate);
        } else {
            System.out.println("No majority element found");
        }
    }
    
    // Function to find a candidate for the majority element
    private static int findCandidate(int[] arr) {
        int candidate = 0;
        int count = 0;
        
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
    }
    
    // Function to check if a candidate is the majority element
    private static boolean isMajority(int[] arr, int candidate) {
        int count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }
        return count > arr.length / 2;
    }
}

