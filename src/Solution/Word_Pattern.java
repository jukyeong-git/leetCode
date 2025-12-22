package Solution;

import java.util.HashMap;
import java.util.Map;

public class Word_Pattern {
    //290. Word Pattern - https://leetcode.com/problems/word-pattern/description/
    public static boolean wordPattern(String pattern, String s) {

        String[] sArr = s.split(" ");
        Map<Character, String> map = new HashMap<>();

        if(pattern.length() != sArr.length) return false;

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
