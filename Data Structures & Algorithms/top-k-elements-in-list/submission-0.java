class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        List<Integer> unique = new ArrayList<>(freq.keySet());
        unique.sort((a, b) -> {
            int cA = freq.get(a);
            int cB = freq.get(b);
            if (cA == cB) {
                return Integer.compare(a, b);
            }
            return Integer.compare(cB, cA);
        });

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = unique.get(i);
        }
        
        return res;
    }
}
