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
    int target;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        target = targetSum;
        int sum = 0;
        return helper(root, 0);
    }

    private boolean helper(TreeNode root, int sum) {
        if (root == null)
            return false;
        sum += root.val;
        if (root.left == null && root.right == null) {
            return sum == target;
        }

        boolean lSum = helper(root.left, sum);
        boolean rSum = helper(root.right, sum);

        return lSum || rSum;
    }
}