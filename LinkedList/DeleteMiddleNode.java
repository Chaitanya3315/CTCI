package LinkedList;


public class DeleteMiddleNode {
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
    public static void main(String[] args){
        DeleteMiddleNode obj = new DeleteMiddleNode();
        obj.head = new Node(1); 
        Node second=new Node(7);
        obj.head.next=second;
        Node third=new Node(11);
        second.next=third;
        obj.push(3);
        obj.push(3);
        obj.push(2);
        obj.push(2);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.printList();
        obj.delete(second);
        System.out.println("After removing");
        obj.printList();


    }
}
