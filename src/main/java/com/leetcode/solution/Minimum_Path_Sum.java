package com.leetcode.solution;

public class Minimum_Path_Sum {
    //64. Minimum Path Sum - https://leetcode.com/problems/minimum-path-sum/description/

    /*
     * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right,
     * which minimizes the sum of all numbers along its path.
     * Note: You can only move either down or right at any point in time.
     *
     * Example 1:
     *      Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
     *      Output: 7
     * Explanation:
     *      Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
     *
     * Example 2:
     *      Input: grid = [[1,2,3],[4,5,6]]
     *      Output: 12
     *
     * Constraints:
     *      m == grid.length
     *      n == grid[i].length
     *      1 <= m, n <= 200
     *      0 <= grid[i][j] <= 200
     */
    public static int minPathSum(int[][] grid) {

        int row = grid.length;
        int col = grid[0].length;

        for(int r = 1; r < row; r++) {
            grid[r][0] += grid[r - 1][0];
        }

        for(int c = 1; c < col; c++) {
            grid[0][c] += grid[0][c - 1];
        }

        for(int r = 1; r < row; r++) {
            for(int c = 1; c < col; c++) {
                grid[r][c] = Math.min(grid[r - 1][c], grid[r][c - 1]) + grid[r][c];
            }
        }

        return grid[row - 1][col - 1];
    }
}
