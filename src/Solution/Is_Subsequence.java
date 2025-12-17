package Solution;

import java.util.HashMap;
import java.util.Map;

public class Is_Subsequence {
    //392. Is Subsequence - https://leetcode.com/problems/is-subsequence/description/
    public static boolean isSubsequence(String s, String t) {
        int sIdx = 0;
        int tIdx = 0;

        while(sIdx < s.length() && tIdx < t.length()) {
            if(s.charAt(sIdx) == t.charAt(tIdx)) {
                sIdx++;
            }
            tIdx++;
        }

        return sIdx == s.length();
    }
}
