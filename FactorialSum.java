import java.math.BigInteger;

public class FactorialSum {
    public static void main(String[] args) {
//Factorial of large number
        BigInteger bn=new BigInteger(""+factorial(100));
        BigInteger bs=new BigInteger(""+0);
        BigInteger zero=new BigInteger(""+0);

        while(bn.compareTo(zero)>0){
            BigInteger ld=bn.mod(new BigInteger(""+10));
            bs=bs.add(ld);
            bn=bn.divide(new BigInteger(""+10));
        }
        System.out.println(bs);
    }
    public static BigInteger factorial(int n){
        BigInteger res=new BigInteger(""+1);
        for (int i = 1; i <= n; i++) {
            res=res.multiply(new BigInteger(""+i));
        }
        return res;


    }
}
