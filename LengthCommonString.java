public class LengthCommonString {
    public static void main(String[] args) {
        String X = "Deepaak";
        String Y = "Garimaa";
        
        int result = longestCommonSubstring(X, Y);
        System.out.println("Length of Longest Common Substring: " + result);
    }
    
    public static int longestCommonSubstring(String X, String Y) {
        int m = X.length();
        int n = Y.length();
        
        // Create a 2D array to store the length of common substrings
        int[][] dp = new int[m + 1][n + 1];
        
        int maxLength = 0;  // To store the length of the longest common substring
        
        // Fill the dp array
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    maxLength = Math.max(maxLength, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        
        return maxLength;
    }
}
