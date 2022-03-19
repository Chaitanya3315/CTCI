package LinkedList;
import java.util.*;

public class Palindrome {
    Node head;
  
    static class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d;
            next = null; 
        } 
    } 
    public void printList(){
        Node n= head;
        while(n!=null)
        {
            System.out.println(n.data +" ");
            n=n.next;
        }
    }
    public void push(int newData){
        Node newNode = new Node(newData);
        newNode.next= head;
         head=newNode;
    }
    
    public boolean delete(Node n){
        if(n==null || n.next==null){
            return false;
        }
        n.data=n.next.data;
        n.next=n.next.next;
        return true;
    }
    Node reverseList(Node start){
        
        Node prev = start;
        Node curr = start.next;
        Node temp = null;
        while(curr!=null){
            temp =curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev; 
    }
    public  boolean palindrome(Node head){
        Node fast=head;
        Node slow=head;
        Stack<Integer> st=new Stack<Integer>();
        while(fast!=null && fast.next!=null){
            st.push(slow.data);
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null){
            slow=slow.next;
        }
        while(slow!=null){
            int ele=st.pop().intValue();
            if(slow.data!=ele){
                return false;
            }
            slow=slow.next;
        }
        return true;

    }
    
    public boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;
        Stack<Integer> stack = new Stack<Integer>();
        
        while(fast!= null && fast.next != null){
            stack.push(slow.data);
            fast = fast.next.next;
            slow = slow.next;
        }
		
        if(fast != null)              
            slow = slow.next;     
        
        while(slow != null){
            if(slow.data != stack.pop())
                return false;
            slow = slow.next;
        }
        return true;
    }
    public static void main(String[] args){
        Palindrome obj = new Palindrome();
        obj.head = new Node(1); 
        obj.push(3);
        obj.push(4);
        obj.push(2);
        obj.push(2);
        obj.push(4);
        obj.push(3);
        obj.push(1);
        obj.printList();
        System.out.println(obj.isPalindrome(obj.head));
        System.out.println(obj.palindrome(obj.head));


    }
}
