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
