class MyHashSet {
    // 1. Tạo hình dáng cái Hộp (Chứa con số và Mũi tên)
    private static class ListNode {
        int key;        // Con số ghi trong hộp
        ListNode next;  // Mũi tên chỉ sang hộp tiếp theo

        ListNode(int key) {
            this.key = key;
        }
    }

    // 2. Tạo 10.000 chỗ trống
    private ListNode[] set;

    public MyHashSet() {
        set = new ListNode[10000]; 
        for (int i = 0; i < 10000; i++) {
            // Treo sẵn Hộp "Kẻ mồi" (giá trị 0) vào CẢ 10.000 chỗ
            set[i] = new ListNode(0); 
        }
    }

    // --- HÀM THÊM ---
    public void add(int key) {
        // Tìm đúng xô, và cắm ngón tay (cur) vào Kẻ mồi của xô đó
        ListNode cur = set[key % 10000]; 

        // Ngón tay đứng im, mắt soi theo mũi tên xem hộp phía sau có tồn tại không
        while (cur.next != null) {
            
            // Nếu hộp phía sau ghi đúng số mình định thêm -> Trùng rồi, đi về!
            if (cur.next.key == key) {
                return; 
            }
            // Không trùng -> Nhấc ngón tay lên, chọc sang cái hộp tiếp theo
            cur = cur.next; 
        }

        // Đi đến cuối cùng (mũi tên chỉ vào hư vô). Tạo hộp mới và nối mũi tên vào nó.
        cur.next = new ListNode(key);
    }

    // --- HÀM XÓA ---
    public void remove(int key) {
        // Vẫn phải cắm ngón tay vào Kẻ mồi để đi từ đầu
        ListNode cur = set[key % 10000]; 

        while (cur.next != null) {
            
            // Nếu hộp NGAY TRƯỚC MẶT đúng là kẻ cần xóa
            if (cur.next.key == key) {
                // Xóa bằng cách nhảy cóc: Lấy mũi tên của mình nối thẳng sang thằng đứng sau nó
                cur.next = cur.next.next; 
                return; // Nhổ cỏ xong, đi về!
            }
            
            // Chưa tìm thấy thì lại dời ngón tay đi tiếp
            cur = cur.next;
        }
    }
    
    // Hàm contains viết y hệt hàm add, chỉ đổi phần return...

    public boolean contains(int key) {
        ListNode cur = set[key % 10000]; 

        // Ngón tay đứng im, mắt soi theo mũi tên xem hộp phía sau có tồn tại không
        while (cur.next != null) {
            
            // Nếu hộp phía sau ghi đúng số mình định thêm -> Trùng rồi, đi về!
            if (cur.next.key == key) {
                return true; 
            }
            cur = cur.next;
        }
        return false;
    }
}