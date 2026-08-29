class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> gioDung = new ArrayList<>();
        if (root == null) return gioDung;
        
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            // Lụm tiền GỐC nhét vào giỏ
            gioDung.add(cur.val);
            
            // Nhét TRÁI vào trước, để PHẢI trồi lên trên (khác với Preorder lúc nãy nhé)
            if (cur.left != null) stack.push(cur.left);
            // Nhét PHẢI vào sau, rút ra xử lý trước
            if (cur.right != null) stack.push(cur.right);
        }
        
        // Phép thuật: Đảo ngược cái giỏ lại! (Trong Java dùng Collections.reverse)
        Collections.reverse(gioDung);
        
        return gioDung;
    }
}