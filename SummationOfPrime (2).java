public class SummationOfPrime {
    public static void main(String[] args) {
        long sum=0;
        for (int i = 2; i <= 2000000; i++) {
            if(isPrime(i))
                sum+=i;
        }
        System.out.println(sum);
    }
// Check Primality
    public static boolean isPrime(int n) {
        boolean isP = true;
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isP = false;
                break;
            }
        }
        return isP;
    }


}
