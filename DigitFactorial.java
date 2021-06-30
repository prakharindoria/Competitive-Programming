public class DigitFactorial {
    public static void main(String[] args) {
        int count=0;
        int sum=0;
        for (int i = 3; i < 100000; i++)
        {
            int ci=i;
            int nod=0;
            int factSum=0;
//SUM OF DIGITS
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

//Factorial Function
    public static int fact(int n){
        int res=1;
        for (int i = 1; i <= n; i++)
        {
            res=res*i;
        }
        return res;
    }
}
