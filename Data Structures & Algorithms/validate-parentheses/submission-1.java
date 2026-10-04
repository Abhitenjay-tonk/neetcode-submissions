class Solution {
    public boolean isValid(String s) {
        char[] st=new char[s.length()];
        int t=-1;
        for(char c:s.toCharArray()){
            if(c=='(')st[++t]=')';
            else if(c=='{')st[++t]='}';
            else if(c=='[')st[++t]=']';
            else if(t==-1 || st[t--]!=c) return false;
        }
        return t==-1;
    }
}