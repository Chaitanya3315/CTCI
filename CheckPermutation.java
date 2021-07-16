import java.util.*;
public class CheckPermutation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        boolean ans=true;
        int[] counter = new int[256];
        for(int i=0;i<s1.length();i++){
            counter[s1.charAt(i)]++;
        }
        for(int i=0;i<s2.length();i++){
            counter[s2.charAt(i)]--;
            if(counter[s2.charAt(i)]<0){
                ans=false;
                break;
            }
        }
       System.out.println(ans);
       sc.close();
    }
}
