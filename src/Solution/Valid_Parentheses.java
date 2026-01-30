package Solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Valid_Parentheses {
    //20. Valid Parentheses - https://leetcode.com/problems/valid-parentheses/description/

    /*
     * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * An input string is valid if:
     * - Open brackets must be closed by the same type of brackets.
     * - Open brackets must be closed in the correct order.
     * - Every close bracket has a corresponding open bracket of the same type.
     *
     * Example 1:
     *      Input: s = "()"
     *      Output: true
     *
     * Example 2:
     *      Input: s = "()[]{}"
     *      Output: true
     *
     * Example 3:
     *      Input: s = "(]"
     *      Output: false
     *
     * Example 4:
     *      Input: s = "([])"
     *      Output: true
     *
     * Example 5:
     *      Input: s = "([)]"
     *      Output: false
     *
     * Constraints:
     *      1 <= s.length <= 104
     *      s consists of parentheses only '()[]{}'.
     */
    public static boolean isValid(String s) {

        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        Stack<Character> stk = new Stack<>();

        for(char c : s.toCharArray()){
            if(map.get(c) == null) {
                stk.push(c);
            } else {
                if(stk.isEmpty() && map.get(c) != null)
                    return false;

                if(!stk.isEmpty() && stk.pop() != map.get(c))
                    return false;
            }
        }

        return stk.isEmpty();
    }
}
