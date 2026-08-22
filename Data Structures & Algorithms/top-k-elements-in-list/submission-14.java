public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            if (!count.containsKey(num)) {
                count.put(num, 1);
            }
            else {
                int giaTriCu = count.get(num);
                giaTriCu ++;
                count.put(num, giaTriCu);
            }
        }
        List<Integer>[] buckets = new List[nums.length + 1];

        for (int key : count.keySet()) {
            int soLan = count.get(key);
            if (buckets[soLan] == null) {
                buckets[soLan] = new ArrayList<>();
            }
            buckets[soLan].add(key);
        }

        int[] result = new int[k];
        int dem = 0;

        for (int i = buckets.length - 1; i > 0; i --) {
            if (buckets[i] != null) {
                for (int key : buckets[i]) {
                    result[dem] = key;
                    dem ++;

                    if (dem == k) {
                        return result;
                    }
                }
            }

        }
        return result;
    }
}