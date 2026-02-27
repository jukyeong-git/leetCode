package com.leetcode.solution;

public class Search_a_2D_Matrix {
    //74. Search a 2D Matrix - https://leetcode.com/problems/search-a-2d-matrix/description/

    /*
     * You are given an m x n integer matrix matrix with the following two properties:
     * - Each row is sorted in non-decreasing order.
     * - The first integer of each row is greater than the last integer of the previous row.
     *
     * Given an integer target, return true if target is in matrix or false otherwise.
     * You must write a com.leetcode.solution in O(log(m * n)) time complexity.
     *
     * Example 1:
     *      Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
     *      Output: true
     *
     * Example 2:
     *      Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
     *      Output: false
     *
     * Constraints:
     *      m == matrix.length
     *      n == matrix[i].length
     *      1 <= m, n <= 100
     *      -104 <= matrix[i][j], target <= 104
     */
    public static boolean searchMatrix(int[][] matrix, int target) {

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[top].length - 1;

        while(top <= bottom) {
            int mid = (top + bottom) / 2;

            int start = matrix[mid][left];
            int end = matrix[mid][right];

            if(start <= target && target <= end)
                break;

            if(start < target)
                top = mid + 1;
            else
                bottom = mid - 1;
        }

        int row = (top + bottom) / 2;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(matrix[row][mid] == target)
                return true;

            if(matrix[row][mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return false;
    }
}
