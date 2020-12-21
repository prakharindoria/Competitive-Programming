/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
*/


public class NthPrime {
    public static void main(String[] args) {
        int count=0;
        int i=2;
        while(count<10001) {
            if (isPrime(i))
            {
                count++;
            }
            ++i;
        }
        System.out.println(i-1);

    }
    public static boolean isPrime(int n){
        boolean isP=true;
        if(n<=1)return false;

        for(int i=2;i*i<=n;i++){
            if(n%i==0){isP=false;break;}
        }
        if(isP)return true;
        else return false;
    }
}
