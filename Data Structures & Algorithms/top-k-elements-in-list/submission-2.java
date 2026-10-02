class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        List<Integer>[] buc = new List[nums.length + 1];
        for (int key : freq.keySet()) {
            int c = freq.get(key);
            if (buc[c] == null) {
                buc[c] = new ArrayList<>();
            }
            buc[c].add(key);
        }

        int[] res = new int[k];
        int in = 0;
        for (int i = buc.length - 1; i >= 0 && in < k; i--) {
            if (buc[i] != null) {
                Collections.sort(buc[i]);
                
                for (int j = 0; j < buc[i].size() && in < k; j++) {
                    res[in++] = buc[i].get(j);
                }
            }
        }
        
        return res;
    }
}
