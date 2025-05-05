package Solution;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    //169. Majority Element - https://leetcode.com/problems/majority-element/description/
    public int majorityElement(int[] nums) {

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
    }
}
