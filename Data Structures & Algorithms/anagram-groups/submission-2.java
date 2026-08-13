class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        
        for (String s : strs) {
            // 1. Chuyển chuỗi thành mảng ký tự
            char[] charArray = s.toCharArray();
            
            // 2. Gọi hàm tự chế của bạn để sắp xếp thay vì dùng Arrays.sort()
            mySort(charArray);
            
            // 3. Đóng gói lại thành String và thao tác với Tủ HashMap
            String sortedS = new String(charArray);
            res.putIfAbsent(sortedS, new ArrayList<>());
            res.get(sortedS).add(s);
        }
        
        return new ArrayList<>(res.values());
    }

    // HÀM TỰ VIẾT BỞI BẠN:
    private void mySort(char[] arr) {
        int n = arr.length;
        // Bắt đầu 2 vòng lặp lồng nhau của thuật toán Nổi bọt
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                
                // KIỂM TRA VÀ HOÁN ĐỔI:
                // Nếu ký tự hiện tại arr[j] lớn hơn ký tự đứng ngay sau nó arr[j + 1]
                if (arr[j] > arr[j + 1]) {
                    
                    // Thực hiện tráo đổi vị trí 2 ký tự (Cần dùng một biến tạm 'temp')
                    // 1. char temp = ...
                    // 2. arr[j] = ...
                    // 3. arr[j + 1] = ...
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                }
            }
        }
    }
}