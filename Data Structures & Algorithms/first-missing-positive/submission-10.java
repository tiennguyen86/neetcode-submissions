class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Bước 1 + 2:
        // Đưa số x về đúng index x - 1
        for (int i = 0; i < n; i++) {
            while (
                nums[i] >= 1 &
                nums[i] <= n &&
                nums[nums[i] - 1] != nums[i]
            ) {
                int correctIndex = nums[i] - 1;

                // Swap
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }

        // Bước 3:
        // Tìm vị trí đầu tiên không chứa i + 1
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // Nếu 1 -> n đều xuất hiện
        return n + 1;
    }
}