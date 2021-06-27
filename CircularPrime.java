public class CircularPrime {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            //Study Recursion & Dynamic Programming.
            
        }
    }
//Check for Primality
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
