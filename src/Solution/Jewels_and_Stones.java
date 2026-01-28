package Solution;

import java.util.HashMap;
import java.util.Map;

public class Jewels_and_Stones {
    //771. Jewels and Stones - https://leetcode.com/problems/jewels-and-stones/description/

    /*
     * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
     * Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
     * Letters are case sensitive, so "a" is considered a different type of stone from "A".
     *
     * Example 1:
     * - Input: jewels = "aA", stones = "aAAbbbb"
     * - Output: 3
     *
     * Example 2:
     * - Input: jewels = "z", stones = "ZZ"
     * - Output: 0
     *
     * Constraints:
     * - 1 <= jewels.length, stones.length <= 50
     * - jewels and stones consist of only English letters.
     * - All the characters of jewels are unique.
     */
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
