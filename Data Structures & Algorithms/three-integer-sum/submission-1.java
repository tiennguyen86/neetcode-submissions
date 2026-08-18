public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // Bỏ qua nums[i] bị trùng
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0) {
                    j++;

                } else if (sum > 0) {
                    k--;

                } else {
                    // Tìm thấy bộ 3
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    j++;
                    k--;

                    // Bỏ qua các số trùng ở j
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    // Bỏ qua các số trùng ở k
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }

        return res;
    }
}