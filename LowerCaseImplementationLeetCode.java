/*
Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.

 

Example 1:

Input: "Hello"
Output: "hello"
Example 2:

Input: "here"
Output: "here"
Example 3:

Input: "LOVELY"
Output: "lovely"*/

class Solution {
    public String toLowerCase(String str) {
        StringBuffer sb=new StringBuffer();
        
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>=65 && ch<=91)
            {
                ch=(char)(ch+32);
                          
            }
           sb.append(ch);
            
        }
    return sb.toString();    
    }
    
}
