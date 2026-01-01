import java.util.*;
class BinaryTree {
      Node root;

     static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }
        public void insert(Scanner sc) {
            System.out.println("enter root node:");
            int value = sc.nextInt();
             root = new Node(value);
            insert(sc, root);
        }

        public void insert(Scanner sc, Node node) {
            System.out.println("Do you want to enter left of " + node.data + "?(True/false)");
            boolean left = sc.nextBoolean();
            if (left) {
                System.out.println("enter the value of left of:" + node.data + ":");

                int value = sc.nextInt();
                node.left = new Node(value);
                insert(sc, node.left);
            }
            System.out.print("Do you want to enter right of " + node.data + " (true/false): ");
            boolean right = sc.nextBoolean();
            if (right) {
                System.out.print("Enter right value of " + node.data + ": ");
                int value = sc.nextInt();
                node.right = new Node(value);
                insert(sc, node.right);
            }
        }

        public void display() {
            display(root,"");
        }

         void display(Node node, String indent) {
            if (node == null)
                return;
            System.out.println(indent + node.data);
            display(node.left, indent + "\t");
            display(node.right, indent + "\t");
        }


}
public class RepresentationOfTree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BinaryTree tr=new BinaryTree();
        tr.insert(sc);
        tr.display();


    }
}
