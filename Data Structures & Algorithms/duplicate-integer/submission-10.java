public class Solution {
    // Đây là 1 method(hàm) công khai chỉ trả về đúng hoặc sai  tên là hasDuplicate
    // với đầu vào là 1 mảng số nguyên tên nums
    public boolean hasDuplicate(int[] nums) {
        
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }
}