package LinkedList;

public class SumList {
    Node head;
  
    static class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d;
            next = null; 
        } 
        Node(int d,Node next){
            data=d;
            this.next=next;
        }
    } 
    public void printList(Node n){
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

    public static Node addTwoNumbers(Node l1, Node l2) {
        int carry=0;
        Node dummy=new Node(0,null);
        Node head=dummy;
        while(l1!=null ||  l2!=null){
            int x1=(l1!=null) ? l1.data :0;
            int x2=(l2!=null) ? l2.data :0;
            int sum=x1+x2+carry;
            head.next=new Node(sum%10);
            head=head.next;
            carry=sum/10;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        if(carry>0){
            head.next=new Node(carry);
        }
        return dummy.next;
    }
    public static void main(String[] args){
        SumList obj = new SumList();
        obj.head = new Node(1); 
        Node second=new Node(7);
        obj.head.next=second;
        Node third=new Node(9);
        second.next=third;
        obj.push(3);
        obj.push(3);
        System.out.println("List one");
        obj.printList(obj.head);

        SumList ob = new SumList();
        ob.head = new Node(1); 
        ob.push(3);
        ob.push(3);
        ob.push(2);
        System.out.println("Second List");
        obj.printList(ob.head);


        System.out.println("Final list");
        SumList o=new SumList();
        Node l=addTwoNumbers(obj.head,ob.head);
        o.printList(l);


    }
}
