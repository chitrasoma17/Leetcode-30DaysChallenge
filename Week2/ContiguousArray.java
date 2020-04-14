/* Signed by : Chitrasoma Singh
*/

class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int currSum=0, maxLen=0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            
            currSum += (nums[i]==0?-1:1);
            if(currSum == 0){
                maxLen = i+1;
            }
            else if(map.containsKey(currSum)){
                maxLen = Math.max(maxLen, i-map.get(currSum));
            }
            else
                map.put(currSum, i);
        }
        
        return maxLen;
    }
}