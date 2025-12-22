package Solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Sequence {
    //128. Longest Consecutive Sequence - https://leetcode.com/problems/longest-consecutive-sequence/description/
    public static int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for(int num : set) {
            if(!set.contains(num - 1)) {
                int length = 1;

                while (set.contains(num + length)) {
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}
