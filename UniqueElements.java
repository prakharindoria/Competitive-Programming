
/*
Print all elements between given range that contains only unique digit elements.
*/
import java.util.Scanner;
public class UniqueDigits {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int a=kb.nextInt();
        int b=kb.nextInt();

        for (int i = a; i <= b; i++) {
            int temp=i;
            if(containsUnique(temp)==true) System.out.println(temp);
            else continue;
        }
    }

    public static boolean containsUnique(int n){
        boolean res=true;
        String s=""+n;
        loop1: for (int i = 0; i < s.length()-1; i++) {
            char ch=s.charAt(i);
            for (int j = i+1; j < s.length(); j++) {
                char cch=s.charAt(j);
                if(ch==cch){res=false;break loop1;}
            }
        }
        return res;
    }
}
