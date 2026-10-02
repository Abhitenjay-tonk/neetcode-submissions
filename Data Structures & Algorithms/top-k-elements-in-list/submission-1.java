class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Integer> h = new PriorityQueue<>((a, b) -> {
            int cA = freq.get(a);
            int cB = freq.get(b);
            if (cA == cB) {
                return Integer.compare(b, a); 
            }
            return Integer.compare(cA, cB); 
        });

        for (int n : freq.keySet()) {
            h.add(n);
            if (h.size() > k) {
                h.poll();
            }
        }

        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            res[i] = h.poll();
        }
        
        return res;
    }
}
