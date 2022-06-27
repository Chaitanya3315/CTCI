package TreesAndGraphs;
import java.util.*;


public class ListOfDepths {
    class Node{
        int val;
        Node left;
        Node right;
        Node(int data){
            this.val=data;
            left=null;
            right=null;
        }
    }
    public static ArrayList<LinkedList<Node>> levels(Node root){
        ArrayList<LinkedList<Node>> res=new ArrayList<>();
        LinkedList<Node> curr=new LinkedList<>();
        if(root!=null){
            curr.add(root);
        }
        while(curr.size()>0){
            res.add(curr);
            LinkedList<Node> parents=curr;
            curr=new LinkedList<Node>();
            for(Node p:parents){
                if(p.left!=null){
                    curr.add(p.left);
                }
                if(p.right!=null){
                    curr.add(p.right);
                }
            }
            return res;
        }



        return res;

    }
 
}
