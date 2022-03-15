package StacksAndQueues;
import java.util.*;

class FullStackExecption extends Exception{

}
class EmptyStackException extends Exception{

}

public class ThreeinOne {
    int[] values;
    int[] size;
    int capacity;
    int noOfStacks=3;
    ThreeinOne(int size){
        capacity=size;
        values=new int[size*noOfStacks];
        this.size=new int[noOfStacks];
    }
    public void push(int num,int value) throws FullStackExecption{
        if(size[num]==capacity){
            throw new FullStackExecption();
        }
        size[num]++;
        int index=num*capacity+ size[num]-1;
        values[index]=value;
        return;
    }
    public int pop(int num)throws EmptyStackException{
        if(size[num]==0){
            throw new EmptyStackException();
        }
        
        int index=num*capacity+ size[num]-1;
        int value=values[index];
        values[index]=0;
        size[num]--;
        return value;
    }

    public int peek(int num)throws EmptyStackException{
        if(size[num]==0){
            throw new EmptyStackException();
        }
        int index=num*capacity+ size[num]-1;
        return size[index];
    }
    public boolean isEmpty(int num){
        return size[num]==0;
    }

    public static void main(String[] args)throws FullStackExecption{
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        ThreeinOne st=new ThreeinOne(size);
        st.push(0,1);
        st.push(0,1);
        st.push(0,1);
        st.push(0,1);
        st.push(0,1);
        st.push(1,1);
        st.push(2,1);
        System.out.println(st.isEmpty(1));
        sc.close();
    }
}
