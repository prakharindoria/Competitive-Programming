/*
215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 21000?

*/

import java.math.BigInteger;
public class PowerDigitSum {
    public static void main(String[] args) {
        int a = 2;
        int b = 1000;
        BigInteger numa = new BigInteger(String.valueOf(a));
        BigInteger num= numa.pow(b);
        BigInteger sum=new BigInteger(""+0);
        BigInteger limit= new BigInteger(""+0);
        while(num.compareTo(limit)>0){
            BigInteger ld=num.mod(new BigInteger(""+10));
            sum=sum.add(ld);
            num=num.divide(new BigInteger(""+10));;
        }
        System.out.println(sum);
    }
}

