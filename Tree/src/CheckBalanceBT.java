public class CheckBalanceBT {
    public static boolean balanceBT(TreeNode node){
        return height(node) !=-1;
    }
    public static int height(TreeNode node){
        if(node==null)
            return 0;

        int lh=height(node.left);
        if(lh==-1) return -1;
        int rh=height(node.right);
        if(rh==-1) return -1;
        if(lh-rh >1)
            return -1;
        return 1+Math.max(lh,rh);
    }
}
