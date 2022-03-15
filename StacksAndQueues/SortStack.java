package StacksAndQueues;
import java.util.*;

public class SortStack {
    public static void sort(Stack<Integer> s){
        Stack<Integer> tmp=new Stack<Integer>();
        while(!s.isEmpty()){
            int ele=s.pop();
            while(!tmp.isEmpty() && tmp.peek()>ele){
                s.push(tmp.pop());
            }
            tmp.push(ele);
        }
        while(!tmp.isEmpty()){
            s.push(tmp.pop());
        }
    }
    public static void main(String[] args){
        Stack<Integer> st=new Stack<Integer>();
        st.push(1);
        st.push(4);
        st.push(3);
        st.push(9);
        st.push(7);
        sort(st);
        while(!st.isEmpty()){
           System.out.println(st.pop());
        }
    }
}
