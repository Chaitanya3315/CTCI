package ArraysAndStrings;
import java.util.*;
public class StringRotation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2= sc.next();
        String s3 = s2+s2;
        boolean ans = false;
        
        if(s3.contains(s1)){

            ans=true;
        }
        System.out.println(ans);
        sc.close();
    }
    
}