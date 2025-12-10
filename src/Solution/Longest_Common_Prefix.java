package Solution;

public class Longest_Common_Prefix {
    //14. Longest Common Prefix - https://leetcode.com/problems/longest-common-prefix/description/
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length <= 1) return strs[0];

        int count = Integer.MAX_VALUE;

        for(String str : strs) {
            count = Math.min(count, str.length());
        }

        int i = 0;

        while(i < count) {
            for(int j = 0; j < strs.length; j++) {
                if(strs[0].charAt(i) != strs[j].charAt(i))
                    return strs[0].substring(0, i);
            }
            i++;
        }

        return strs[0].substring(0, i);
    }
}
