public class Solution {

    public String longestCommonPrefix(String[] strs) {
      String result = "";
      String a = strs[0];

      // Kiểm tra chuỗi rỗng 
      if (strs == null || strs.length == 0) {
            return "";
        }

      for (int i = 0; i < a.length(); i ++) {
        for (String s : strs) {
          if (i == s.length()) {
            return result;
          }

          if (a.charAt(i) != s.charAt(i)) {
            return result;
          }
        }
        result += a.charAt(i);
      }

      return result;
    }
}