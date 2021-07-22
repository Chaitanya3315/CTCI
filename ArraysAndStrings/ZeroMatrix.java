package ArraysAndStrings;
import java.util.*;
public class ZeroMatrix {
    void zeroMatrixMethod(int[][] mat){
        boolean rowHasZero=false;
        boolean colHasZero=false;

        //first column has zeros or not
        for(int i=0;i<mat.length;i++){
            if(mat[i][0]==0){
                colHasZero=true;
                break;
            }
        }
        //first row has zeros or not
        for(int i=0;i<mat[0].length;i++){
            if(mat[0][i]==0){
                rowHasZero=true;
                break;
            }
        }
        for(int i=1;i<mat.length;i++){
            for(int j=1;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    mat[i][0]=0;
                    mat[0][j]=0;
                }
            }
        }
        for(int i=1;i<mat.length;i++){
            if(mat[i][0]==0){
                nulifyRow(mat,i);
            }
        }
        for(int i=1;i<mat[0].length;i++){
            if(mat[0][i]==0){
                nulifyCol(mat,i);
            }
        }
        if(rowHasZero){
           nulifyRow(mat,0);
        }
        if(colHasZero){
            nulifyCol(mat,0);
        }

    }
    void nulifyRow(int[][] mat, int n){
        for(int i=0;i<mat[0].length;i++){
            mat[n][i]=0;
        }
    }
    void nulifyCol(int[][] mat, int n){
        for(int i=0;i<mat.length;i++){
            mat[i][n]=0;
        }
    }
    void display(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+ "");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int[][] mat = new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        ZeroMatrix obj = new ZeroMatrix();
        obj.zeroMatrixMethod(mat);
        obj.display(mat);
        sc.close();
    }
}