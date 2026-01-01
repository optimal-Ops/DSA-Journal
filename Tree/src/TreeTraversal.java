import java.util.*;
import java.util.concurrent.*;
class BinaryTrees {

    static class Node1 {
        int data;
        Node1 left, right;

        Node1(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node1 root;

    // Constructor
    BinaryTrees() {
        root = null;
    }

    void inorder(Node1 node) {
        if (node == null) return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    void preorder(Node1 node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    void postorder(Node1 node) {
        if (node == null) return;

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }
    List<List<Integer>> levelOrder(Node1 node){
        List<List<Integer>> ans=new ArrayList<>();
        Queue<Node1> q=new LinkedList<>();
        q.offer(node);
        while(!q.isEmpty()){
            int level=q.size();
            List<Integer> ls=new ArrayList<>();
            for(int i=0;i<level;i++){
               Node1 curr = q.poll();
               ls.add(curr.data);
               if(curr.left!=null){
                   q.offer(curr.left);

               }
               if(curr.right!=null){
                   q.offer(curr.right);
               }

            }
           ans.add(ls);
        }
        return ans;
    }

}

public class TreeTraversal {
    public static void main(String[] args) {

        BinaryTrees tree = new BinaryTrees();

        //Node is made static because it does not depend on BinaryTree instance. Static inner classes avoid unnecessary
        // outer object reference and simplify object creation
        tree.root = new BinaryTrees.Node1(1);
        tree.root.left = new BinaryTrees.Node1(2);
        tree.root.right = new BinaryTrees.Node1(3);
        tree.root.left.left = new BinaryTrees.Node1(4);
        tree.root.left.right = new BinaryTrees.Node1(5);

        System.out.print("Inorder: ");
        tree.inorder(tree.root);

        System.out.print("\nPreorder: ");
        tree.preorder(tree.root);

        System.out.print("\nPostorder: ");
        tree.postorder(tree.root);
        List<List<Integer>> ans=new ArrayList<>();
        ans=tree.levelOrder(tree.root);
        System.out.println();
        for(List<Integer> level:ans){
            for(int val:level){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
//for static
//BinaryTree.Node node = new BinaryTree.Node(1);

//for non static
//BinaryTree tree = new BinaryTree();
//BinaryTree.Node node = tree.new Node(1);