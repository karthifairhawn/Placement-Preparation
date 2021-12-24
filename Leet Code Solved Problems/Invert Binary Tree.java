// 226. Invert Binary Tree

// Input: root = [4,2,7,1,3,6,9]
// Output: [4,7,2,9,6,3,1]

// Input: root = [2,1,3]
// Output: [2,3,1]

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
    public TreeNode invertTree(TreeNode root) {
        TreeNode ptr = root;
        trans(ptr);
        return root;
    }     
    
    public void trans(TreeNode ptr){
        if(ptr==null){
            // TreeNode temp=ptr.left;
            // ptr.left = ptr.right;
            // ptr.right = temp;    
        }else{
            trans(ptr.left);
            trans(ptr.right);
            TreeNode temp=ptr.left;
            ptr.left = ptr.right;
            ptr.right = temp;    
        }
        
    }
    
    
}