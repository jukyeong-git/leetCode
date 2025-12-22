package Solution;

public class Minimum_Size_Subarray_Sum {
    //209. Minimum Size Subarray Sum - https://leetcode.com/problems/minimum-size-subarray-sum/description/
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0, sum = 0, minCount = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while(sum >= target){
                minCount = Math.min(minCount, right - left + 1);
                sum -= nums[left++];
            }
        }

        return minCount == Integer.MAX_VALUE ? 0 : minCount;
    }
}
