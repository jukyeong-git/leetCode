package Solution;

public class Length_of_Last_Word {
    //58. Length of Last Word - https://leetcode.com/problems/length-of-last-word/description/
    public static int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        int len = str.length;
        String result = str[len-1];
        return result.length();
    }
}
