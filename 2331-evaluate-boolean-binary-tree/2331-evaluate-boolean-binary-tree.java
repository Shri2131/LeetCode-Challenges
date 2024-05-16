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
    public boolean evaluateTree(TreeNode root) {
        if(root.left==null && root.right==null){
            return root.val != 0;
        }
        
        boolean leftRes = evaluateTree(root.left);
        boolean rightRes = evaluateTree(root.right);
        boolean currRes;
        if(root.val==2){
            currRes = leftRes|rightRes;
        }else{
            currRes = leftRes&rightRes;
        }
        
        return currRes;
    }
}