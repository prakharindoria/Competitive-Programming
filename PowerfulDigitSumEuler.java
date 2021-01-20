/*
A googol (10100) is a massive number: one followed by one-hundred zeros; 100100 is almost unimaginably large: one followed by two-hundred zeros. Despite their size, the sum of the digits in each number is only 1.

Considering natural numbers of the form, ab, where a, b < 100, what is the maximum digital sum?
*/

import java.math.BigInteger;

public class PowerfulDigitSum 
{
    public static void main(String[] args) 
    {
        BigInteger maxSum = new BigInteger("" + 0);
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
