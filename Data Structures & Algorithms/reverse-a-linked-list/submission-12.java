class Solution {
    // Đổi tên tham số 'head' thành 'nutHienTai' vì bản chất bạn đang dùng nó làm con trỏ chạy
    public ListNode reverseList(ListNode nutHienTai) {
        
        // Khởi tạo khoảng không phía sau
        ListNode nutTruocDo = null; 
        
        while (nutHienTai != null) {
            // 1. Hộp giữ chân: Nhớ mặt nút đằng trước kẻo nó trôi mất
            ListNode nutTiepTheo = nutHienTai.next;
            
            // 2. BẺ LÁI: Rút dây cáp, chĩa mũi tên ngược về nút phía sau
            nutHienTai.next = nutTruocDo;
            
            // 3. Nút phía sau dịch sang phải 1 bước (bước vào chỗ của nút hiện tại)
            nutTruocDo = nutHienTai;
            
            // 4. Nút hiện tại dịch sang phải 1 bước (bước vào cái hộp đã giữ chân lúc nãy)
            nutHienTai = nutTiepTheo;
        }
        
        // Khi vòng lặp kết thúc, 'nutTruocDo' chính là cái đầu mới của danh sách
        return nutTruocDo;
    }
}