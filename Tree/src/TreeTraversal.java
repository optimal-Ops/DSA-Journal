import java.util.*;
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
    List<Integer> iterativePreOrder(Node1 node){
        List<Integer> ans=new ArrayList<>();
        Stack<Node1> st=new Stack<>();
        st.push(node);
        while(!st.isEmpty()){
            node=st.pop();
            ans.add(node.data);
            if(node.right!=null){
                st.push(node.right);
            }
            if(node.left!=null){
                st.push(node.left);
            }
        }


        return ans;
    }
    List<Integer> iterativeinOrder(Node1 node){
        List<Integer> ans=new ArrayList<>();
        Stack<Node1> st=new Stack<>();
        while(true){
            if(node!=null){
                st.push(node);
                node=node.left;

            }else{
                if(st.isEmpty()){
                    break;
                }
                node=st.pop();
                ans.add(node.data);
                node=node.right;
            }
        }
        return ans;
    }

    List<Integer> iterativePostOrder(Node1 node){
        List<Integer> ans=new ArrayList<>();
        Stack<Node1> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        st1.push(node);
        while(!st1.isEmpty()){
            node=st1.pop();
            st2.add(node.data);

            if(node.left!=null){
                st1.push(node.left);

            }
            if(node.right!=null){
                st1.push(node.right);
            }

        }
        while(!st2.isEmpty()){
            ans.add(st2.pop());
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
        System.out.println("\nIterative Inorder: " );
        List<Integer> Inorder=new ArrayList<>();
        Inorder=tree.iterativeinOrder(tree.root);
        for(int i:Inorder){
            System.out.print(i+" ");
        }

        System.out.print("\nPreorder: ");
        tree.preorder(tree.root);
        List<Integer> preorder=new ArrayList<>();

        System.out.println("\nIterative Preorder: " );
        preorder=tree.iterativePreOrder(tree.root);
        for(int i=0;i<preorder.size();i++){
            System.out.print(preorder.get(i)+" ");
        }

        System.out.print("\nPostorder: ");
        tree.postorder(tree.root);
        System.out.println("\nIterative Inrder: " );
        List<Integer> postOrder=new ArrayList<>();
        postOrder=tree.iterativePostOrder(tree.root);
        for(int i=0;i<postOrder.size();i++){
            System.out.print(postOrder.get(i)+" ");
        }


        System.out.println("\nLevelOrder Traversal: ");
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