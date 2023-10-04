public class StringToJavaVariable {
    public static void main(String[] args) {
        String input = "this_is_variable_deepak";
        
        // Split the input string by underscores
        String[] parts = input.split("_");
        
        // Initialize the result with the first part (no underscore)
        StringBuilder result = new StringBuilder(parts[0]);
        
        // Iterate through the remaining parts
        for (int i = 1; i < parts.length; i++) {
            // Capitalize the first character of each part and append it to the result
            result.append(Character.toUpperCase(parts[i].charAt(0)))
                  .append(parts[i].substring(1));
        }
        
        // Print the converted Java variable name
        System.out.println(result.toString());
    }
}
