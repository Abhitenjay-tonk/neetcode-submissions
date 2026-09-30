class Solution {
    public boolean isAnagram(String s, String t) {
if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charCounts = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!charCounts.containsKey(c)) {
                return false;
            }
            int count = charCounts.get(c) - 1;
            if (count == 0) {
                charCounts.remove(c);
            } else {
                charCounts.put(c, count);
            }
        }

        return charCounts.isEmpty();
    }
}
