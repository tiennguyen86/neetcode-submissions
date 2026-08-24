class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            }
            else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if (s.charAt(i) == ')' && top != '(') return false;
                if (s.charAt(i) == ']' && top != '[') return false;
                if (s.charAt(i) == '}' && top != '{') return false;
            }
        }
        return stack.isEmpty();

    }
}
