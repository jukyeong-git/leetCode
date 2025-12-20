package Solution;

import java.util.*;

public class Three_Sum {
    //15. 3Sum - https://leetcode.com/problems/3sum/description/
    public static List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < n; i ++) {

            if(nums[0] > 0)
                break;
            if(i > 0 && nums[i] == nums[i - 1])
                continue;

            int j = i + 1;
            int k = n - 1;

            while(j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if(sum < 0) {
                    j++;
                } else if(sum > 0) {
                    k--;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    k--;
                    while(j < k && nums[k] == nums[k + 1])
                        k--;
                }
            }
        }

        return res;
    }
}
