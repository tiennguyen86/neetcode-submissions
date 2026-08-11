public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        for (int i = 0; i < strs[0].length(); i ++) {
            for (int j = 0; j < strs.length; j ++) {
                if (i == strs[j].length()) {
                    return result;
                }
                if (strs[j].charAt(i) != strs[0].charAt(i)) {
                    return result;
                }
            }
            result = result + strs[0].charAt(i);
        }
        return result;

    }
}