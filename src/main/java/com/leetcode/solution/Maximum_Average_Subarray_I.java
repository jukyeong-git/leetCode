package com.leetcode.solution;

public class Maximum_Average_Subarray_I {
    //643. Maximum Average Subarray I - https://leetcode.com/problems/maximum-average-subarray-i/description/

    /*
     * You are given an integer array nums consisting of n elements, and an integer k.
     * Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
     * Any answer with a calculation error less than 10-5 will be accepted.
     *
     * Example 1:
     *      Input: nums = [1,12,-5,-6,50,3], k = 4
     *      Output: 12.75000
     * Explanation:
     *      Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
     *
     * Example 2:
     *      Input: nums = [5], k = 1
     *      Output: 5.00000
     *
     * Constraints:
     *      n == nums.length
     *      1 <= k <= n <= 105
     *      -104 <= nums[i] <= 104
     */
    public static double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        double curSum = 0;

        for (int i = 0; i < k; i++) {
            curSum += nums[i];
        }

        double maxAvg = curSum / k;

        for (int i = k; i < n; i++) {
            curSum += nums[i];
            curSum -= nums[i - k];

            double avg = curSum / k;
            maxAvg = Math.max(maxAvg, avg);
        }

        return maxAvg;
    }
}
