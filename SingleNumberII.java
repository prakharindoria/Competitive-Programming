/*Given a non-empty array of integers, every element appears three times except for one, which appears exactly once. Find that single one.

Example 1:

Input: [2,2,3,2]
Output: 3
Example 2:

Input: [0,1,0,1,0,1,99]
Output: 99
*/

class Solution {
    public int singleNumber(int[] nums) {
        int count,i;
        for(i=0;i<nums.length;i++){
            count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j])
                    count++;
                
            }
            if(count==1)
                break;
            
        }
        return nums[i];
        
    }
}
