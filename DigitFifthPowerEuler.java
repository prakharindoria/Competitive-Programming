/*
Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

1634 = 14 + 64 + 34 + 44
8208 = 84 + 24 + 04 + 84
9474 = 94 + 44 + 74 + 44
As 1 = 14 is not a sum it is not included.

The sum of these numbers is 1634 + 8208 + 9474 = 19316.

Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
*/

public class DigitFifthPower {
    public static void main(String[] args) {
        int count=0;
        int sum=0;
        for (int i = 3; i < 1000000; i++)
        {
            int ci=i;
            int nod=0;
            int fSsum=0;

            while(ci>0)
            {
                int ld=ci%10;
                fSum+=Math.pow(ld,5);
                ci/=10;
            }

            if(fSum==i) sum+=i;
        }
        System.out.println(sum);
    }
}
