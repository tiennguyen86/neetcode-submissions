class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;  // tăng khi gặp ký tự trong s
            count[t.charAt(i) - 'a']--;  // giảm khi gặp ký tự trong t
        }

        for (int x : count) {
            if (x != 0) return false;    // nếu ô nào khác 0 → không phải anagram
        }

        return true;
    }
}
