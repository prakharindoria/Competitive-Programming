/*
Bastin once had trouble finding the numbers in a string. The numbers are distributed in a string across various test cases.
There are various numbers in each test case you need to find the number in each test case. Each test case has various numbers in sequence. You need to find only those numbers which do not contain 9. For eg, if the string contains "hello this is alpha 5051 and 9475".You will extract 5051 and not 9475. You need only those numbers which are consecutive and you need to help him find the numbers.  

Note: Use long long for storing the numbers from the string.
Input:
The first line consists of T test cases and next T lines contain a string.
Output:
For each string output the number stored in that string if various numbers are there print the largest one. If a string has no numbers print -1.
Constraints:
1<=T<=100
1<=|S|<=10000

Example:
Input:
1
This is alpha 5057 and 97
Output:
5057

Company Tags
Topic Tags

*/

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	     
	 Scanner kb=new Scanner(System.in);
	 int noe=kb.nextInt();kb.nextLine();
	 while(noe-->0)
	 {String s=kb.nextLine();
	 String sarr[]=s.split(" ");
	 ArrayList<Integer> al=new ArrayList<>();
	 for(int i=0,j=0;i<sarr.length;i++){
	     //if(Character.isDigit(sarr[i].charAt(0)))
	     if(isNumeric(sarr[i]))
	     {
	         String nine="9";
	         if(!sarr[i].contains(nine))
	     {al.add(Integer.parseInt(sarr[i]));
	     j++;}
	     }
	     
	     
	 }
	 for(int q:al){System.out.println(q);}
	 }}
	 
	 
	 
	public static boolean isNumeric(String s) {
    if (s == null) {
        return false;
    }
    try {
        int i =Integer.parseInt(s);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}
	 
}
