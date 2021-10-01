import java.math.BigInteger;
public class PowerDigitSum {
    public static void main(String[] args) {
        int a = 2;
        int b = 1000;
        //Compute sum of digits raised to power.
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
