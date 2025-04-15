package Solution;

public class MergeAlternately {
    //1768. Merge Strings Alternately - https://leetcode.com/problems/merge-strings-alternately/description/
    public String mergeAlternately(String word1, String word2) {

        int index = 0;
        StringBuilder result = new StringBuilder();

        int word1Len = word1.length();
        int word2Len = word2.length();
        int loop = Math.max(word1Len, word2Len);

        for(int i=0; i<loop; i++){
            if(i < word1Len && i < word2Len) {
                result.append(word1.charAt(i));
                result.append(word2.charAt(i));
            } else if (word1Len <= i && i < word2Len){
                result.append(word2.charAt(i));
            } else {
                result.append(word1.charAt(i));
            }
        }

        return result.toString();
    }
}
