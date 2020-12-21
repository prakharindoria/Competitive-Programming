import java.util.TreeSet;

public class LargestPrimeFactorV2 {
    public static void main(String[] args) {
        long n=600851475143L;
        int i=2;
        TreeSet<Integer> ts=new TreeSet<Integer>();
        while(n>0 && i<=n)
        {
            if(n%i==0)
            {
                ts.add(i);
                n/=i;
                i=1;
            }
            i++;

        }
        System.out.println(ts);
        int max;
        do{
            max = ts.pollLast();
          }
          while(isPrime(max)==false);

        System.out.println(max);



    }

    public static boolean isPrime(long n){
        boolean isP=true;
        for(int i=2;i*i<n;i++){
            if(n%i==0){isP=false;break;}
        }
        if(isP)return true;
        else return false;
    }

}
