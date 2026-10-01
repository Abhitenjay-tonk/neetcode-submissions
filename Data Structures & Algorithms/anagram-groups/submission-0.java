class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m=new HashMap<>();
        for(String s:strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);
            m.putIfAbsent(sortedKey,new ArrayList<>());
            m.get(sortedKey).add(s);
        }
        return new ArrayList<>(m.values());
    }
}
