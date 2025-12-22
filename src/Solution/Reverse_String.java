package Solution;

public class Reverse_String {
    //344. Reverse String - https://leetcode.com/problems/reverse-string/description/
    public static void reverseString(char[] s) {

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

    public static void swap(char[] s, int start, int end){

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

    }
}
