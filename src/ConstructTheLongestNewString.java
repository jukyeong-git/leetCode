public class ConstructTheLongestNewString {
    //2745. Construct the Longest New String - https://leetcode.com/problems/construct-the-longest-new-string/description/
    public static int longestString(int x, int y, int z) {
        if(x == y) {
            return (x + y)*2 + z*2;
        }

        int i = Math.min(x, y);
        return (2*i + 1)*2 + z*2;
    }
}
