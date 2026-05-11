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
    int maxi = 0;
    // int result = Integer.MIN_VALUE;

    public int diameterOfBinaryTree(TreeNode root) {
        int result[] = new int[1];

        diameterRec(root, result);
        return result[0] - 1;
    }

    private int diameterRec(TreeNode root, int[] result) {
        if (root == null)
            return 0;

        int lh = diameterRec(root.left, result);
        int rh = diameterRec(root.right, result);

        int temp = Math.max(lh, rh) + 1;
        int ans = Math.max(temp, 1 + lh + rh);

        result[0] = Math.max(result[0], ans);
        return temp;
    }
}