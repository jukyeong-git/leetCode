package Solution;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    //242. Valid Anagram - https://leetcode.com/problems/valid-anagram/description/
    public boolean isAnagram(String s, String t) {

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
