package Solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsomorphicStrings {
    //205. Isomorphic Strings - https://leetcode.com/problems/isomorphic-strings/description/
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Character> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(i))) {
                map.put(s.charAt(i), t.charAt(i));
            } else {
                if(map.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }
        }

        return true;
    }
}
