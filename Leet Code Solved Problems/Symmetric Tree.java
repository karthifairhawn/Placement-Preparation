// 101. Symmetric Tree

// Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

// Input: root = [1,2,2,3,4,4,3]
// Output: true

// Input: root = [1,2,2,null,3,null,3]
// Output: false


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
    public boolean isSymmetric(TreeNode root) {
        return check(root.left,root.right);
    }
    
    public boolean check(TreeNode left,TreeNode right){
        if(left!=null && right!=null){
            if(left.val==right.val){
                
                if(check(left.left,right.right)){                
                    
                }else{
                    return false;
                }
                
                if(check(left.right,right.left)){
                    
                }else{
                    return false;
                }
            }else{
                return false;
            }    
        }else if(left==null && right!=null){
            return false;
        }else if(left!=null && right==null){
            return false;
        }                
        return true;
    }
}