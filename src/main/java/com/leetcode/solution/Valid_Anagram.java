package com.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

public class Valid_Anagram {
    //242. Valid Anagram - https://leetcode.com/problems/valid-anagram/description/

    /*
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     *
     * Example 1:
     *      Input: s = "anagram", t = "nagaram"
     *      Output: true
     *
     * Example 2:
     *      Input: s = "rat", t = "car"
     *      Output: false
     *
     * Constraints:
     *      1 <= s.length, t.length <= 5 * 104
     *      s and t consist of lowercase English letters.
     *
     * Follow up:
     *      What if the inputs contain Unicode characters? How would you adapt your com.leetcode.solution to such a case?
     */
    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for(char c : s.toCharArray()) {
            sMap.put(c, sMap.getOrDefault(c, 0) +1);
        }

        for(char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) +1);
        }

        return sMap.equals(tMap);
    }
}
