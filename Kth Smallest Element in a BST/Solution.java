class Solution {
    private static int number = 0;
    private static int count = 0;
    private void solve(TreeNode root)
    {
        if(root.left!=null) solve(root.left);
        count--;
        if(count==0){
            number= root.val;
            return ;
        }
        if(root.right!=null) solve(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        try{
            count = k;
            solve(root);
            return number;
        }
        finally{
            System.gc();
        }
    }
}