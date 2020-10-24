Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.

 

Example 1:

Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

class Solution {
    public void reverseString(char[] s) {
        int l=s.length;
        for(int i=l-1;i>=0;i--)
        {
            char temp=s[l-1-i];
            s[l-1-i]=s[i];
            s[i]=temp;
            if(i==l/2)
            break;
         
        }
        System.out.println(s);
    
            
        
        
    }
}
