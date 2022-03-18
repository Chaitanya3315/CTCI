package LinkedList;

public class ReturnKthToLast {
    class Index{
        public int idx=0;
    }

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
    public Node returnKth(Node head,int k,Index value){
        if(head==null){
            return null;
        }
        Node n=returnKth(head.next,k,value);
        value.idx=value.idx+1;
        if(value.idx==k){
            return head;
        }
        return n;
    }
    public static void main(String[] args){
        ReturnKthToLast obj = new ReturnKthToLast();
        obj.head = new Node(1);
        obj.push(3);
        obj.push(3);
        obj.push(8);
        obj.push(6);
        obj.push(8);
        obj.push(9);
        obj.printList();
        Index i= obj.new Index();
        Node ans=obj.returnKth(obj.head,4,i);
        System.out.println(ans.data);        
    }   
}
