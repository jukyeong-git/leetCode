package Solution;

public class LongestCommonPrefix {
    //14. Longest Common Prefix - https://leetcode.com/problems/longest-common-prefix/description/
    public String longestCommonPrefix(String[] strs) {

        int count = Integer.MAX_VALUE;

        for(String str : strs) {
            if(str.length() < count)
                count = str.length();
        }

        int i = 0;

        while(i < count) {
            for(int j = 0; j < strs.length; j++) {
                if(strs[0].charAt(i) != strs[j].charAt(i))
                    return strs[i].substring(0, i);
            }
            i++;
        }

        return strs[i].substring(0, i);
    }
}
