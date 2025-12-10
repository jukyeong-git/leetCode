package Solution;

import java.util.ArrayList;
import java.util.List;

public class Reverse_Words_in_a_String {
    //151. Reverse Words in a String - https://leetcode.com/problems/reverse-words-in-a-string/description/
    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] strArr = s.split(" ");
        List<String> list = new ArrayList<>();

        for(String str : strArr) {
            if(!"".equals(str))
                list.add(str);
        }

        for(int i = list.size()-1; i >=0; i--) {
            result.append(list.get(i));
            if(i != 0)
                result.append(" ");
        }

        return result.toString();
    }
}
