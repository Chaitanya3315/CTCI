package TreesAndGraphs;

public class CheckBalanced {
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
    public int isBalanced(Node root){
        if(root==null){
            return -1;
        }
         int left=isBalanced(root.left);
         if(left==Integer.MAX_VALUE)
           return Integer.MAX_VALUE;
         int right= isBalanced(root.right);
         if(right==Integer.MAX_VALUE)
             return Integer.MAX_VALUE;
        

        int diff=left-right;
        if(Math.abs(diff)>1){
            return Integer.MAX_VALUE;
        }else{
            return Math.max(left,right)+1;
        }
        
    }
    public boolean chek(Node root){
        return isBalanced(root)!=Integer.MAX_VALUE;
    }
}
