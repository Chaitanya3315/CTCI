package LinkedList;
import java.util.*;
public class RemoveDups {
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
    public void removeDups(Node head){
        Node temp = head;
        Node prev=null;
        HashSet<Integer> m1= new HashSet<Integer>();
        if(head==null){
           System.out.println("list is empty");
        }
        while(temp.next!=null){
            if(m1.contains(temp.data)){
                prev.next=temp.next;
            }else{
                m1.add(temp.data);
                prev=temp;
            }
            temp=temp.next;
        }

    }

    public void removeDups2(Node head){
        Node cur=head;
        while(cur!=null){
            Node run=cur;
            while(run.next!=null){
                if(run.next.data==cur.data){
                    run.next=run.next.next;
                }else{
                    run=run.next;
                }
            }
            cur=cur.next;
        }
        return;
    }
    public static void main(String[] args){
        RemoveDups obj = new RemoveDups();
        obj.head = new Node(4); 
        obj.push(3);
        obj.push(3);
        obj.push(2);
        obj.push(2);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.printList();
        obj.removeDups2(obj.head);
        System.out.println("After removing the duplicates");
        obj.printList();


    }
}
