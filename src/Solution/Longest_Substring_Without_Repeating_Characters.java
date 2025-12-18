package Solution;

import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters {
    //3. Longest Substring Without Repeating Characters - https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int left = 0;
        int right = 0;
        int maxCount = 0;
        HashSet<Character> hashSet = new HashSet();

        while(right < len) {
            if(!hashSet.contains(s.charAt(right))){
                hashSet.add(s.charAt(right++));
                maxCount = Math.max(maxCount, hashSet.size());
            } else {
                hashSet.remove(s.charAt(left++));
            }
        }

        return maxCount;
    }
}
