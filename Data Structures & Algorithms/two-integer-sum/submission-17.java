class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[][] indexed = new int[nums.length][2];

        for (int i = 0; i < nums.length; i ++) {

            indexed[i][0] = nums[i];
            indexed[i][1] = i;           
        }
        Arrays.sort(indexed, (a, b) -> a[0] - b[0]);

        int left = 0;
        int right = indexed.length - 1;


        while (left < right) {
            int sum = indexed[left][0] + indexed[right][0];

            if (sum == target) {
                int l = indexed[left][1];
                int r = indexed[right][1];
                return new int[] {Math.min(l, r), Math.max(l, r)}; // luôn trả index nhỏ trước

            }
            else if (sum < target) {
                left ++;
            }
            else {
                right --;
            }

        }

        return new int[] {};

    }

}
