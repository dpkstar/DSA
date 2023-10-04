import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean result = areAnagrams(str1, str2);

        if (result) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Convert both strings to lowercase and remove spaces
        str1 = str1.toLowerCase().replaceAll("\\s", "");
        str2 = str2.toLowerCase().replaceAll("\\s", "");

        // Check if lengths are the same
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create character frequency maps for both strings using Java 8 streams
        Map<Character, Long> charCount1 = str1.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<Character, Long> charCount2 = str2.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Compare character frequency maps
        return charCount1.equals(charCount2);
    }
}
