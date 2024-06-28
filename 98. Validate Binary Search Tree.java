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
    public boolean isValidBST(TreeNode root) {
        List<Integer> inOrderList= new LinkedList<>();
        helper(root, inOrderList);
        boolean isBST= true;
        int prev = inOrderList.get(0);
        for(int i =1; i<inOrderList.size(); i++){
            if(inOrderList.get(i)<=prev){
                isBST=false;
            }

            prev = inOrderList.get(i);
        }
        return isBST;
    }

    private void helper(TreeNode root, List<Integer> inOrderList){
        if(root == null) return;

        helper(root.left,inOrderList);
        inOrderList.add(root.val);
        helper(root.right,inOrderList);
    }
}
