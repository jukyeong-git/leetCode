package com.leetcode.solution;

public class Single_Number_II {
    //137. Single Number II - https://leetcode.com/problems/single-number-ii/description/

    /*
     * Given an integer array nums where every element appears three times except for one, which appears exactly once.
     * Find the single element and return it.
     * You must implement a com.leetcode.solution with a linear runtime complexity and use only constant extra space.
     *
     * Example 1:
     *      Input: nums = [2,2,3,2]
     *      Output: 3
     *
     * Example 2:
     *      Input: nums = [0,1,0,1,0,1,99]
     *      Output: 99
     *
     * Constraints:
     *      1 <= nums.length <= 3 * 104
     *      -231 <= nums[i] <= 231 - 1
     *      Each element in nums appears exactly three times except for one element which appears once.
     */
    public static int singleNumber(int[] nums) {

        int ones = 0;
        int twos = 0;

        for(int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;

            /*
             * Step.1
             * 2 = 0 ^ 2 & ~0
             * 0 = 0 ^ 2 & ~2
             *
             * Step.2
             * 0 = 2 ^ 2 & ~0
             * 2 = 0 ^ 2 & ~0
             *
             * Step.3
             * 1 = 0 ^ 3 & ~2
             * 0 = 2 ^ 3 & ~1
             *
             * Step.4
             * 3 = 1 ^ 2 & ~0
             * 0 = 0 ^ 2 & ~3
             */
        }

        return ones;
    }
}

