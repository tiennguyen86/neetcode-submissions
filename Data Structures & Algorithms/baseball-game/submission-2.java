class Solution {
    public int calPoints(String[] op) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < op.length; i ++) {
            if (op[i].equals("C")) {
                stack.pop();
            }
            else if (op[i].equals("D")) {
                stack.push(2 * stack.peek());
            }
            else if (op[i].equals("+")) {
                int top1 = stack.pop();
                int top2 = stack.pop();
                stack.push(top2);
                stack.push(top1);
                stack.push(top1 + top2);
            }
            else {
                stack.push(Integer.parseInt(op[i]));
            }
        }

        int sum = 0;
        for (int e : stack) {
            sum += e;
        }
        return sum;
    }
}