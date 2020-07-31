/*
Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

Complete the function in the editor. If  and  are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.

Input Format

The first line contains a string denoting .
The second line contains a string denoting .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.
Output Format

Print "Anagrams" if  and  are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead.

Sample Input 0

anagram
margana
Sample Output 0

Anagrams
Explanation 0

Character	Frequency: anagram	Frequency: margana
A or a	3	3
G or g	1	1
N or n	1	1
M or m	1	1
R or r	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

Sample Input 1

anagramm
marganaa
Sample Output 1

Not Anagrams
Explanation 1

Character	Frequency: anagramm	Frequency: marganaa
A or a	3	4
G or g	1	1
N or n	1	1
M or m	2	1
R or r	1	1
The two strings don't contain the same number of a's and m's, so we print "Not Anagrams".

Sample Input 2

Hello
hello
Sample Output 2

Anagrams
Explanation 2

Character	Frequency: Hello	Frequency: hello
E or e	1	1
H or h	1	1
L or l	2	2
O or o	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

*/
//Optimized Code
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author prakhar patidar
 */
public class StringAnagram {
    public static void main(String[] args) {
        //Anagram
        //Silent Listen

        Scanner kb=new Scanner(System.in);
        System.out.println("Enter First String");
        String s1=kb.next();
        System.out.println("Enter Second String");
        String s2=kb.next();
        if(s1.length()==s2.length()) {

            char [] arr1=new char[s1.length()];
            for(int i=0;i<=(s1.length())-1;i++)
                arr1[i]=s1.charAt(i);

            char [] arr2=new char[s2.length()];
            for(int i=0;i<=(s2.length())-1;i++)
                arr2[i]=s2.charAt(i);
   boolean b=false;
            for (int i = 0; i < s1.length(); i++) {
                char c=arr1[i];

                for (int j = 0; j < s2.length(); j++) {
                    if(s2.charAt(j)==c)
                    {
                    b=true;
                    break;}
                }


            }
            if(b==true)
            System.out.println("Anagram");
            else
            System.out.println("Not Anagram");


            }
            //System.out.println("Strings are Anagram");
        }
    }


//Naive Code

public class Solution {

    static boolean isAnagram(String a, String b) {
        a=a.toUpperCase();b=b.toUpperCase();
        boolean flag=false;
        int len=a.length();
       if(a.length()!=b.length())
       return flag;

       char arr[]=new char[len];
       char brr[]=new char[len];
       for(int i=0;i<len;i++){
           arr[i]=a.charAt(i);
           brr[i]=b.charAt(i);
       }
       char ch='A';int ca=0,cb=0;
       int i;
        for(i=0;i<=25;i++){
            ca=0;cb=0;
            for(int j=0;j<len;j++){
                if(arr[j]==ch)
                ca++;
                if(brr[j]==ch)
                cb++;
                
            }
            if(ca==cb)
            {ch++;continue;}
            else
            break;
            
                   
        }
        if(i==26){
            flag=true;
        }

        return flag;



    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}



