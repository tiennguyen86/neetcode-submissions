class Solution {
    public int shipWithinDays(int[] weights, int days) {

        
        int l = 0, r = 0;

        for (int i = 0; i < weights.length; i ++) {
            if (weights[i] > l) {
                l = weights[i];
            }
            r += weights[i];
        }

        while (l <= r) {
            int ngayHoanThanh = 1;
            int hangTrenTau = 0;
            int mid = l + (r - l) / 2;
            for (int i = 0; i < weights.length; i ++) {
                if (hangTrenTau + weights[i] > mid) {
                    ngayHoanThanh ++;
                    hangTrenTau = weights[i];
                }
                else{
                    hangTrenTau += weights[i];
                }
            }

            if (ngayHoanThanh <= days) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
           
        }
        return l;

    }
}