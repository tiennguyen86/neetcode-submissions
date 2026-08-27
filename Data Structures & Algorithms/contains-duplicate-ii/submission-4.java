class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> cuaSo = new HashSet<>();
        int l = 0; 
        for(int r = 0; r < nums.length; r++) {
            if (r - l > k) {
                cuaSo.remove(nums[l]);
                l ++;
            }
            if (cuaSo.contains(nums[r])) {
                return true;
            }
            else {
                cuaSo.add(nums[r]);
            }
        }
        return false;
    }
}