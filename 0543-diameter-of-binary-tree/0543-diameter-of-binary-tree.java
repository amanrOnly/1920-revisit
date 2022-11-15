/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        // if(root ==null) return 0;
        // int ans= logic(root);
        // return ans-1;
        
        if(root==null) return 0;
        int[] maxi= new int[1];
        logic(root, maxi);
        return maxi[0];
        
    }
    
    public int logic(TreeNode root, int[] maxi){
        if(root==null) return 0;
        int left = logic(root.left, maxi);
        int right = logic(root.right, maxi);
        maxi[0] = Math.max(maxi[0], left+ right);
        return 1+ Math.max(left,right);
    }
    
//     public int logic(TreeNode root){
//         if(root ==null) return 0;
//         int ld=diameterOfBinaryTree(root.left);
//         int rd=diameterOfBinaryTree(root.right);
//         int h= height(root.left) + height(root.right) + 1;
//         return Math.max(h, Math.max(ld,rd));
//     }
    
//     public int height(TreeNode root){
//         if(root==null) return 0;
//         return Math.max(height(root.right), height(root.left))+1;
   
//     }
}