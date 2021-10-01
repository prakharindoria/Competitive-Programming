public class EvenFibonacci {
    public static void main(String[] args) {
        int a=-1;
        int b=1;
        int c=0;
        int sum=0;
//Fibonacci by Swap Variables
        for(int i=0;c<4000000;i++){
            a=b;
            b=c;
            c=a+b;
            if(c%2==0)sum+=c;
        }
        System.out.println(sum);
    }
}
