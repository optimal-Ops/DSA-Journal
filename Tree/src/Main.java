import java.util.*;

public class Main {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(10);
        root.left.left.right=new TreeNode(41);
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);

        root2.left.right = new TreeNode(5);
        root2.left.left.left = new TreeNode(10);
        //root2.left.left.right=new TreeNode(41);
        System.out.println("Height: " + HeightOfBT.height(root));
        System.out.println("is it a balance BT:" + CheckBalanceBT.balanceBT(root));
        System.out.println("Diameter of bt is :" + DiameterOfBT.Diameter(root));
        System.out.println("MaxPath sum:" + MaximumPathSumOfBT.maxPathSum(root));
        System.out.println("Is 2 tree same:" + CheckIfTwoTreeAreIdentical.identical(root, root2));
        List<List<Integer>> ans = new ArrayList<>();
        ans=ZigZagTraversal.zigzagTraversal(root);
        System.out.println("ZigZagTraversal::");
        for(List<Integer> ls:ans){
            for(int i:ls){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

}

