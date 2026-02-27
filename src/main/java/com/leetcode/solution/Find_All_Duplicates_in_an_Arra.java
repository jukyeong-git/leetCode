package com.leetcode.solution;

import java.util.*;

public class Find_All_Duplicates_in_an_Arra {
    //442. Find All Duplicates in an Array - https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

    /*
     * Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.
     * You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output
     *
     * Example 1:
     *      Input: nums = [4,3,2,7,8,2,3,1]
     *      Output: [2,3]
     *
     * Example 2:
     *      Input: nums = [1,1,2]
     *      Output: [1]
     *
     * Example 3:
     *      Input: nums = [1]
     *      Output: []
     *
     * Constraints:
     *      n == nums.length
     *      1 <= n <= 105
     *      1 <= nums[i] <= n
     *      Each element in nums appears once or twice.
     */
    public static List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for(int num : nums) {
            if(!set.contains(num))
                set.add(num);
            else
                result.add(num);
        }

        return result;
    }
}
