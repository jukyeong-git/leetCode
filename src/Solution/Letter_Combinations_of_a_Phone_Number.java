package Solution;

import java.util.*;

public class Letter_Combinations_of_a_Phone_Number {
    //17. Letter Combinations of a Phone Number - https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

    /*
     * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
     * Return the answer in any order.
     *
     * A mapping of digits to letters (just like on the telephone buttons) is given below.
     * Note that 1 does not map to any letters.
     *
     * Example 1:
     *      Input: digits = "23"
     *      Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
     *
     * Example 2:
     *      Input: digits = "2"
     *      Output: ["a","b","c"]
     *
     * Constraints:
     *      1 <= digits.length <= 4
     *      digits[i] is a digit in the range ['2', '9'].
     */
    private static List<String> res;
    private static Map<Character, String> map;

    public static List<String> letterCombinations(String digits) {

        res = new ArrayList<>();

        if(digits == null || digits.length() ==0) {
            return res;
        }

        map = new HashMap<>();

        setValMap();

        backTrack(digits, 0, new StringBuilder());

        return res;
    }

    private static void setValMap() {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }

    private static void backTrack(String digits, int idx, StringBuilder subRes) {

        if(digits.length() == idx) {
            res.add(subRes.toString());
            return;
        }

        String str = map.get(digits.charAt(idx));

        for(char c : str.toCharArray()) {
            subRes.append(c);
            backTrack(digits, idx + 1, subRes);
            subRes.deleteCharAt(idx);
        }
    }
}
