//Decimal To Binary
import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        if(n==0)System.out.println(0);
        else{
        ArrayList<Integer> al=new ArrayList<Integer>();
        while(n>0)
        {   
            int m=n%2;
            al.add(m);
            n=n/2;
        }
        for(int j=al.size()-1;j>=0;j--){
            System.out.print(al.get(j));
        }}
     }
}
