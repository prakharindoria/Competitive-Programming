/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
*/


public class SummationOfPrime {
    public static void main(String[] args) {
        long sum=0;
        for (int i = 2; i <= 2000000; i++) {
            if(isPrime(i))
                sum+=i;
        }
        System.out.println(sum);
    }
    public static boolean isPrime(int n) {
        boolean isP = true;
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isP = false;
                break;
            }
        }
        if (isP) return true;
        else return false;

    }


}
