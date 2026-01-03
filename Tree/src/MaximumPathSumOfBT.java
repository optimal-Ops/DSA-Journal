public class MaximumPathSumOfBT {
    static int maxi;
    public static int maxPathSum(TreeNode node){
        maxi=Integer.MIN_VALUE;
        pathSum(node);
        return maxi;
    }
    public static int pathSum(TreeNode node){
        if(node==null)
            return 0;
        int left=Math.max(0,pathSum(node.left));
        int right=Math.max(0,pathSum(node.right));
        maxi=Math.max(maxi,left+right+node.data);
        return node.data+Math.max(left,right);
    }
}
