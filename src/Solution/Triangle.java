package Solution;

import java.util.List;

public class Triangle {
    //120. Triangle - https://leetcode.com/problems/triangle/description/

    /*
     * Given a triangle array, return the minimum path sum from top to bottom.
     * For each step, you may move to an adjacent number of the row below. More formally,
     * if you are on index i on the current row, you may move to either index i or index i + 1 on the next row.
     *
     * Example 1:
     *      Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
     *      Output: 11
     * Explanation:
     *      The triangle looks like:
     *         2
     *        3 4
     *       6 5 7
     *      4 1 8 3
     *      The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).
     *
     * Example 2:
     *      Input: triangle = [[-10]]
     *      Output: -10
     *
     * Constraints:
     *      1 <= triangle.length <= 200
     *      triangle[0].length == 1
     *      triangle[i].length == triangle[i - 1].length + 1
     *      -104 <= triangle[i][j] <= 104
     *
     * Follow up:
     *      Could you do this using only O(n) extra space, where n is the total number of rows in the triangle?
     */
    public static int minimumTotal(List<List<Integer>> triangle) {

        int row = triangle.size() - 1;
        int[] dp = new int[row + 1];

        for(int i = 0; i <= row; i++) {
            dp[i] = triangle.get(row).get(i);
        }

        for(int r = row - 1; r >= 0; r--) {
            for(int c = 0; c <= r; c++) {
                dp[c] = Math.min(dp[c], dp[c + 1]) + triangle.get(r).get(c);
            }
        }

        return dp[0];
    }
}
