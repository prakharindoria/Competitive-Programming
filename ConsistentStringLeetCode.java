/*
You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.

 

Example 1:

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
Example 2:

Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
Output: 7
Explanation: All strings are consistent.
Example 3:

Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
Output: 4
Explanation: Strings "cc", "acd", "ac", and "d" are consistent.
 

Constraints:

1 <= words.length <= 104
1 <= allowed.length <= 26
1 <= words[i].length <= 10
The characters in allowed are distinct.
words[i] and allowed contain only lowercase English letters.
*/

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int res=0;
        
        for(int i=0;i<words.length;i++){
            String temp=words[i];
            int j;
            loop2:for(j=0;j<temp.length();j++){
                if(allowed.contains(""+temp.charAt(j)))continue;
                else break loop2;
            }
            if(j==temp.length())res++;

           
        }

        return res;
    }
}


//Bad Solution
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int res=0;
        char arr[]=allowed.toCharArray();
        
        for(int i=0;i<words.length;i++)
        {
            
            String temp=words[i];
            
            for(int j=0;j<arr.length;j++)
            {
            temp=temp.replaceAll(String.valueOf(arr[j]),"");
            }
            if(temp.length()==0)res++;

           
        }

        return res;
    }
}

//Even Bad Solution

import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int res=0;
        char arr[]=allowed.toCharArray();
        
        for(int i=0;i<words.length;i++)
        {
            
            StringBuffer temp=
                new StringBuffer(words[i]);
            
            for(int j=0;j<arr.length;j++)
            {
            temp=replaceAll(temp,String.valueOf(arr[j]),"");
            }
            if(temp.length()==0)res++;

           
        }

        return res;
    }
    
    public static StringBuffer replaceAll(StringBuffer sb, String find, String replace){
        return new StringBuffer(Pattern.compile(find).matcher(sb).replaceAll(replace));
    }
    
}
