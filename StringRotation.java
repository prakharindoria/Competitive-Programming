import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter First String");
        String s1=kb.next();
        System.out.println("Enter Second String");
        String s2=kb.next();
        System.out.println(isRotation(s1,s2));
    }
    public static boolean isRotation(String s1,String s2){
        boolean res=false;
        if(s1.length()!=s2.length())return res;
        StringBuilder sb=new StringBuilder(s2.toString());
        for (int i = 0; i < s1.length(); i++) {
            char ch=sb.charAt(0);
            sb.replace(0,1,"");
            sb.append(ch);
            System.out.println(sb);
            if(s1.equals(sb.toString())){res=true;break;}
        }
        return res;
    }
}
