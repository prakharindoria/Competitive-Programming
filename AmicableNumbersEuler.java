/*
Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.


*/

import java.util.HashSet;
import java.util.Set;

public class AmicableNumber {
    public static void main(String[] args) {
        int amisum=0;
        //Itrating till 1000
        for (int n = 1; n < 1000; n++)
        {

            int sumdiv=0;
            //checking all divisors and adding them
            for (int j = 1; j < n; j++)
            {
                if(n%j==0)sumdiv+=j;
            }
            int cn=sumdiv;
            int sumchk=0;
            //checking the amicability of number
            for (int i = 1; i < cn; i++)
            {
                if(cn%i==0)sumchk+=i;
            }

            if(sumdiv==sumchk)
            {
                amisum+=n;

            }
        }
        System.out.println(amisum);
    }
}
