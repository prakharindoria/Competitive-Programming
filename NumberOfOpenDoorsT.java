/*
Number of Open Doors
Number Of Open Doors 

Consider a long alley with a N number of doors on one side. All the doors are closed initially. You move to and fro in the alley changing the states of the doors as follows: you open a door that is already closed and you close a door that is already opened. You start at one end go on altering the state of the doors till you reach the other end and then you come back and start altering the states of the doors again.
In the first go, you alter the states of doors numbered 1, 2, 3, … , n.
In the second go, you alter the states of doors numbered 2, 4, 6…
In the third go, you alter the states of doors numbered 3, 6, 9 …
You continue this till the Nth go in which you alter the state of the door numbered N.
You have to find the number of open doors at the end of the procedure.

 

Example 1:

Input:
N = 2
Output:
1
Explanation:
Initially all doors are closed.
After 1st go, all doors will be opened.
After 2nd go second door will be closed.
So, Only 1st door will remain Open.
Example 2:

Input:
N = 4
Output:
2
Explanation:
Following the sequence 4 times, we can
see that only 1st and 4th doors will
remain open.
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function noOfOpenDoors() which takes an Integer N as input and returns the answer.

 

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

 

Constraints:
1 <= N <= 1012

*/
// { Driver Code Starts
//Initial Template for Java
//This Solution works only for input in range of intger in java.
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.noOfOpenDoors(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int noOfOpenDoors(Long N) {
        // code here
        int noe=N.intValue();
        int arr[]=new int[noe+1];
        //0=>Closed && 1=>Opened
        for(int i=1;i<=N;i++){
            for(int j=i;j<=N;j=j+i){
               
                arr[j]=1;
            }
        }
        int count=0;
        for(int j:arr){
            if(arr[j]==1)
            count++;
            
        }
        return count;
        
    }
};

/*

Approach for Long input.
A gate will be open in the end if and only if it has an odd number of factors.

This is so because each gate is visited by its factors only. For example 100 will be visited by 1,2,4,5,10,20,25,50,100 in that order.  

Only perfect squares have an odd number of factors.

Hence the answer for N will be the number of perfect squares less than or equal to N.
*/




