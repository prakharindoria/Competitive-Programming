//Brute Force Solution
public class PythagoreanTriplet {
    public static void main(String[] args) {
        boolean flag=false;
        int product=0;
        long st=System.currentTimeMillis();
        for (int i = 0; i < 500; i++) {
            for (int j = 0; j < 500; j++) {
                for (int k = 0; k < 500; k++) {
                    if(i+j+k==1000) {
                        int lhs = (j * j) + (k * k);
                        int rhs = i * i;
                        if (lhs == rhs)
                        {
                            flag = true;
                            product =i*j*k;
                        }
                    }
                if(flag==true)break;
                }
                if(flag==true)break;
            }
            if(flag==true)break;
        }
        long et=System.currentTimeMillis();
        long time=et-st;
        System.out.println("Time Elapsed (in ms) "+time);
        System.out.println("Product of A,B,C "+product);

    }
}
