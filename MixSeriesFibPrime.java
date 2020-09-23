/*
1, 2, 1, 3, 2, 5, 3, 7, 5, 11, 8, 13, 13, 17...
*/


import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        // Scanner kb=new Scanner(System.in);
        int noe=13;//kb.nextInt();
        List<Integer> alf=new ArrayList<Integer>();
        List<Integer> alp=new ArrayList<Integer>();
        
        //Fibonacci
        int a=-1,b=0,c=1;
        alf.add(1);
        for(int i=0;i<=noe/2;i++){
            a=b;
            b=c;
            c=a+b;
            alf.add(c);
        }
        
        
        //Prime
        int n=2;
        for(int i=0;alp.size()<=noe/2;i++){
            int j;
            for(j=2;j<n;j++){
                if(n%j==0)
                break;
                
            }
            if(j==n)alp.add(n);
            n++;
        }
        //System.out.println(alp);
        
        
        
        for(int i=0;i<noe;i++){
            if(i%2==0)
            {System.out.print(alf.get(0)+" ");alf.remove(0);}
            else
            {System.out.print(alp.get(0)+" ");alp.remove(0);}
            
            
        }
     }
}
