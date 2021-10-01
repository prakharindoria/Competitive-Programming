public class DigitFifthPower {
    public static void main(String[] args) {
        int count=0;
        int sum=0;
//Digit Power
        for (int i = 3; i < 1000000; i++)
        {
            int ci=i;
            int nod=0;
            int factSum=0;
//Every digit raised to 5th power.
            while(ci>0)
            {
                int ld=ci%10;
                factSum+=Math.pow(ld,5);
                ci/=10;
            }

            if(factSum==i) sum+=i;
        }
        System.out.println(sum);
    }
}
