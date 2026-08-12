public class Solution {

    public String longestCommonPrefix(String[] strs) {
        String result = "";
        String a = strs[0];
        for (int i = 0; i < strs[0].length(); i ++) {
            for (String s : strs) {
                if (i == s.length()) {
                    return result;
                }
                if (strs[0].charAt(i) != s.charAt(i)) {
                    return result;
                }
            }
            result = result + strs[0].charAt(i);
        }
        return result;
        
    }
}