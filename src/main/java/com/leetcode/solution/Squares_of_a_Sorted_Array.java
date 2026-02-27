package com.leetcode.solution;

public class Squares_of_a_Sorted_Array {
    //977. Squares of a Sorted Array - https://leetcode.com/problems/squares-of-a-sorted-array/description/

    /*
     * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
     *
     * Example 1:
     *      Input: nums = [-4,-1,0,3,10]
     *      Output: [0,1,9,16,100]
     * Explanation:
     *      After squaring, the array becomes [16,1,0,9,100].
     *      After sorting, it becomes [0,1,9,16,100].
     *
     * Example 2:
     *      Input: nums = [-7,-3,2,3,11]
     *      Output: [4,9,9,49,121]
     *
     * Constraints:
     *      1 <= nums.length <= 104
     *      -104 <= nums[i] <= 104
     *      nums is sorted in non-decreasing order.
     *
     * Follow up:
     *      Squaring each element and sorting the new array is very trivial, could you find an O(n) com.leetcode.solution using a different approach?
     */
    public static int[] sortedSquares(int[] nums) {

        for(int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }

        int left = 0;
        int right = nums.length-1;

        quickSort(left, right, nums);

        return nums;
    }

    private static void quickSort(int left, int right, int[] nums){

        int part = partition(left, right, nums);

        if(left < part -1 )
            quickSort(left, part - 1, nums);
        if(part < right)
            quickSort(part, right, nums);
    }

    private static int partition(int left, int right, int[] nums) {

        int mid = nums[(left + right)/2];

        while(left <= right) {

            while (nums[left] < mid) left++;
            while (nums[right] > mid) right--;

            if(left <= right) {
                swap(left, right, nums);
                left++;
                right--;
            }
        }

        return left;
    }

    private static void swap(int left, int right, int[] nums) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
