package Solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Valid_Parentheses {
    //20. Valid Parentheses - https://leetcode.com/problems/valid-parentheses/description/
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
