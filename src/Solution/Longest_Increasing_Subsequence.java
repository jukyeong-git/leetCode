package Solution;

import java.util.ArrayList;
import java.util.List;

public class Longest_Increasing_Subsequence {
    //300. Longest Increasing Subsequence - https://leetcode.com/problems/longest-increasing-subsequence/description/

    /*
     * Given an integer array nums, return the length of the longest strictly increasing subsequence.
     *
     * Example 1:
     *      Input: nums = [10,9,2,5,3,7,101,18]
     *      Output: 4
     * Explanation:
     *      The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
     *
     * Example 2:
     *      Input: nums = [0,1,0,3,2,3]
     *      Output: 4
     *
     * Example 3:
     *      Input: nums = [7,7,7,7,7,7,7]
     *      Output: 1
     *
     * Constraints:
     *      1 <= nums.length <= 2500
     *      -104 <= nums[i] <= 104
     *
     * Follow up:
     *      Can you come up with an algorithm that runs in O(n log(n)) time complexity?
     */
    public static int lengthOfLIS(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for(int num : nums) {
            if(list.isEmpty() || list.get(list.size() - 1) < num) {
                list.add(num);
            } else {
                int idx = searchBinary(num, list);
                list.set(idx, num);
            }
        }

        return list.size();
    }

    private static int searchBinary(int target, List<Integer> list) {

        int left = 0, right = list.size() - 1;

        while(left <= right) {
            int mid = left + (right - left)/2;

            if(list.get(mid) == target)
                return mid;
            else if(list.get(mid) < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return left;
    }
}
