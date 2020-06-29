/*
https://www.hackerrank.com/challenges/30-review-loop/problem?isFullScreen=true
Today we're expanding our knowledge of Strings and combining it with what we've already learned about loops. Check out the Tutorial tab for learning materials and an instructional video!

Task
Given a string, , of length  that is indexed from  to , print its even-indexed and odd-indexed characters as  space-separated strings on a single line (see the Sample below for more detail).

Note:  is considered to be an even index.

Input Format

The first line contains an integer,  (the number of test cases).
Each line  of the  subsequent lines contain a String, .

Constraints

Output Format

For each String  (where ), print 's even-indexed characters, followed by a space, followed by 's odd-indexed characters.

Sample Input

2
Hacker
Rank
Sample Output

Hce akr
Rn ak
Explanation

Test Case 0: 
The even indices are , , and , and the odd indices are , , and . We then print a single line of  space-separated strings; the first string contains the ordered characters from 's even indices (), and the second string contains the ordered characters from 's odd indices ().

Test Case 1: 




The even indices are  and , and the odd indices are  and . We then print a single line of  space-separated strings; the first string contains the ordered characters from 's even indices (), and the second string contains the ordered characters from 's odd indices ().
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        List<String> al=new ArrayList<>();
        int n=kb.nextInt();kb.nextLine();

        for(int i=0;i<n;i++)
        al.add(kb.nextLine());
        
        char [] arr;
        for(int i=0;i<n;i++)
        {
            String even="",odd="";
            arr=al.get(i).toCharArray();
            for(int j=0;j<arr.length;j++)
            {
                if(j%2==0)
                   even=even+arr[j];
                else
                   odd=odd+arr[j];
            }
            System.out.println(even+" "+odd);
                
        }
    }
}



        

// char[] myCharArray = myString.toCharArray();
// for(int i = 0; i < myString.length(); i++){
//     // Print each sequential character on the same line
//     System.out.print(myCharArray[i]); 
// }
// // Print a newline
// System.out.println();

    }
}

