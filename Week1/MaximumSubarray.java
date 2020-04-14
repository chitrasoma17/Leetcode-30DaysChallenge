/* Signed by : Chitrasoma Singh
*/

class Solution {
    public int maxSubArray(int[] nums) {
        
        int currSum=0;
        int maxSoFar = Integer.MIN_VALUE;
        int n = nums.length;
        
        for(int i=0;i<n;i++){
            currSum = Math.max(currSum+nums[i], nums[i]);
            maxSoFar = Math.max(maxSoFar, currSum);
        }
        
        return maxSoFar;
    }
}