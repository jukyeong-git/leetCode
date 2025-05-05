package Solution;

public class ReverseString {
    //344. Reverse String - https://leetcode.com/problems/reverse-string/description/
    public void reverseString(char[] s) {

        int start = 0;
        int end = s.length-1;

        while(start<=end) {
            swap(s, start, end);
            start++;
            end--;
        }

        for(char c : s) {
            System.out.print(c);
        }
    }

    public void swap(char[] s, int start, int end){

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

    }
}
