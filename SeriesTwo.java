import java.util.*;
public class HelloWorld{

     public static void main(String []args){
         //1,1,2,3,4,9,8,27
         
         ArrayList<Integer> al=new ArrayList<>();
         
        int res=0,n=38;
        al.add(1);
        al.add(1);
        
        for(int i=2;i<n;i++)
        {
            if(i%2==0)
            al.add(2*al.get(i-2));
            
            else
            al.add(3*al.get(i-2));
            
            
        }
        
        
        System.out.println(al);
     }
}
