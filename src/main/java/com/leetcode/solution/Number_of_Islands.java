package com.leetcode.solution;

public class Number_of_Islands {
    //200. Number of Islands - https://leetcode.com/problems/number-of-islands/description/

    /*
     * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
     * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
     * You may assume all four edges of the grid are all surrounded by water.
     *
     * Example 1:
     *      Input: grid = [
     *          ["1","1","1","1","0"],
     *          ["1","1","0","1","0"],
     *          ["1","1","0","0","0"],
     *          ["0","0","0","0","0"]
     *      ]
     *      Output: 1
     *
     * Example 2:
     *      Input: grid = [
     *          ["1","1","0","0","0"],
     *          ["1","1","0","0","0"],
     *          ["0","0","1","0","0"],
     *          ["0","0","0","1","1"]
     *      ]
     *      Output: 3
     *
     * Constraints:
     *      m == grid.length
     *      n == grid[i].length
     *      1 <= m, n <= 300
     *      grid[i][j] is '0' or '1'.
     */
    private static int m;
    private static int n;
    private static int count;
    private static boolean[][] visited;

    public static int numIslands(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        count = 0;
        visited = new boolean[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == '1' && visited[i][j] == false) {
                    findLand(grid, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    private static void findLand(char[][] grid, int i, int j) {
        if(0 <= i && i < m && 0 <= j && j < n) {
            if(grid[i][j] == '1' && visited[i][j] == false) {
                visited[i][j] = true;
                findLand(grid, i - 1, j);
                findLand(grid, i, j - 1);
                findLand(grid, i + 1, j);
                findLand(grid, i, j + 1);
            }
        }
    }
}
