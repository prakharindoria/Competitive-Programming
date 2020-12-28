/*
n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
*/
/*
100!=
93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000

*/

import java.math.BigInteger;

public class FactorialSum {
    public static void main(String[] args) {

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
