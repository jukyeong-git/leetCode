package Solution;

import java.util.*;

public class Roman_to_Integer {
    //13. Roman to Integer - https://leetcode.com/problems/roman-to-integer/
    public static int romanToInt(String s) {

        int result = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        for(int i=0; i<s.length(); i++) {
            if(i != s.length()-1) {
                String roman = String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i + 1));
                if (map.containsKey(roman)) {
                    result += map.get(roman);
                    i += 1;
                } else {
                    result += map.get(String.valueOf(s.charAt(i)));
                }
            } else {
                result += map.get(String.valueOf(s.charAt(i)));
            }
        }

        return result;
    }
}
