package com.leetcode.solution;

public class Edit_Distance {
    //72. Edit Distance - https://leetcode.com/problems/edit-distance/description/

    /*
     * Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.
     * You have the following three operations permitted on a word:
     * - Insert a character
     * - Delete a character
     * - Replace a character
     *
     * Example 1:
     *      Input: word1 = "horse", word2 = "ros"
     *      Output: 3
     * Explanation:
     *      horse -> rorse (replace 'h' with 'r')
     *      rorse -> rose (remove 'r')
     *      rose -> ros (remove 'e')
     *
     * Example 2:
     *      Input: word1 = "intention", word2 = "execution"
     *      Output: 5
     * Explanation:
     *      intention -> inention (remove 't')
     *      inention -> enention (replace 'i' with 'e')
     *      enention -> exention (replace 'n' with 'x')
     *      exention -> exection (replace 'n' with 'c')
     *      exection -> execution (insert 'u')
     *
     * Constraints:
     *      0 <= word1.length, word2.length <= 500
     *      word1 and word2 consist of lowercase English letters.
     */
    public int minDistance(String word1, String word2) {

        // Get the lengths of both strings
        int m = word1.length(), n = word2.length();

        // Edge Cases:
        // If word1 is empty, we must insert all characters of word2 (cost = n)
        if (m == 0) return n;
        // If word2 is empty, we must delete all characters of word1 (cost = m)
        if (n == 0) return m;

        // DP table creation:
        // dp[i][j] represents the minimum edit distance between
        // the first 'i' characters of word1 and the first 'j' characters of word2.
        int[][] dp = new int[m + 1][n + 1];

        // Base case 1: Initialize the first column
        // Converting any string to an empty string requires deleting all characters.
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }

        // Base case 2: Initialize the first row
        // Converting an empty string to any string requires inserting all characters.
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }

        // Iterate through both strings to fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                int cost = 0;

                // Check if the current characters match.
                // Note: We use i-1 and j-1 because string indices are 0-based.
                if (word1.charAt(i - 1) != word2.charAt(j - 1)) {
                    cost = 1; // Mismatch implies a replacement cost of 1
                }

                // State transition equation:
                // We choose the minimum cost among three possible operations:
                // 1. Replace / Match (Diagonal): dp[i - 1][j - 1] + cost
                // 2. Delete (Top): dp[i - 1][j] + 1
                // 3. Insert (Left): dp[i][j - 1] + 1
                dp[i][j] = Math.min(dp[i - 1][j - 1] + cost, Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1));
            }
        }

        // The final answer is located at the bottom-right corner of the table
        return dp[m][n];
    }
}
