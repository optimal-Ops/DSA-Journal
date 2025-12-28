class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedListStack{
    Node top;
    void push(int value){
        Node newNode=new Node(value);
        newNode.next=top;
        top=newNode;
    }
    int pop(){
        if(top==null){
            System.out.println("Stack underflow");
            return -1;
        }
        int value=top.data;
        top=top.next;
        return value;
    }
    int peek() {
        if (top == null) {
            return -1;
        }
        return top.data;
    }

    boolean isEmpty() {
        return top == null;
    }

}
public class LinkedListImplimentation {
    public static void main(String[] args){
        LinkedListStack st=new LinkedListStack();
        st.push(23);
        st.push(24);
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
    }
}
