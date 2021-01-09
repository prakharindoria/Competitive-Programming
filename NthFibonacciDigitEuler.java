/*
The Fibonacci sequence is defined by the recurrence relation:

Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
Hence the first 12 terms will be:

F1 = 1
F2 = 1
F3 = 2
F4 = 3
F5 = 5
F6 = 8
F7 = 13
F8 = 21
F9 = 34
F10 = 55
F11 = 89
F12 = 144
The 12th term, F12, is the first term to contain three digits.

What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
*/

/*
Naive Approach

public class NthThousandDigitFibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=0;

        while(nod(c)<=5){
            a=b;
            b=c;
            c=a+b;
        }
        System.out.println(c);
    }

    public static int nod(int n){
        int res=0;
        while(n>0){
            int ld=n%10;
            res++;
            n/=10;

        }
        return res;
    }

}


*/

//Solution 

import java.math.BigInteger;
public class NthThousandDigitFibonacci 
{
    public static void main(String[] args) 
    {
        BigInteger a=new BigInteger("0");
        BigInteger b=new BigInteger("1");
        BigInteger c=new BigInteger("0");
        int index=0;
        //Itrating till 1000th digit number.
        while(nod(c).compareTo(new BigInteger("1000"))<0)
        {
            a=b;
            b=c;
            c=a.add(b);
            index++;
        }
        System.out.println(index);
    }
    
    
    /*Method to calculate Number of Digits.
    nod:numberOfDigits
    */
    public static BigInteger nod(BigInteger n)
    {
        BigInteger res=new BigInteger("0");
       
        while(n.compareTo(new BigInteger("0"))>0)
        {
            BigInteger ld=n.mod(new BigInteger("10"));
            res=res.add(new BigInteger("1"));
            n=n.divide(new BigInteger("10"));
        }
        return res;
    }

}




