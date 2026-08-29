class Solution {
    // Hàm chính
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> gioDung = new ArrayList<>(); // Giỏ cục bộ, an toàn tuyệt đối
        diNhatTien(root, gioDung);
        return gioDung;
    }

    // Hàm phụ
    private void diNhatTien(TreeNode node, List<Integer> gioDung) {
        if (node == null) return;
        
        // ??? (Càn quét nhánh Trái)
        // ??? (Càn quét nhánh Phải)
        // ??? (Nhặt tiền Gốc bỏ vào giỏ)
        diNhatTien(node.left, gioDung);
        diNhatTien(node.right, gioDung);
        gioDung.add(node.val);

    }
}