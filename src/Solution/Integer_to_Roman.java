package Solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Integer_to_Roman {
    //12. Integer to Roman - https://leetcode.com/problems/integer-to-roman/description/
    public static String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");

        List<Integer> list = new ArrayList<>();
        list.add(1000);
        list.add(900);
        list.add(500);
        list.add(400);
        list.add(100);
        list.add(90);
        list.add(50);
        list.add(40);
        list.add(10);
        list.add(9);
        list.add(5);
        list.add(4);
        list.add(1);

        for (Integer integer : list) {
            int count = num / integer;
            while (count != 0) {
                result.append(map.get(integer));
                count--;
            }
            num %= integer;
        }

        return result.toString();
    }
}


