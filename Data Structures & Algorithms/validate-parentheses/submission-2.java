class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } 
            else {
                // Kiểm tra stack hiện tại có đang rỗng không
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (top == '(' && c != ')') {
                    return false;
                }
                if (top == '{' && c != '}') {
                    return false;
                }
                if (top == '[' && c != ']') {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }
}
