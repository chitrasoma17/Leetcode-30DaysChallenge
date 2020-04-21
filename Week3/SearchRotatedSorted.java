/* Signed by : Chitrasoma Singh
*/

class Solution {
    
    public int search(int[] nums, int low, int high, int x){
        
        if(low>high)
            return -1;
        int mid = low+(high-low)/2;
        if(nums[mid]==x)
            return mid;
        if(nums[low]<=nums[mid]){
            if(x>=nums[low] && x<nums[mid])
                return search(nums, low, mid-1, x);
            return search(nums, mid+1, high, x);
        }
        else{
            if(x>nums[mid] && x<=nums[high])
                return search(nums, mid+1, high, x);
            return search(nums, low, mid-1, x);
        }
    }
    
    public int search(int[] nums, int target) {
        
        int n = nums.length;
        return search(nums, 0, n-1, target);
        
    }
}