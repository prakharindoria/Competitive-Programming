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
//Calculate Numbers of factors

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
