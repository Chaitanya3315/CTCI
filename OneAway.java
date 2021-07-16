import java.util.*;
public class OneAway {

        
    boolean oneReplace(String s01,String s02){
        boolean change=false;
        for(int i=0;i<s01.length();i++){
            
            if(s01.charAt(i)!=s02.charAt(i)){
                
                if(change){
                    return false;
                }
                change = true;
            }
        }
        return true;
    
    }

    boolean oneEdit(String s01,String s02){
        int p1=0;
        int p2=0;
        boolean change=false;
        while(p1<s01.length() && p2<s02.length()){
            if(s01.charAt(p1)==s02.charAt(p2)){
                p1++;
                p2++;
            }else {
                p1++;
                
                if(change){
                    return false;
                }
                change=true;

            }
        }
        return true;
   
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2= sc.next();
        OneAway obj = new OneAway();
        boolean ans=false;
        if(s1.length()==s2.length()){

            ans=obj.oneReplace(s1,s2);
            System.out.println(ans);
        }else if(s1.length()>s2.length() && s1.length()-s2.length()==1){
            ans=obj.oneEdit(s1,s2);
            System.out.println(ans);
        }else if(s1.length()<s2.length()&&s2.length()-s1.length()==1){
            ans=obj.oneEdit(s2,s1);
            System.out.println(ans);
        }else{
            System.out.println("false");
        }
        sc.close();
    }
    
}
