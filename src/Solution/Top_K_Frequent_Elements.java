package Solution;

import java.util.*;

public class Top_K_Frequent_Elements {
    //347. Top K Frequent Elements - https://leetcode.com/problems/top-k-frequent-elements/description/
    public static int[] topKFrequent(int[] nums, int k) {

        if(nums.length <= 1) return nums;

        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] list = new List[nums.length + 1];
        for(int key : map.keySet()) {
            int count = map.get(key);
            if(list[count] == null)
                list[count] = new ArrayList<>();
            list[count].add(key);
        }

        int[] result = new int[k];
        int count = 0;
        for(int i = list.length - 1; i > 0 && count < k; i --) {
            if(list[i] != null)
                for(int key : list[i]) {
                    //System.out.println("Value: "+ key +", Count : " + i);
                    result[count++] = key;
                }
        }

        return result;
    }
}
