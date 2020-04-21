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
class Solution {
    int n = 0;
    
    static class Index{
         int indx=0;
    }
    
    public TreeNode bstFromPreorder(int[] preorder, Index preIndx, int min, int max){

        if(preIndx.indx>=n){
            return null;
        }
        TreeNode node=null;
        int x = preorder[preIndx.indx];
        if(x>min && x<max){
            node  =  new TreeNode(x);
            
            preIndx.indx = preIndx.indx + 1;
            if(preIndx.indx<n){
                node.left = bstFromPreorder(preorder, preIndx, min, x);
                node.right = bstFromPreorder(preorder, preIndx, x, max);
            }
        }
        
        return node;
    }
    
    public TreeNode bstFromPreorder(int[] preorder) {
        
        n = preorder.length;
        Index preIndx = new Index();
        return bstFromPreorder(preorder, preIndx, Integer.MIN_VALUE, Integer.MAX_VALUE);
        
    }
}