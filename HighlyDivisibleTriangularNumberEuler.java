/*

The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:

 1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
We can see that 28 is the first triangle number to have over five divisors.

What is the value of the first triangle number to have over five hundred divisors?

*/
public class HighleyDivisibleNumber {
    public static void main(String[] args) {
        int i = 2;
        int res = 0;
        int num = 1;
        while (true) {
            int temp = (int) (i * (i + 1)) / 2;
            if (numOfFactors(temp) > 500) {
                res = temp;
                break;
            }
            i++;
        }
        System.out.println(res);
    }


    public static int numOfFactors(int a) {
        int count = 0;
        if (a == 1) {
            return 1;
        }
        for (int i = 1; i < Math.ceil(Math.sqrt(a)); i++) {
            if (a % i == 0) {
                count += 2;
            }
        }
        if ((Math.ceil(Math.sqrt(a))) == Math.floor(Math.sqrt(a))) {
            count++;
        }
        return count;
    }

    //V1 for calculating Number of Factors...
    //    public static int numOfFactors(int num){
//        int res=0;
//        int count=0;
//        for (int i = 1; i <= num/2; i++) {
//            if(num%i==0)count++;
//        }
//        res=count+1;
//        return res;
//    }

}
