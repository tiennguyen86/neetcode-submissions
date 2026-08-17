class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] a = t.toCharArray();
        char[] b = s.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i ++) {
            if (a[i] - b[i] != 0) {
                return false;
            }
        }

        return true;
      

    }
}
