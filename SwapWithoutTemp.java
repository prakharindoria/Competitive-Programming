/*
Swap two numbers 
Swap given two numbers and print them. (Try to do it without a temporary variable.)

Input:
First line contains an integer, the number of test cases 'T'. Each test case should contain two positive numbers a and b.


Output:
Print the 2 numbers after swapping.


Constraints: 
1 <= T <= 100
1 <= a <= 106
1 <= b <= 106


Example:
Input:
2
20 30
12 32

Output:
30 20
32 12
*/

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner kb=new Scanner(System.in);
	 int noi=kb.nextInt();
	 for(int i=0;i<noi;i++){
	     int n1=kb.nextInt();
	     int n2=kb.nextInt();
	     n1=n1+n2;
	     n2=n1-n2;
	     n1=n1-n2;
	     System.out.println(n1+" "+n2);  
	 }
	 }
}
