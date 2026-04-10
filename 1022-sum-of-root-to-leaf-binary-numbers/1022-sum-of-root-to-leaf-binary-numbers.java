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

    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, new ArrayList<>(), 0);
    }

    private int dfs(TreeNode node, ArrayList<Integer> list, int sum) {
        if (node == null) return sum;

        ArrayList<Integer> newList = new ArrayList<>(list);
        newList.add(node.val);

        if (node.left == null && node.right == null) {
            sum += binaryToDecimal(newList);
            return sum;
        }

        sum = dfs(node.left, newList, sum);
        sum = dfs(node.right, newList, sum);

        return sum;
    }

    private int binaryToDecimal(ArrayList<Integer> list) {
        int num = 0;
        for (int bit : list) {
            num = num * 2 + bit;
        }
        return num;
    }
}