class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> cuaSo = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (cuaSo.contains(nums[i])) {
                return true;
            }
            else {
                cuaSo.add(nums[i]);
            }

            if (cuaSo.size() > k) {
                cuaSo.remove(nums[i - k]);
            }
        }
        return false;
    }
}