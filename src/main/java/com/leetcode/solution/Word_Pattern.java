package com.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

public class Word_Pattern {
    //290. Word Pattern - https://leetcode.com/problems/word-pattern/description/

    /*
     * Given a pattern and a string s, find if s follows the same pattern.
     * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
     * Specifically:
     * - Each letter in pattern maps to exactly one unique word in s.
     * - Each unique word in s maps to exactly one letter in pattern.
     * - No two letters map to the same word, and no two words map to the same letter.
     *
     * Example 1:
     *      Input: pattern = "abba", s = "dog cat cat dog"
     *      Output: true
     * Explanation: The bijection can be established as:
     *      'a' maps to "dog".
     *      'b' maps to "cat".
     *
     * Example 2:
     *      Input: pattern = "abba", s = "dog cat cat fish"
     *      Output: false
     *
     * Example 3:
     *      Input: pattern = "aaaa", s = "dog cat cat dog"
     *      Output: false
     */
    public static boolean wordPattern(String pattern, String s) {

        String[] sArr = s.split(" ");

        if(pattern.length() != sArr.length)
            return false;

        Map<Character, String> map = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++) {
            if(!map.containsKey(pattern.charAt(i)) && !map.containsValue(sArr[i])) {
                map.put(pattern.charAt(i), sArr[i]);
            } else {
                if(!sArr[i].equals(map.get(pattern.charAt(i))))
                    return false;
            }
        }

        return true;
    }
}
