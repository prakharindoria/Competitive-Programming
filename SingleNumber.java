
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prakhar patidar
 */
/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
*/
public class SingleNumber {
    public static void main(String[] args) {
        int arr[]={2,2,2,5,5,6,6,1};
        int res=singleNumber(arr);
        System.out.println(res);
        
    }
    
    public int singleNumber(int[] nums) {
        int res=0;
        int i,j;
        int element;
        int count=0;
        int lastIndex=nums.length-1;
        Set<int> hash_Set = new HashSet<int>(); 
        for(i=0;i<=lastIndex;i++)
        {   element=nums[i];
             count=0;
             Integer obj=new Integer(element);
             hash_Set.add(obj);
         if(!hash_Set.contains(element)){
         
            for(j=0;j<=lastIndex;j++)
            {
                if(element==nums[j])
                    count=count+1;
                else
                    continue;
            }
         
            if(count==1)
            {
                res=element;
                break;
            }
         }    
            
        }
       return res;
        
        
    }
}
   

