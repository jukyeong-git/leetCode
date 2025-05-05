package Solution;

import java.util.Arrays;

public class IsPalindrome {
    //125. Valid Palindrome - https://leetcode.com/problems/valid-palindrome/description/
    public boolean isPalindrome(String s) {

        StringBuilder str = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(65 <= c && c <= 90)
                str.append(Character.toChars(c+32));
            else if(97 <= c && c <= 122)
                str.append(c);
            else if(48 <= c && c <= 57)
                str.append(c);
        }

        s = str.toString();

        int start = 0;
        int end = s.length()-1;

        while(start <= end) {
            if(s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }

        return true;
    }
}
