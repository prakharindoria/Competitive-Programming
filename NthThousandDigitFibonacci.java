import java.math.BigInteger;

public class NthThousandDigitFibonacci {
    public static void main(String[] args) {
        BigInteger a=new BigInteger("0");
        BigInteger b=new BigInteger("1");
        BigInteger c=new BigInteger("0");
        int index=0;
        //Count the digits
        while(nod(c).compareTo(new BigInteger("1000"))<0){
            a=b;
            b=c;
            c=a.add(b);
            index++;
        }
        System.out.println(index);
    }
//Calculating Fibonacci of a number

    public static BigInteger nod(BigInteger n){
        BigInteger res=new BigInteger("0");
        while(n.compareTo(new BigInteger("0"))>0){
            BigInteger ld=n.mod(new BigInteger("10"));
            res=res.add(new BigInteger("1"));
            n=n.divide(new BigInteger("10"));

        }
        return res;
    }

}

