public class SmallestMultiple {
    public static void main(String[] args) {
        int number=11;
        int maxRange=2147483647;//Max Integer value in range.

        while(number<maxRange)
        {
            int i;
            for (i = 20; i > 1; i--)
            {
                if(number%i!=0)
                {
                    break;
                }
            }
            if(i==1)break;
            number++;
        }
        System.out.println(number);

    }
}
