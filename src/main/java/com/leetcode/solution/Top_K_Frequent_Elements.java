package com.leetcode.solution;

import java.util.*;

public class Top_K_Frequent_Elements {
    //347. Top K Frequent Elements - https://leetcode.com/problems/top-k-frequent-elements/description/

    /*
     * Given an integer array nums and an integer k, return the k most frequent elements.
     * You may return the answer in any order.
     *
     * Example 1:
     *      Input: nums = [1,1,1,2,2,3], k = 2
     *      Output: [1,2]
     *
     * Example 2:
     *      Input: nums = [1], k = 1
     *      Output: [1]
     *
     * Example 3:
     *      Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2
     *      Output: [1,2]
     *
     * Constraints:
     *      1 <= nums.length <= 105
     *      -104 <= nums[i] <= 104
     *      k is in the range [1, the number of unique elements in the array].
     *      It is guaranteed that the answer is unique.
     *
     * Follow up:
     *      Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
     */
    public static int[] topKFrequent(int[] nums, int k) {

        if(nums.length <= 1) return nums;

        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] list = new List[nums.length + 1];
        for(int key : map.keySet()) {
            int count = map.get(key);
            if(list[count] == null)
                list[count] = new ArrayList<>();
            list[count].add(key);
        }

        int[] result = new int[k];
        int count = 0;
        for(int i = list.length - 1; i > 0 && count < k; i --) {
            if(list[i] != null)
                for(int key : list[i]) {
                    //System.out.println("Value: "+ key +", Count : " + i);
                    result[count++] = key;
                }
        }

        return result;
    }
}
