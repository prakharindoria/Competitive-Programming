/*
Longest palindrome in an array.
Here we find the longest palindrome number from the given array. So here we need to sort the array in ascending order and later check from the last that the given number is palindrome or not.

The reason behind to sort an array is, we want the longest palindrome number so, in the sorted array, we got the largest number from the last element of the array, and check this is a palindrome or not and check till starting element. If there is no palindrome number so return -1 and print that there is no palindrome number.

Example
Input a[] = {1, 232, 54545, 999991};

Output: 54545
*/

public class HelloWorld{

     public static void main(String []args){
        int arr[]={1,21,121,234,5665,9559};
        int max=0;
        for(int i=0;i<arr.length;i++){
            int temp=palin(arr[i]);
            if(temp>max)max=temp;
        }
        System.out.println(max);
     }
     
     public static int palin(int n){
         int res=-1;
         int count=0,cn=n;
         while(cn>0){
             count++;
             cn/=10;
         }
         String s=""+n;
         int i=0;
         for(i=0;i<count/2;i++){
             char last=s.charAt(s.length()-i-1);
             if(last!=s.charAt(i))break;
             
         }
         if(i==count/2)return n;
         else return res;
     }
     
}
