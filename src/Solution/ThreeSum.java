package Solution;

import java.util.*;

public class ThreeSum {
    //15. 3Sum - https://leetcode.com/problems/3sum/description/
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i ++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            if(nums[0] > 0) break;

            int j = i + 1;
            int k = nums.length - 1;

            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if(sum < 0) {
                    j++;
                } else if(sum > 0) {
                    k--;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    k--;
                    while(i > 0 && nums[k] == nums[k-1])
                        k--;
                }
            }
        }

        return res;
    }
}
