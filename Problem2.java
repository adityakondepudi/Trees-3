//Time Complexity : O(n)
//Space Complexity:O(1)

class Solution {
    boolean flag;
    public boolean isSymmetric(TreeNode root) {
        this.flag = true;
        dfs(root.left , root.right);
        return this.flag;
    }
    private void dfs(TreeNode left, TreeNode right){
        if(left == null && right ==null)return;
        if(left == null || right == null || left.val != right.val){
            flag = false;
            return;
        }
        dfs(left.left,right.right);
        dfs(left.right,right.left);
    }
}
