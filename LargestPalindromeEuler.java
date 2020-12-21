/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

public class LargestPalindrome {
    public static void main(String[] args) {
        int maxPalindrome =-1;
        for (int i = 999; i > 0 ; i--)
        {
            for (int j = 999; j > 0; j--)
            {
                int temp=i*j;
                if(isPalindrome(temp))
                {
                    if(temp>maxPalindrome)
                    maxPalindrome = temp;
                }
            }
        }
        System.out.println(maxPalindrome);
    }

    public static boolean isPalindrome(int n){
        boolean flag=true;
        int cn=n;
        int nod=0;
        while(cn>0)
        {
            int ld=cn%10;
            nod++;
            cn/=10;
        }
        String s=String.valueOf(n);
        for (int i = 0; i <= nod/2; i++)
        {
            if(s.charAt(i)!=s.charAt(nod-1-i))
            {
                flag=false;
            }
            if(flag==false)break;
        }
        return flag;
    }

}
