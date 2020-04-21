/* Signed by : Chitrasoma Singh
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int x, int y) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    
    public int firstOccurence(BinaryMatrix binaryMatrix, int low, int high, int rowNum){
        if(low>high)
            return -1;
        int mid = low + (high-low)/2;
        if((mid==0 || binaryMatrix.get(rowNum,mid-1) == 0)&&(binaryMatrix.get(rowNum,mid)==1)){
            return mid;
        }
        if(binaryMatrix.get(rowNum,mid)==0)
            return firstOccurence(binaryMatrix, mid+1, high, rowNum);
        return firstOccurence(binaryMatrix, low, mid-1, rowNum);
    }
    
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        
        List<Integer> list = binaryMatrix.dimensions();
        int n = list.get(0);
        int m = list.get(1);
        int x=-1, ans=-1;
        x = firstOccurence(binaryMatrix, 0, m-1, 0);
        //System.out.println(n+" "+m+" "+x);
        ans = x;
        if(x==-1){
            x=m-1;
        }
        for(int i=1;i<n;i++){
            if(binaryMatrix.get(i,x)==0)
                continue;
            while(x>=0 && binaryMatrix.get(i,x)==1){
                x--;
            }
            x++;
            ans = x;
        }

        return ans;
    }
}