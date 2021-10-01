import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;
//Check Primality
public class LargestPrimeFactor {
    public static boolean isPrime(long n){
        boolean isP=true;
        for(int i=2;i*i<n;i++){
            if(n%i==0){isP=false;break;}
        }
        if(isP)return true;
        else return false;
    }
public static void main(String[] args) {
    long n=600851475143L;
    long  max=-1L;
    boolean flag=false;
    for(long i=(long)n/2;i>=2;i--)
    {
        if(n%i==0)
        {
          if(isPrime(i))
          {
              max=i;
              flag=true;
          }
        }
        if(flag==true)
            break;
    }
    System.out.println(max);



}
}
