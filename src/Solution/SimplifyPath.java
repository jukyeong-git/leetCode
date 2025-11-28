package Solution;

import java.util.Arrays;
import java.util.Stack;

public class SimplifyPath {
    //71. Simplify Path - https://leetcode.com/problems/simplify-path/description/
    public static String simplifyPath(String path) {

        String[] strArr = path.split("/");
        Stack<String> stk = new Stack<>();

        for(String str : strArr) {
            if(str.equals(".") || str.isEmpty())
                continue;
            else if(str.equals("..")){
                if(!stk.isEmpty())
                    stk.pop();
            } else {
                stk.push(str);
            }
        }

        return "/" + String.join("/", stk);
    }
}
