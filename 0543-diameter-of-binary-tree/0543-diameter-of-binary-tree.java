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
    int dia = 0;
    public int hight(TreeNode root){
        if(root == null){
            return 0;
        }
        int lhight = hight(root.left);
        int rhight = hight(root.right);
        int d = lhight + rhight + 1;
        dia = Math.max(dia,d);
        return Math.max(lhight, rhight)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        hight(root);
        return dia - 1;
    }
}