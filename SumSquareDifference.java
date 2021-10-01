public class SumSquareDifference {
    public static void main(String[] args) {
        int sumSquare=0;
        for (int i = 1; i <= 100; i++) {
            sumSquare+=i*i;
        }

        int squareSum=0;
        for (int i = 1; i <= 100; i++) {
            squareSum+=i;
        }
        squareSum=squareSum*squareSum;
        // Calculate the difference
        int difference=squareSum-sumSquare;
        System.out.println(difference);

    }
}
