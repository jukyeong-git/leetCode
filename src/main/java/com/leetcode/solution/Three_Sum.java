package com.leetcode.solution;

import java.util.*;

public class Three_Sum {
    //15. 3Sum - https://leetcode.com/problems/3sum/description/

    /*
     * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
     * Notice that the com.leetcode.solution set must not contain duplicate triplets.
     *
     * Example 1:
     *      Input: nums = [-1,0,1,2,-1,-4]
     *      Output: [[-1,-1,2],[-1,0,1]]
     * Explanation:
     *      nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
     *      nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
     *      nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
     *      The distinct triplets are [-1,0,1] and [-1,-1,2].
     *      Notice that the order of the output and the order of the triplets does not matter.
     *
     * Example 2:
     *      Input: nums = [0,1,1]
     *      Output: []
     * Explanation: The only possible triplet does not sum up to 0.
     *
     * Example 3:
     *      Input: nums = [0,0,0]
     *      Output: [[0,0,0]]
     * Explanation: The only possible triplet sums up to 0.
     *
     * Constraints:
     *      3 <= nums.length <= 3000
     *      -105 <= nums[i] <= 105
     */
    public List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if(n == 0) return res;

        Arrays.sort(nums);

        for(int i = 0; i < n; i++) {

            if(nums[0] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int lo = i + 1;
            int hi = n - 1;

            while(lo < hi) {

                int sum = nums[i] + nums[lo] + nums[hi];

                if(sum == 0) {
                    res.add(List.of(nums[i], nums[lo], nums[hi]));
                    lo++;
                    hi--;
                    while(lo < hi && nums[lo] == nums[lo-1]) lo++;
                    while(lo < hi && nums[hi] == nums[hi+1]) hi--;
                } else if(sum < 0) {
                    lo++;
                } else {
                    hi--;
                }
            }
        }

        return res;
    }
}
