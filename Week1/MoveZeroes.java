/* Signed by : Chitrasoma Singh
*/

class Solution {
    public void moveZeroes(int[] nums) {
        
        int n = nums.length;
        int a=0, temp;
        
        for(int i=0;i<n;i++){
            if(nums[i]==0)
                continue;
            else{
                temp=nums[i];
                nums[i]=nums[a];
                nums[a]=temp;
                a++;
            }
        }    
        
    }
}