/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/* Signed by : Chitrasoma Singh
*/

class Solution {
    class Height{
        int ht;
        Height(){
            ht=0;
        }
    }
    
    public int diameterOfBinaryTree(TreeNode root, Height h){
        
        if(root ==  null){
            h.ht = 0;
            return 0;
        }
        
        Height lh = new Height();
        Height rh = new Height();
        
        int ldiameter = diameterOfBinaryTree(root.left, lh);
        int rdiameter = diameterOfBinaryTree(root.right, rh);
        
        h.ht = Math.max(lh.ht, rh.ht)+1;
        
        return Math.max(lh.ht+rh.ht, Math.max(ldiameter, rdiameter));
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root == null)
            return 0;
        Height h = new Height();
        return diameterOfBinaryTree(root, h);
        
    }
}