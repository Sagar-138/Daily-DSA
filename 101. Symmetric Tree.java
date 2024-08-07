/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return helper(root.left, root.right);
    }

   private boolean helper(TreeNode l , TreeNode r){
    if(l == null && r== null){
         return true;
    }else if(l==null || r == null ){ 
            return false;
    }

    if(l.val !=r.val) return false;

    if(!helper(l.left, r.right)){
        return false;
    }
    if(!helper(l.right, r.left)){
        return false;
    }

    return true;
   }

}
