package LinkedList;

public class Intersection {
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
    public Node getIntersectionNode(Node headA, Node headB) {
        int count1=0;
        int count2=0;
        Node temp1=headA;
        Node temp2=headB;
        while(temp1!=null){
            temp1=temp1.next;
            count1++;
        }
        while(temp2!=null){
            temp2=temp2.next;
            count2++;
        }
        int diff=Math.abs(count1-count2);
        if(count1>count2){
            temp1=headA;
            for(int i=0;i<diff;i++){
                temp1=temp1.next;
            }
            temp2=headB;
        }else{
            temp2=headB;
            for(int i=0;i<diff;i++){
                temp2=temp2.next;
            }
            temp1=headA;
        }
        while(temp1!=null || temp2!=null){
            if(temp1==temp2){
                return temp1;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return null;
        
    }
}
