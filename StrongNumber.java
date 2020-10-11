import java.util.*;
class StrongNumber {
  public static void main(String[] args) {
    //Strong Number:   1! + 4! + 5! = 145
    int n=145,cn=n,nod=0,sum=0;
    
    while(cn>0){
      sum+=fact(cn%10);
      cn/=10;
    }
    
    if(sum==n)
    System.out.println("Strong Number");
    else
    System.out.println("Not a Strong Number");

  }
  
  public static int fact(int n){
    int res=1;
    for(int i=n;i>=1;i--)
    {res=res*i;} 
    return res;  
  }
 
}
