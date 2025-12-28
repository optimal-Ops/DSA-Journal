 class ArrayStack {
    int[] stack;
    int top;
    int size;

    ArrayStack(int size){
        this.size=size;
        stack=new int[size];
        top=-1;
    }
    void push(int value){
        if(top==size-1){
            System.out.println("Stack overflow");
            return;
        }
        stack[++top]=value;

    }
    int pop(){
        if(top==-1){
            System.out.println("Stack underFlow");
            return -1;
        }
        return stack[top--];
    }
    int peek(){
        if(top==-1){
            System.out.println("Stack underFlow");
            return -1;
        }
        return stack[top];
    }
    boolean isEmpty(){
        return top==-1;
    }
 }
public class ArrayImplementation {
    public static void main(String[] args){
        ArrayStack st=new ArrayStack(10);
        st.push(12);
        st.push(12);
        st.push(12);
        System.out.println(st.pop());
        st.pop();
        st.push(12);
        st.push(12);
        st.push(12);
        st.push(12);
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());

    }
}
