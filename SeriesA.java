import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        //0,0,7,6,14,12,21,18,28,24...
        
        ArrayList<Integer> al=new ArrayList<>();
        int res=0;

        int n=15;
        for(int i=0;i<n;i++){
            if(i%2==0)
                {al.add(7*(i/2));
                res=7*(i/2);
                }
            else 
            {al.add(6*(i/2));
            res=6*(i/2);
            }
        }
        
           System.out.println(al);
        System.out.println(res);
     }
}



/*
 int res=0,n=15;
        for(int i=0;i<n;i++)
            res= i%2==0 ? 7*(i/2) : 6*(i/2);
        System.out.println(res);
*/
