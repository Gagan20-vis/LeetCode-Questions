/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        try{if(root==null) return "";
            Queue<TreeNode> q = new LinkedList<>();
            StringBuilder ans = new StringBuilder();
            q.add(root);
            while(!q.isEmpty())
            {
                TreeNode temp = q.poll();
                if(temp==null){
                    ans.append("n ");
                    continue;
                }
                ans.append(temp.val+" ");
                q.add(temp.left);
                q.add(temp.right);
            }
            return ans.toString();}finally{System.gc();}
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        try{if(data=="") return null;
            String[] str = data.split(" ");
            Queue<TreeNode> q = new LinkedList<>();
            TreeNode ans = new TreeNode(Integer.parseInt(str[0]));
            q.add(ans);
            for(int i = 1;i<str.length;i++){
                TreeNode parent = q.poll();
                if(!str[i].equals("n")){
                    TreeNode left = new TreeNode(Integer.parseInt(str[i]));
                    parent.left = left;
                    q.add(left);
                }
                if(!str[++i].equals("n")){
                    TreeNode right = new TreeNode(Integer.parseInt(str[i]));
                    parent.right = right;
                    q.add(right);
                }
            }
            return ans;}finally{System.gc();}
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));