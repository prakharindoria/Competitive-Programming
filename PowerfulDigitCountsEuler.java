/*
The 5-digit number, 16807=75, is also a fifth power. Similarly, the 9-digit number, 134217728=89, is a ninth power.

How many n-digit positive integers exist which are also an nth power?
*/
public class PowerfulDigitCounts {
    public static void main(String[] args) {

        int count=0;
        for (double n = 0; n < 300; n++) {
        double minNdigitNum= Math.pow(10,n-1);
        double minNPlusdigitNum=  Math.pow(10,n);
        double temp=0;
        int i=1;
        while(temp<minNPlusdigitNum){
            temp= Math.pow(i,n);
            if(temp>=minNdigitNum && temp<minNPlusdigitNum)
            {count++;System.out.println(temp);}
            i++;
        }
        }
        System.out.println(count);
    }
}
