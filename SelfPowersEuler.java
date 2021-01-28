/*
The series, 11 + 22 + 33 + ... + 1010 = 10405071317.

Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000.
*/

import java.math.BigInteger;

public class SelfPowers 
{
    public static void main(String[] args) 
    {
        BigInteger bi=new BigInteger(""+1);
        BigInteger sum=new BigInteger(""+0);
        int p=1;
        
        while(p<=1000)
        {
            BigInteger temp=bi.pow(p);
            sum=sum.add(temp);
            p++;
            bi=bi.add(new BigInteger("1"));
        }
        
        System.out.println("Number is"+ sum);
        int count=0;
        StringBuilder sb=new StringBuilder("");
        
        while(count<10)
        {   BigInteger t=sum.mod(new BigInteger("10"));
            sb.append(t);
            count++;
            sum=sum.divide((new BigInteger("10")));
        }
        
        System.out.println(sb.reverse());
    }
}
