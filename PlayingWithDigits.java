//Given an integer number n, return the difference between the product of its digits and the sum of its digits.
// 
//
//Example 1:
//
//Input: n = 234
//Output: 15 
//Explanation: 
//Product of digits = 2 * 3 * 4 = 24 
//Sum of digits = 2 + 3 + 4 = 9 
//Result = 24 - 9 = 15
//Example 2:
//
//Input: n = 4421
//Output: 21
//Explanation: 
//Product of digits = 4 * 4 * 2 * 1 = 32 
//Sum of digits = 4 + 4 + 2 + 1 = 11 
//Result = 32 - 11 = 21
// 
//
//Constraints:
//
//1 <= n <= 10^5
public class PlayingWithDigits {
    public static void main(String[] args) {
        int result=subtractProductAndSum(4421);
        System.out.println(result);
    }
   
    public static int subtractProductAndSum(int number) {
        int noOfDigits=0,copyNum=number,product=1,sum=0,lastDigit;
       while(copyNum>0)
       {
           copyNum=copyNum/10;
           noOfDigits++;
       }
        
       for(int i=1;i<=noOfDigits;i++)
       {
           lastDigit=number%10;
           product=product*lastDigit;
           sum=sum+lastDigit; 
           number=number/10;
       }
        return product-sum;  
    }
}
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
// Memory Usage: 36.4 MB, less than 100.00% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
