/*
You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.

 

Example 1:

Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
Example 2:

Input: s = "textbook"
Output: false
Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.
Example 3:

Input: s = "MerryChristmas"
Output: false
Example 4:

Input: s = "AbCdEfGh"
Output: true
*/

class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        String s1=s.substring(0,s.length()/2);
        String s2=s.substring(s.length()/2,s.length());
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        
        int count1=0;
        for(char c:c1){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' )
                count1++;  
        }
        
        int count2=0;
        for(char c:c2){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' )
                count2++;  
        }
        
        return count1==count2?true:false;
        
    }
}
