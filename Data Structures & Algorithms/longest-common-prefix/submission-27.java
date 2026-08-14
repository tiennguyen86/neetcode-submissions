public class Solution {

    public String longestCommonPrefix(String[] strs) {
      String s = "";
      String a = strs[0];

      for (int i = 0; i < a.length(); i ++) {
        for (String t : strs) {
            if (i == t.length()) {
                return s;
            }

            if (a.charAt(i) != t.charAt(i)) {
                return s;
            }
        }

        s += a.charAt(i);
      }
      return s;
    }
}