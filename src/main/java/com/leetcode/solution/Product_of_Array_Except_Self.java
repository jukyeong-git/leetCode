package com.leetcode.solution;

public class Product_of_Array_Except_Self {
    //238. Product of Array Except Self - https://leetcode.com/problems/product-of-array-except-self/description/

    /*
     * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
     * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
     * You must write an algorithm that runs in O(n) time and without using the division operation.
     *
     * Example 1:
     *      Input: nums = [1,2,3,4]
     *      Output: [24,12,8,6]
     *
     * Example 2:
     *      Input: nums = [-1,1,0,-3,3]
     *      Output: [0,0,9,0,0]
     *
     * Constraints:
     *      2 <= nums.length <= 105
     *      -30 <= nums[i] <= 30
     *      The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.
     *
     * Follow up:
     *      Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
     */
    public static int[] productExceptSelf(int[] nums) {
        // nums = {1, 2, 3, 4};
        int n = nums.length;
        int[] res = new int[n];

        // 1) 왼쪽 누적곱
        res[0] = 1;
        for(int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        // res = {1, 1, 2, 6}

        // 2) 오른쪽 누적곱을 r로 유지하며 res에 곱해주기
        int r = 1;
        for(int i = n - 1; i >= 0; i--) {
            res[i] *= r;
            r *= nums[i];
        }
        // r   =  24  12  4  1
        // res = {24, 12, 8, 6}

        return res;
    }
}
