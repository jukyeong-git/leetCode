package com.leetcode.solution;

public class Longest_Palindromic_Substring {
    //5. Longest Palindromic Substring - https://leetcode.com/problems/longest-palindromic-substring/description/

    /*
     * Given a string s, return the longest palindromic substring in s.
     *
     * Example 1:
     *      Input: s = "babad"
     *      Output: "bab"
     * Explanation:
     *      "aba" is also a valid answer.
     *
     * Example 2:
     *      Input: s = "cbbd"
     *      Output: "bb"
     *
     * Constraints:
     *      1 <= s.length <= 1000
     *      s consist of only digits and English letters.
     */
    public String longestPalindrome(String s) {

        if(s == null || s.length() == 0) {
            return "";
        }

        int start = 0, end = 0;

        for(int i = 0; i < s.length(); i++) {

            int odd = isPalindrome(s, i, i);
            int oven = isPalindrome(s, i, i + 1);
            int maxLen = Math.max(odd, oven);

            if(maxLen > end - start) {
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int isPalindrome(String s, int left, int right) {

        while(0 <= left && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return (right - left + 1) - 2;
    }
}
