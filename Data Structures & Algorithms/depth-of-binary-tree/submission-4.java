/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Deque<TreeNode> stackNode = new ArrayDeque<>();
        Deque<Integer> stackDepth = new ArrayDeque<>();

        stackNode.push(root);
        stackDepth.push(1);
        int maxDepth = 0;

        while(!stackNode.isEmpty()) {
            TreeNode cur = stackNode.pop();
            int curDepth = stackDepth.pop();

            maxDepth = Math.max(maxDepth, curDepth);
            if (cur.left != null) {
                stackNode.push(cur.left);
                stackDepth.push(curDepth + 1);
            }
            if (cur.right != null) {
                stackNode.push(cur.right);
                stackDepth.push(curDepth + 1);
            }
        }
        return maxDepth;
    }
}
