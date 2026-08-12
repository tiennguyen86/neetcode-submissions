public class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        
        System.arraycopy(nums, 0, ans, 0, n);   // copy bản 1 vào nửa đầu
        System.arraycopy(nums, 0, ans, n, n);   // copy bản 2 vào nửa sau
        
        return ans;
    }
}