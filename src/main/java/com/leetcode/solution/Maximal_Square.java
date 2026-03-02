package com.leetcode.solution;

public class Maximal_Square {
    //221. Maximal Square - https://leetcode.com/problems/maximal-square/description/

    /*
     * Given an m x n binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.
     *
     * Example 1:
     *      Input: matrix = [
     *          ["1","0","1","0","0"],
     *          ["1","0","1","1","1"],
     *          ["1","1","1","1","1"],
     *          ["1","0","0","1","0"]
     *      ]
     *      Output: 4
     *
     * Example 2:
     *      Input: matrix = [["0","1"],["1","0"]]
     *      Output: 1
     *
     * Example 3:
     *      Input: matrix = [["0"]]
     *      Output: 0
     *
     * Constraints:
     *      m == matrix.length
     *      n == matrix[i].length
     *      1 <= m, n <= 300
     *      matrix[i][j] is '0' or '1'.
     */
    public int maximalSquare(char[][] matrix) {

        if (matrix.length == 0 || matrix[0].length == 0) { return 0; }

        int row = matrix.length;
        int col = matrix[0].length;
        int max = 0;

        int[][] dp = new int[row][col];

        for(int r = 0; r < row; r++) {
            for(int c = 0; c < col; c++) {
                if(matrix[r][c] == '1') {
                    if(r == 0 || c == 0) {
                        dp[r][c] = 1;
                    } else {
                        dp[r][c] = Math.min(dp[r - 1][c - 1], Math.min(dp[r - 1][c], dp[r][c - 1])) + 1;
                    }
                }
                max = Math.max(max, dp[r][c]);
            }
        }

        return max * max;
    }
}
