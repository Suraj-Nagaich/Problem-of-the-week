class Solution {
    int gb=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        path(root);
        return gb;
    }
    public int path(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=Math.max(0,path(root.left));
        int r=Math.max(0,path(root.right));
        gb=Math.max(gb,root.val+l+r);
        return root.val+Math.max(l,r);
    }
}
