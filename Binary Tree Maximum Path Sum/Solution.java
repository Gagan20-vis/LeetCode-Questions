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
    private int solve(TreeNode root,int[] max)
    {
        if(root == null) return 0;

        int leftsum = Math.max(0,solve(root.left,max));
        int rightsum = Math.max(0,solve(root.right,max));
        max[0] = Math.max(max[0],root.val+leftsum+rightsum);

        return root.val + Math.max(leftsum,rightsum);
    }
    public int maxPathSum(TreeNode root) {
        int[] max = new int[1];
        max[0] = Integer.MIN_VALUE;
        solve(root,max);
        return max[0];
    }
}