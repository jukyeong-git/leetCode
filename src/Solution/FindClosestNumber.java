package Solution;

public class FindClosestNumber {
    //2239. Find Closest Number to Zero - https://leetcode.com/problems/find-closest-number-to-zero/
    public int findClosestNumber(int[] nums) {

        int result = Integer.MAX_VALUE;

        for (int num : nums) {
            if (result == Math.abs(num)) {
                continue;
            } else if (Math.min(Math.abs(result), Math.abs(num)) == Math.abs(num)) {
                result = num;
            }
        }

        return result;
    }
}
