class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder filtered = new StringBuilder();
        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                filtered.append(Character.toLowerCase(c));

            }
        }

        String original = filtered.toString();
        String reversed = filtered.reverse().toString();

        return original.equals(reversed);
        
        
    }
}
