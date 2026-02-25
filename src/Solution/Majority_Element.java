package Solution;

public class Majority_Element {
    //169. Majority Element - https://leetcode.com/problems/majority-element/description/

    /*
     * Given an array nums of size n, return the majority element.
     * The majority element is the element that appears more than ⌊n / 2⌋ times.
     * You may assume that the majority element always exists in the array.
     *
     * Example 1:
     *      Input: nums = [3,2,3]
     *      Output: 3
     *
     * Example 2:
     *      Input: nums = [2,2,1,1,1,2,2]
     *      Output: 2
     *
     * Constraints:
     *      n == nums.length
     *      1 <= n <= 5 * 104
     *      -109 <= nums[i] <= 109
     *      The input is generated such that a majority element will exist in the array.
     *
     * Follow-up:
     *      Could you solve the problem in linear time and in O(1) space?
     */
    public static int majorityElement(int[] nums) {

        /*
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int max = Integer.MIN_VALUE;
        int val = 0;

        for(int num : map.keySet()) {
            int count = map.get(num);
            if(max < count) {
                max = count;
                val = num;
            }
        }

        return val;
         */

        int result = 0, majority = 0;

        for(int num : nums) {
            if(majority == 0)
                result = num;

            if(result == num)
                majority++;
            else
                majority--;
        }

        return result;
    }
}
