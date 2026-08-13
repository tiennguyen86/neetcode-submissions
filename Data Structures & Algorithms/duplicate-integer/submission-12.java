public class Solution {
    // Đây là 1 method(hàm) công khai chỉ trả về đúng hoặc sai  tên là hasDuplicate
    // với đầu vào là 1 mảng số nguyên tên nums
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j ++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}