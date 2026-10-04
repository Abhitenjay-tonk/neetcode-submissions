class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        Stack<Character> st =new Stack<>();

        Map<Character,Character> m=new HashMap<>();
        m.put(')','(');
        m.put('}','{');
        m.put(']','[');
        for(char c:s.toCharArray()){
            if(m.containsKey(c)){
                if(st.isEmpty() || st.pop()!=m.get(c)) return false;

            }
            else st.push(c);
        }
        return st.isEmpty();
    }
}