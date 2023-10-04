import java.util.*;
import java.util.stream.Collectors;

public class RepeatingElement{
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 5, 2, 3, 1,1};
        
        findTwoRepeatingElements(arr);
    }
    
    public static void findTwoRepeatingElements(int[] arr) {
        List<Integer> list = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());
        
        Set<Integer> uniqueSet = new HashSet<>();
        Set<Integer> repeatingSet = new HashSet<>();
        
        //System.out.print("Repeating elements: ");
        for (Integer num : list) {
            if (!uniqueSet.add(num)) {
                repeatingSet.add(num);
            }
        }
        
        repeatingSet.forEach(num -> System.out.print(num + " "));
    }
}
