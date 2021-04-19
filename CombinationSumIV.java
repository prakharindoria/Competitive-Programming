/*
Given an array of distinct integers nums and a target integer target, return the number of possible combinations that add up to target.

The answer is guaranteed to fit in a 32-bit integer.

 

Example 1:

Input: nums = [1,2,3], target = 4
Output: 7
Explanation:
The possible combination ways are:
(1, 1, 1, 1)
(1, 1, 2)
(1, 2, 1)
(1, 3)
(2, 1, 1)
(2, 2)
(3, 1)
Note that different sequences are counted as different combinations.
Example 2:

Input: nums = [9], target = 3
Output: 0
 

Constraints:

1 <= nums.length <= 200
1 <= nums[i] <= 1000
All the elements of nums are unique.
1 <= target <= 1000
 

Follow up: What if negative numbers are allowed in the given array? How does it change the problem? What limitation we need to add to the question to allow negative numbers?

=============================================================================================================================================================================

Idea:
With this problem, we can easily imagine breaking up the solution into smaller pieces that we can use as stepping stones towards the overall answer. For example, if we're searching for a way to get from 0 to our target number (T), and if 0 < x < y < T, then we can see that finding out how many ways we can get from y to T will help us figure out how many ways we can get from x to T, all the way down to 0 to T. This is a classic example of a top-down (memoization) dyanamic programming (DP) solution.

Of course, the reverse is also true, and we could instead choose to use a bottom-up (tabulation) DP solution with the same result.

Top-Down DP Approach: Our DP array (dp) will contain cells (dp[i]) where i will represent the remaining space left before T and dp[i] will represent the number of ways the solution (dp[T]) can be reached from i.

At each value of i as we build out dp we'll iterate through the different nums in our number array (N) and consider the cell that can be reached with each num (dp[i-num]). The value of dp[i] will therefore be the sum of the results of each of those possible moves.

We'll need to seed dp[0] with a value of 1 to represent the value of the completed combination, then once the iteration is complete, we can return dp[T] as our final answer.

Bottom-Up DP Approach: Our DP array (dp) will contain cells (dp[i]) where i will represent the current count as we head towards T and dp[i] will represent the number of ways we can reach i from the starting point (dp[0]). This means that dp[T] will represent our final solution.

At each value of i as we build out dp we'll iterate through the different nums in our number array (N) and update the value of the cell that can be reached with each num (dp[i+num]) by adding the result of the current cell (dp[i]). If the current cell has no value, then we can continue without needing to iterate through N.

We'll need to seed dp[0] with a value of 1 to represent the value of the common starting point, then once the iteration is complete, we can return dp[T] as our final answer.

In both the top-down and bottom-up DP solutions, the time complexity is O(N * T) and the space complexity is O(T).

Java Code:
w/ Top-Down DP:
class Solution {
    public int combinationSum4(int[] N, int T) {
        int[] dp = new int[T+1];
        dp[0] = 1;
        for (int i = 1; i <= T; i++)
            for (int num : N)
                if (num <= i) dp[i] += dp[i-num];
        return dp[T];
    }
}
w/ Bottom-Up DP:
class Solution {
    public int combinationSum4(int[] N, int T) {
        int[] dp = new int[T+1];
        dp[0] = 1;
        for (int i = 0; i < T; i++) {
            if (dp[i] == 0) continue;
            for (int num : N)
                if (num + i <= T) dp[i+num] += dp[i];
        }
        return dp[T];
    }
}

*/


class Solution 
{
    public int combinationSum4(int[] nums, int T) 
    {
       int dp[]=new int[T+1];
       dp[0]=1;
        
       for(int i=1;i<=T;i++)
       {
            for(int num:nums)
            {
                
                if(num<=i)dp[i]+=dp[i-num];
            }
            
        }
        
    return dp[T];
    }
}
