/* Signed by : Chitrasoma Singh
*/

class Solution {
    public boolean isHappy(int n) {
        
        if(n==1)
            return true;
        Set<Integer> set = new HashSet<>();
        int x, res;
        
        while(true){
            res=0;
            while(n>0){
                x = n%10;
                res += x*x;
                n=n/10;
            }
            if(res==1)
                return true;
            if(set.contains(res))
                return false;
            set.add(res);
            n=res;
        }
        
    }
}