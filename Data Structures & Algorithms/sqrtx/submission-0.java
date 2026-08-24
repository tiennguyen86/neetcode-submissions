class Solution {
    public int mySqrt(int x) {
        // Số 0 là trường hợp đặc biệt, xử lý luôn cho nhanh
        if (x == 0) return 0;
        
        int left = 1;
        int right = x;
        
        while (left <= right) {
            // Lại là công thức chia đôi chống tràn số huyền thoại
            int mid = left + (right - left) / 2;
            
            // Dùng phép chia để chống tràn số thay vì phép nhân
            if (mid == x / mid) {
                return mid; // Tìm trúng phóc, chốt luôn!
            } 
            else if (mid < x / mid) {
                left = mid + 1; // mid còn nhỏ quá, cắt bỏ nửa bên trái
            } 
            else {
                right = mid - 1; // mid to quá, cắt bỏ nửa bên phải
            }
        }
        
        // Ảo thuật ở đây: Đề yêu cầu làm tròn XUỐNG, 
        // Khi 2 chốt đan chéo nhau, chốt 'right' sẽ luôn nằm ở con số nhỏ hơn.
        // Nên ta return right là chuẩn xác!
        return right;
    }
}
