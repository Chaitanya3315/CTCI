import java.util.*;
public class URLify {
    char[] replace(char[] arr){
        int count=0,i=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]==' '){
                count++;
            }
        }
        while(arr[i-1]==' '){
            count--;
            i--;
        }

        int index = i +(count*2);
   
        for(int j=i-1;j>=0;j--){
            if(arr[j]==' '){
                arr[index-1]='0';
                arr[index-2]='2';
                arr[index-3]='%';
                index -=3;
            }else{
                arr[index-1]=arr[j];
                index--;
            }
        }
        return arr;
    }
    char[] replace2(char[] arr,int length){
       int count=0,i=0,index;
       for(i=0;i<length;i++){
           if(arr[i]==' '){
               count++;
           }
       }
       index = length +(count*2);

       for(int j=length-1;j>=0;j--){
           if(arr[j]==' '){
               arr[index-1]='0';
               arr[index-2]='2';
               arr[index-3]='%';
               index -=3;
           }else{
               arr[index-1]=arr[j];
               index--;
           }
       }
       return arr;
   }
   //these are different fuctions to perform the same fuction, In first one we are not given the truelength and in second one we got the length.
   public static void main(String[] args){
       Scanner sc = new Scanner (System.in);
       
       String s=sc.nextLine();
       int length=sc.nextInt();
       char[] arr= new char[s.length()];
       arr=s.toCharArray();
       URLify obj = new URLify();
       char[] ans =obj.replace2(arr,length);
       for(int i=0;i<ans.length;i++){
           System.out.println(ans[i]);
       }
   }
}
