class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        
        // Vòng for ngoài: Đi dò từng phần tử
        for (int i = 0; i < n; i++) {
            
            // Nếu phát hiện phần tử cần xóa
            if (nums[i] == val) {
                
                // Vòng for trong: Dịch chuyển toàn bộ phần tử phía sau lên 1 bước
                for (int j = i + 1; j < n; j++) {
                    nums[j - 1] = nums[j];
                }
                
                n--; // Độ dài mảng giảm đi 1
                i--; // Lùi i lại để kiểm tra phần tử vừa bị dịch lên
            }
        }
        return n; // n lúc này chính là số phần tử còn lại
    }
}