public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int key : nums) {
            if (!count.containsKey(key)) {
                count.put(key, 1);
            }
            else {
                int dongGop = count.get(key);
                dongGop ++;
                count.put(key, dongGop);
            }
        }
        List<Integer>[] gio = new List[nums.length + 1];
        for (int ten : count.keySet()) {
            int soLan = count.get(ten);

            if (gio[soLan] == null) {
                gio[soLan] = new ArrayList<>();
            }
            
            gio[soLan].add(ten);
            
        }
        int[] result = new int[k];
        int dem = 0;
        for (int i = gio.length - 1; i > 0; i --) {
            if (gio[i] != null) {
                for (int ten : gio[i]) {
                    result[dem] = ten;
                    dem ++;
                }

                if (dem == k) {
                    return result;
                }
            }
        }

        return result;
    }
}