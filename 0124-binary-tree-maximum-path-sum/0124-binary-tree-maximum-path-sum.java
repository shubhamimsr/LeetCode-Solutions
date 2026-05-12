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
    public int maxPathSum(TreeNode root) {
        int[] result = new int[1];
        result[0] = Integer.MIN_VALUE;
        maxSum(root,result);
        return result[0];

    }

    private int maxSum(TreeNode root, int[] result){
        if(root==null)  return 0;

        int leftSum = Math.max(0,maxSum(root.left, result));
        int rightSum = Math.max(0,maxSum(root.right, result));

        int temp = Math.max(leftSum, rightSum)+root.val;
        int ans = Math.max(temp, leftSum+rightSum+root.val);
        result[0] = Math.max(result[0], ans);
        return temp;
    }
}