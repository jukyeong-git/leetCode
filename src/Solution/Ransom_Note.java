package Solution;

import java.util.*;

public class Ransom_Note {
    //383. Ransom Note - https://leetcode.com/problems/ransom-note/description/

    /*
     * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
     * Each letter in magazine can only be used once in ransomNote.
     *
     * Example 1:
     *      Input: ransomNote = "a", magazine = "b"
     *      Output: false
     *
     * Example 2:
     *      Input: ransomNote = "aa", magazine = "ab"
     *      Output: false
     *
     * Example 3:
     *      Input: ransomNote = "aa", magazine = "aab"
     *      Output: true
     *
     * Constraints:
     *      1 <= ransomNote.length, magazine.length <= 105
     *      ransomNote and magazine consist of lowercase English letters.
     */
    public static boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> mMap = new HashMap<>();
        for(char c : magazine.toCharArray()) {
            mMap.put(c, mMap.getOrDefault(c, 0)+1);
        }

        for(char c : ransomNote.toCharArray()) {
            if(mMap.get(c) != null && mMap.get(c) > 0) {
                mMap.put(c, mMap.get(c)-1);
            } else {
                return false;
            }
        }

        return true;
    }
}
