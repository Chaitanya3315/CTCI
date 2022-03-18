package LinkedList;

public class Partition {
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
    public Node partition(Node node,int x){
        Node newhead=node;
        Node tail=node;

        while(node!=null){
            Node next=node.next;
            if(node.data<x){
                node.next=newhead;
                newhead=node;
            }else{
                tail.next=node;
                tail=node;
            }
            node=next;
        }

        tail.next=null;

        return newhead;
    }
   
    public static void main(String[] args){
        Partition obj = new Partition();
        obj.head = new Node(3); 
        obj.push(5);
        obj.push(8);
        obj.push(5);
        obj.push(10);
        obj.push(2);
        obj.push(1);
        obj.printList();
        obj.head=obj.partition(obj.head,5);
        System.out.println("After");
        obj.printList();


    }
}
