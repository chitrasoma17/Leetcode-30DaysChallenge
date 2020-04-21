/* Signed by : Chitrasoma Singh
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length, temp;
        int[] ans = new int[n];
        ans[0]=1;
        for(int i=1;i<n;i++){
            ans[i] = ans[i-1]*nums[i-1];
        }
        temp = nums[n-1];
        for(int i=n-2;i>=0;i--){
            ans[i] = ans[i]*temp;
            temp = temp*nums[i];
        }
        
        return ans;
    }
}