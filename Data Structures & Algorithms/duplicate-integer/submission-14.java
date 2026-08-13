public class Solution {
    // Đây là 1 method(hàm) công khai chỉ trả về đúng hoặc sai  tên là hasDuplicate
    // với đầu vào là 1 mảng số nguyên tên nums
    public boolean hasDuplicate(int[] nums) {
       Arrays.sort(nums);
       for (int i = 0; i < nums.length - 1; i ++) {
        if (nums[i] == nums[i + 1]) {
            return true;
        }
       }
       return false;
    }
}