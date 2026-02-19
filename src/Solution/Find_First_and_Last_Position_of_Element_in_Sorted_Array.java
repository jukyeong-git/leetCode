package Solution;

import java.util.*;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    //34. Find First and Last Position of Element in Sorted Array - https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

    /*
     * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
     *
     * If target is not found in the array, return [-1, -1].
     *
     * You must write an algorithm with O(log n) runtime complexity.
     *
     * Example 1:
     *      Input: nums = [5,7,7,8,8,10], target = 8
     *      Output: [3,4]
     *
     * Example 2:
     *      Input: nums = [5,7,7,8,8,10], target = 6
     *      Output: [-1,-1]
     *
     * Example 3:
     *      Input: nums = [], target = 0
     *      Output: [-1,-1]
     *
     * Constraints:
     *      0 <= nums.length <= 105
     *      -109 <= nums[i] <= 109
     *      nums is a non-decreasing array.
     *      -109 <= target <= 109
     */
    public static int[] searchRange(int[] nums, int target) {

        int left = 0, right = nums.length - 1;

        while(left <= right) {

            int mid = left + (right - left)/2;

            if(nums[mid] == target) {

                int first = mid;
                int last = mid;

                while(0 < first && nums[first - 1] == target) first--;
                while(last < nums.length - 1 && nums[last + 1] == target) last++;

                return new int[]{first, last};
            }

            if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }
}
