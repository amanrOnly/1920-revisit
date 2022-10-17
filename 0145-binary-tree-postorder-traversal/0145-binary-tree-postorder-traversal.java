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
//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> ans=new ArrayList<Integer>();

  
//         if(root==null) return ans;
        

//         postorderTraversal(root.left);
//         postorderTraversal(root.right);
//         ans.add(root.val);
//         return ans;
        
    
//     }
public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> pre = new LinkedList<Integer>();
		if(root==null) return pre;
		
		pre.addAll(postorderTraversal(root.left));
		pre.addAll(postorderTraversal(root.right));
		pre.add(root.val);
    return pre;
	}    
}