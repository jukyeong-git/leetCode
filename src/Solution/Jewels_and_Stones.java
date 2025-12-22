package Solution;

import java.util.HashMap;
import java.util.Map;

public class Jewels_and_Stones {
    //771. Jewels and Stones - https://leetcode.com/problems/jewels-and-stones/description/
    public static int numJewelsInStones(String jewels, String stones) {

        int count = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(char c : stones.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(char c : jewels.toCharArray()) {
            if(map.get(c) != null)
                count += map.get(c);
        }

        return count;
    }
}
