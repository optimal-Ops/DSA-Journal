import java.util.ArrayList;

class ArrayListStack{
    ArrayList<Integer> list=new ArrayList<>();
    void push(int value){
        list.add(value);
    }
    int pop(){
        if(list.isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        int val=list.get(list.size()-1);
        list.remove(list.size()-1);
        return val;

    }
    int peek(){
        if(list.isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        return list.get(list.size()-1);

    }
    boolean isEmpty(){
        return list.isEmpty();

    }
    int size(){
        return list.size();
    }
}




public class ArrayListImplementation {
    public static void main(String[] args){
        ArrayListStack st=new ArrayListStack();
        st.push(23);
        st.push(24);
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
    }
}
