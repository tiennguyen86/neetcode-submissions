public class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Bước 1: Khởi tạo kết quả là chuỗi rỗng
        String result = "";

        // Bước 2: Lặp qua từng chỉ số i của chuỗi đầu tiên
        for (int i = 0; i < strs[0].length(); i++) {

            // Bước 3: Kiểm tra toàn bộ các chuỗi tại chỉ số i
            for (String s : strs) {

                // Trường hợp ngoại lệ 1:
                // Chuỗi s ngắn hơn → i vượt ra ngoài phạm vi
                if (i == s.length()) {
                    return result;
                }

                // Trường hợp ngoại lệ 2:
                // Ký tự tại vị trí i khác với chuỗi đầu tiên
                if (s.charAt(i) != strs[0].charAt(i)) {
                    return result;
                }
            }

            // Bước 4: Tất cả chuỗi có cùng ký tự tại vị trí i
            // → thêm ký tự đó vào kết quả
            result += strs[0].charAt(i);
        }

        // Bước 5: Trả về kết quả
        return result;
    }

}