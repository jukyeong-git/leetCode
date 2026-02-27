package com.leetcode.solution;

import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters {
    //3. Longest Substring Without Repeating Characters - https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

    /*
     * Given a string s, find the length of the longest substring without duplicate characters.
     *
     * Example 1:
     *      Input: s = "abcabcbb"
     *      Output: 3
     * Explanation:
     *      The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
     *
     * Example 2:
     *      Input: s = "bbbbb"
     *      Output: 1
     * Explanation:
     *      The answer is "b", with the length of 1.
     *
     * Example 3:
     *      Input: s = "pwwkew"
     *      Output: 3
     * Explanation:
     *      The answer is "wke", with the length of 3.
     *
     * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
     *
     * Constraints:
     *      0 <= s.length <= 5 * 104
     *      s consists of English letters, digits, symbols and spaces.
     */
    public static int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, max = 0;
        HashSet<Character> set = new HashSet<>();

        while(right < s.length()) {
            if(!set.contains(s.charAt(right))) {
                set.add(s.charAt(right++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(left++));
            }
        }

        return max;
    }
}
