/*
There are n soldiers standing in a line. Each soldier is assigned a unique rating value.

You have to form a team of 3 soldiers amongst them under the following rules:

Choose 3 soldiers with index (i, j, k) with rating (rating[i], rating[j], rating[k]).
A team is valid if: (rating[i] < rating[j] < rating[k]) or (rating[i] > rating[j] > rating[k]) where (0 <= i < j < k < n).
Return the number of teams you can form given the conditions. (soldiers can be part of multiple teams).

 

Example 1:

Input: rating = [2,5,3,4,1]
Output: 3
Explanation: We can form three teams given the conditions. (2,3,4), (5,4,1), (5,3,1). 
Example 2:

Input: rating = [2,1,3]
Output: 0
Explanation: We can't form any team given the conditions.
Example 3:

Input: rating = [1,2,3,4]
Output: 4
 

Constraints:

n == rating.length
3 <= n <= 1000
1 <= rating[i] <= 105
All the integers in rating are unique.*/
class Solution {
    public int numTeams(int[] arr) {
        int res=0;
        for(int i=0;i<arr.length-2;i++)
        {
            int temp1=arr[i];
            for(int j=i+1;j<arr.length-1;j++)
            {
                int temp2=arr[j];
                if(temp2>temp1)
                {
                    for(int k=j+1;k<arr.length;k++)
                    {
                        int temp3=arr[k];
                        if(temp3>temp2)res++;
                    }
   
                }
  
            }
          }
        
        
        
        
        for(int i=0;i<arr.length-2;i++)
        {
            int temp1=arr[i];
            for(int j=i+1;j<arr.length-1;j++)
            {
                int temp2=arr[j];
                if(temp2<temp1)
                {
                    for(int k=j+1;k<arr.length;k++)
                    {
                        int temp3=arr[k];
                        if(temp3<temp2)res++;
                    }
   
                }
  
            }
          }
        
        
        
        
        
        
        
        
        return res;
    }
}
