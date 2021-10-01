import java.math.BigInteger;

public class PowerfulDigitSum
{
    public static void main(String[] args)
    {
        BigInteger maxSum = new BigInteger("" + 0);
// Itrate over number till powerful digit sum is obtained
        for (int i = 1; i < 100; i++)
        {
            for (int j = 1; j < 100; j++)
            {
            BigInteger bg = new BigInteger("" +j);
            bg = bg.pow(i);
            BigInteger sum = new BigInteger("" + 0);
            while (bg.compareTo(new BigInteger("" + 0)) > 0)
            {
                sum = sum.add(bg.mod(new BigInteger("" + 10)));
                bg = bg.divide(new BigInteger("" + 10));
            }
            if(maxSum.compareTo(sum)<0)
                maxSum=sum;
            }
        }
        System.out.println(maxSum);
    }
}
