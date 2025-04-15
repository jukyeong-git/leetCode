package Solution;

import java.util.HashMap;
import java.util.Map;

public class IsSubsequence {
    //392. Is Subsequence - https://leetcode.com/problems/is-subsequence/description/
    public boolean isSubsequence(String s, String t) {

        int index = Integer.MIN_VALUE;
        Map<Integer, Character> map = new HashMap<>();
        for(int i=0; i<t.length(); i++) {
            map.put(i, t.charAt(i));
        }

        for(int i=0; i<s.length(); i++) {
            if(!map.containsValue(s.charAt(i))){
                return false;
            } else {
                int key = getKey(map, index, s.charAt(i));
                if(index < key) {
                    index = key;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public int getKey(Map<Integer, Character> map, int index, char value) {

        int key = Integer.MIN_VALUE;

        for(int num : map.keySet()) {
            if(index < num && value == map.get(num)) {
                key = num;
                map.remove(num);
                break;
            }
        }

        return key;
    }
}
