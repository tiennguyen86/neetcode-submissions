class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Khởi tạo chiếc tủ chứa các ngăn kéo Anagram
        Map<String, List<String>> res = new HashMap<>();

        for (String s : strs) {
            
            // BƯỚC 1: Tạo một cái khay 26 ô trống để đếm ký tự
            int[] count = new int[26];

            // BƯỚC 2: Duyệt qua từng chữ cái của chuỗi s và đếm (Cộng 1 vào ô tương ứng)
            // ---> BẠN TỰ VIẾT VÒNG LẶP FOR Ở ĐÂY NHÉ <---
            // Gợi ý: Dùng vòng lặp for-each (for char c : s.toCharArray()) 
            //        và đếm bằng count[c - 'a']++

            for (char c : s.toCharArray()) {
                count[c - 'a'] ++;
            }
            
            
            
            // BƯỚC 3: Biến cái khay 26 ô thành một chuỗi String để làm "Nhãn dán" (Key)
            String key = Arrays.toString(count);

            // BƯỚC 4: Nếu tủ chưa có cái Key này, thì tạo một ngăn kéo mới
            res.putIfAbsent(key, new ArrayList<>());

            // BƯỚC 5: Mở ngăn kéo có cái Key đó ra, cất chuỗi s gốc vào
            res.get(key).add(s);
        }

        // Gom tất cả đồ vật trong các ngăn kéo lại và trả về
        return new ArrayList<>(res.values());
    }
}