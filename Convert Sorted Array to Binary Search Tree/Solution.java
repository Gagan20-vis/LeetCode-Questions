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
    private TreeNode solve(int[] nums,int low,int high)
    {
        if(low<=high){
            int mid = (low+high)/2;
            TreeNode ans = new TreeNode(nums[mid]);
            ans.left = solve(nums,low,mid-1);
            ans.right = solve(nums,mid+1,high);
            return ans;
        }
        return null;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        try{
            return solve(nums,0,nums.length-1);
        }
        finally{
            System.gc();
        }
    }
}