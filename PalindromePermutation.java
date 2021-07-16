import java.util.*;
public class PalindromePermutation {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        HashMap<Character,Integer> m1 = new HashMap<Character,Integer>();
        String s1 = sc.nextLine();
        int count=0;
        for(char c : s1.toCharArray()){
            if(c==' '){
                continue;
            }
            if(m1.containsKey(c)){
                count--;
            }else{
                count++;
                m1.put(c,1);
            }
        }
        if(count<0 || count >=2){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
     sc.close();  
    }
}  

