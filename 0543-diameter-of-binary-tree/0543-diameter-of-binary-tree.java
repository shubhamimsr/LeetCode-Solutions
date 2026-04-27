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
    int result = 0;

    public int diameterOfBinaryTree(TreeNode root) {

        findDiameter(root);
        return result;
    }

    private int findDiameter(TreeNode root) {
        if (root == null)
            return 0;

        int l = findDiameter(root.left);
        int r = findDiameter(root.right);

        int temp = Math.max(l, r) + 1;
        int ans = l + r;
        result = Math.max(result, ans);

        return temp;
    }
}