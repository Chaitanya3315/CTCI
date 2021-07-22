package ArraysAndStrings;
import java.util.*;
public class IsUnique {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String s=sc.next();
      boolean[] arr = new boolean[128];
      boolean ans=true;
      for(int i=0;i<s.length();i++){
         if(arr[s.charAt(i)]==true){
            ans=false;
            break;

         }else{
            arr[s.charAt(i)]=true;
         }
      }
      System.out.println(ans);
      sc.close();
            //Without using any data structures if we can use data structures hashmap can be used.
   
   } 
}