class Solution {
    public int maxProfit(int[] p) {
        if (p == null) {
            return 0;
        }
        int minMua = p[0];
        int maxLai = 0;

        for (int i = 0; i < p.length; i ++) {
            if (p[i] < minMua) {
                minMua = p[i];
            }
            else {
                int laiHomNay = p[i] - minMua;
                if (laiHomNay > maxLai) {
                    maxLai = laiHomNay;
                }
            }
        }
        return maxLai;
    }
}
