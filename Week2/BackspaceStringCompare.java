class Solution {
    public boolean backspaceCompare(String S, String T) {
        
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 =  new Stack<>();
        
        int n1 = S.length();
        int n2 = T.length();
        int i=0;
        for(i=0;i<n1;i++){
            if(S.charAt(i)=='#' && s1.empty())
                continue;
            else if(S.charAt(i)=='#')
                s1.pop();
            else
                s1.push(S.charAt(i));
        }
        
        for(i=0;i<n2;i++){
            if(T.charAt(i)=='#' && s2.empty())
                continue;
            else if(T.charAt(i)=='#')
                s2.pop();
            else
                s2.push(T.charAt(i));
        }
        
        while(!s1.empty() && !s2.empty()){
            if(s1.pop() == s2.pop())
                continue;
            else
                return false;
        }
        if(s1.empty() && s2.empty())
            return true;
        return false;
    }
}