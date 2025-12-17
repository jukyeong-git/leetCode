package Solution;

public class Maximum_Average_Subarray_I {
    //643. Maximum Average Subarray I - https://leetcode.com/problems/maximum-average-subarray-i/description/
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
