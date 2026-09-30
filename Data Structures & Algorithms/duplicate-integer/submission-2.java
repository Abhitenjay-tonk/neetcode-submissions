class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dups = new HashSet<>();
        for (int num : nums) {
            dups.add(num);
        }
        return dups.size() < nums.length;
    }
}