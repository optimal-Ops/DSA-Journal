public class DiameterOfBT {
    static int  diameter=0;//or take array as pass by reference
    public static int Diameter(TreeNode node){
        height(node);
       return diameter;
    }
    public static int height(TreeNode node){
        if(node==null)
            return  0;
        int lh=height(node.left);
        int rh=height(node.right);
        diameter=Math.max(diameter,lh+rh);
        return 1+Math.max(lh,rh);
    }
}

