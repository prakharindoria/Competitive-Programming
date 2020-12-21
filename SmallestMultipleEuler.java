/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

public class SmallestMultiple {
    public static void main(String[] args) {
        int number=11;
        int maxRange=2147483647;
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
