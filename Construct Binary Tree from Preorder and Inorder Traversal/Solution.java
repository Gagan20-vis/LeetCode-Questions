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
    private TreeNode solve(int[] preorder,int prestart,int preEnd,int[] inorder,int instart,int inEnd,Map<Integer,Integer> inmap)
    {
        if(prestart > preEnd || instart > inEnd) return null;

        TreeNode root = new TreeNode(preorder[prestart]);

        int inroot = inmap.get(preorder[prestart]);
        int numsleft = inroot-instart;

        root.left = solve(preorder,prestart+1,prestart+numsleft,inorder,instart,inroot-1,inmap);
        root.right = solve(preorder,prestart+numsleft+1,preEnd,inorder,inroot+1,inEnd,inmap);

        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<inorder.length;i++) map.put(inorder[i],i);
        TreeNode root = solve(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);

        return root;
    }
}