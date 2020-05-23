//Given an array nums of integers, return how many of them contain an even number of digits.
// 
//
//Example 1:
//
//Input: nums = [12,345,2,6,7896]
//Output: 2
//Explanation: 
//12 contains 2 digits (even number of digits). 
//345 contains 3 digits (odd number of digits). 
//2 contains 1 digit (odd number of digits). 
//6 contains 1 digit (odd number of digits). 
//7896 contains 4 digits (even number of digits). 
//Therefore only 12 and 7896 contain an even number of digits.
//Example 2:
//
//Input: nums = [555,901,482,1771]
//Output: 1 
//Explanation: 
//Only 1771 contains an even number of digits.
// 
public class NumsWithEvenDigits {
    public static void main(String[] args) {
        int arr[]={45,555,789,4789,568};
        int r=findNumbers(arr);
        System.out.println(r);
        
    }
    
   
    public static int findNumbers(int[] nums) {
        int count=0,len,cn;
        for(int i=0;i<nums.length;i++){
            cn=nums[i];
            len=0;
            while(cn>0){
                cn=cn/10;
                len++;
            }
            if(len%2==0)
                count++;
            
        }
        return count;
        
    }
}
