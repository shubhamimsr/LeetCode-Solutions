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
    int result;

    public int averageOfSubtree(TreeNode root) {
        solve(root);
        return result;
    }

    private int[] solve(TreeNode currNode) {
        if (currNode == null)
            return new int[] { 0, 0 };

        int leftPair[] = solve(currNode.left);
        int rightPair[] = solve(currNode.right);

        int currSum = leftPair[0] + rightPair[0] + currNode.val;
        int currCount = leftPair[1] + rightPair[1] + 1;
        int avg = currSum / currCount;

        if (avg == currNode.val) {
            result++;
        }
        return new int[] { currSum, currCount };
    }
}