class Solution {
    private int ans;
    public int countUnivalSubtrees(TreeNode root) {
        dfs(root);      // by using Depth first serach alogorithm
        return ans;
    }
    private boolean dfs(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean l = dfs(root.left);
        boolean r = dfs(root.right);         
        if (!l || !r) {
            return false;
        }
        int a = root.left == null ? root.val : root.left.val;           // by using recursive call
        int b = root.right == null ? root.val : root.right.val;
        if (a == b && b == root.val) {
            ++ans;
            return true;      // if condition satisfies then return true
        }
        return false;         // otherwise return false
    }
}

