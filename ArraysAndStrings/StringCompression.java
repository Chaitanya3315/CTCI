package ArraysAndStrings;
import java.util.*;
public class StringCompression {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder s2 = new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++){
           count++;
           if(i+1>=s.length() || s.charAt(i)!= s.charAt(i+1)){
              s2.append(s.charAt(i));
              s2.append(count);
              count=0;
           }
        }
        if(s2.length()>s.length()){
            System.out.println(s);
        }else{
            System.out.println(s2);
        }
        sc.close();
    } 
}
