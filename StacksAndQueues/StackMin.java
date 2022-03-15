package StacksAndQueues;
import java.util.*;

public class StackMin {
    Stack<Integer> st;
    Stack<Integer> min;
    StackMin(){
        st=new Stack<Integer>();
        min=new Stack<Integer>();
    }
    public void push(int val){
        st.push(val);
        if(min.size()==0){
            min.push(val);
            return;
        }
        if(val<=min.peek()){
            min.push(val);
        }
    }
    
    public int pop(){
        int ele= st.pop();
        if(ele==min.peek()){
            min.pop();
        }
        return ele;
    }
    public boolean isEmpty(){
        return st.size()==0;
    }

    public int getMin(){
        return min.peek();
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StackMin stack=new StackMin();
        stack.push(3);
        stack.push(5);
        stack.getMin();
        stack.push(0);
        System.out.println(stack.getMin());
        stack.pop();
        stack.push(2);
        stack.push(4);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.getMin());
    }
}
