/* Problem Statement:-
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

*/
public class TwoSum {
    
    public static int[] twoSum(int[] nums, int target)
    {
        int arr[]=new int[2];
        
        for(int i=0;i<nums.length;i++)
        {
            for (int j = i+1; j < nums.length; j++)
            {
                int sum=nums[i]+nums[j];
                    if(sum==target)
                    {
                        arr[0]=i;
                        arr[1]=j;
                    }
            }
            
        
        }
        return arr;
    }
    
    
    public static void main(String[] args) {
        int arr[]=new int[2];
        int nums[]={2,7,11,15};
        int target=22;
        arr=twoSum(nums,target);
        for(int e:arr){
            System.out.println(e);}
    }
    
}


    

