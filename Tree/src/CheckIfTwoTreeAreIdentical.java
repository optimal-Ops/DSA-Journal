public class CheckIfTwoTreeAreIdentical {
    public static boolean identical(TreeNode p, TreeNode q){
        if(p==null && q==null)
            return true;
        if(p==null || q==null)
            return false;
        boolean left=identical(p.left,q.left);
        boolean right=identical(p.right,q.right);

        return left&&right;
    }
}
