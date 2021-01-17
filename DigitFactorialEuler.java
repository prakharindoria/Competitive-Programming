/*
145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.

Find the sum of all numbers which are equal to the sum of the factorial of their digits.

Note: As 1! = 1 and 2! = 2 are not sums they are not included.

*/

public class DigitFactorial {
    public static void main(String[] args) {
        int count=0;
        int sum=0;
        for (int i = 3; i < 100000; i++)
        {
            int ci=i;
            int nod=0;
            int factSum=0;

            while(ci>0)
            {
                int ld=ci%10;
                factSum+=fact(ld);
                ci/=10;
            }

            if(factSum==i) sum+=i;
        }
        System.out.println(sum);
    }


    public static int fact(int n){
        int res=1;
        for (int i = 1; i <= n; i++)
        {
            res=res*i;
        }
        return res;
    }
}
