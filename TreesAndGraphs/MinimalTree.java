package TreesAndGraphs;

public class MinimalTree {
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

    public static Node constructTree(int[] arr){
        return construct(arr,0,arr.length-1);
    }
    public static Node construct(int[] arr,int lo,int hi){
        if(lo>hi){
            return null;
        }
        int mid=(lo+hi)/2;
        MinimalTree x=new MinimalTree();
        Node root=x.new Node(arr[mid]);
        root.left=construct(arr, lo, mid-1);
        root.right=construct(arr, mid+1, hi);

        return root;
    }
    public static void inOrder(Node root){
        if(root==null)
        return;

        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,9,11,34,5,6};
        Node root=constructTree(arr);
        inOrder(root);
    }
    
}
