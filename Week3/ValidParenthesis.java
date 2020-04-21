/* Signed by : Chitrasoma Singh
*/

class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        int x;
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(')
                st1.push(i);
            else if(s.charAt(i)=='*')
                st2.push(i);
            else{
                if(!st1.empty())
                    st1.pop();
                else if(!st2.empty()){
                    st2.pop();
                }
                else
                    return false;
            }
        }
        
        while(!st1.empty()){
            if(st2.empty())
                return false;
            if(st1.peek()<st2.peek()){
                st1.pop();
                st2.pop();
            }
            else
                return false;
                
        }
        return true;
    }
}