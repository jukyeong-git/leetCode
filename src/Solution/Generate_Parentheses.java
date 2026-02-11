package Solution;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {
    //22. Generate Parentheses - https://leetcode.com/problems/generate-parentheses/

    /*
     * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
     *
     * Example 1:
     *      Input: n = 3
     *      Output: ["((()))","(()())","(())()","()(())","()()()"]
     *
     * Example 2:
     *      Input: n = 1
     *      Output: ["()"]
     *
     * Constraints:
     *      1 <= n <= 8
     */
    public static List<String> generateParenthesis(int n) {

        List<String> res = new ArrayList<>();

        if(n == 0) return res;

        getGenerateParenthesis(0, 0, "", n, res);

        return res;
    }

    private static void getGenerateParenthesis(int s, int e, String str, int n, List<String> res) {

        if(s == e && s + e == n * 2) {
            res.add(str);
            return;
        }

        if(s < n) {
            getGenerateParenthesis(s + 1, e, str + "(", n, res);
        }

        if(e < s) {
            getGenerateParenthesis(s, e + 1, str + ")", n, res);
        }
    }
}
