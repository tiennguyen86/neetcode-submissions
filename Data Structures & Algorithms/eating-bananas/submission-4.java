class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1; 
        int max = 0;

        for (int i = 0; i < piles.length; i ++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        int r = max;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            long tongSoGioAn = 0;
            for (int i = 0; i < piles.length; i ++) {
                tongSoGioAn += (piles[i] + mid - 1) / mid;
            }
            if (tongSoGioAn <= h) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return l;

    }
}
