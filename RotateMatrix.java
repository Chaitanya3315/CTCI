import java.util.*;
public class RotateMatrix {
    // roataing the array layer by layer 
    public void rotate(int[][] matrix,int n){
        for(int layer =0;layer<n/2;layer++){
            int first =layer;
            int last = n-1-layer;
            for(int i= first;i<last;i++){
                int offset = i-first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last - offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
    }

    public void rotate2(int[][] a,int n){
        // In this method we transpose the array and reverse the array then to obtain a 90 degree rotated array of the original array.
            for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int li=0;
            int ri=n-1;
            while(li<ri){
                int temp =a[i][li];
                a[i][li]=a[i][ri];
                a[i][ri]=temp;
                li++;
                ri--;
            }
        }
    }
    public void display(int[][] b ,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(b[i][j]+"");
            
            }
            System.out.println();
       }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[][] arr=new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                arr[i][j]=sc.nextInt();
            }
       }
       RotateMatrix obj = new RotateMatrix();
       obj.display(arr,size);
       System.out.println();
       obj.rotate(arr, size);
       obj.display(arr,size);
       System.out.println();
       obj.rotate2(arr, size);
       obj.display(arr,size);
       
      
    }
}
