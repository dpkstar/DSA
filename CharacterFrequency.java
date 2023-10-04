import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        
        // Create a frequency map using Java 8 Streams
        Map<Character, Long> frequencyMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        character -> character,
                        TreeMap::new,
                        Collectors.counting()
                ));
        
        // Print characters along with their frequency in alphabetical order
        frequencyMap.forEach((character, count) -> System.out.print(character + "" + count + " "));
    }
}
