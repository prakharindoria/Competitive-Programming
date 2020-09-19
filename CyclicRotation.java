/*
Cyclically rotate an array by one 
Given an array, cyclically rotate an array by one.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains an integer n denoting the size of the array. Then following line contains 'n' integers forming the array. 

Output:
Output the cyclically rotated array by one.

Constraints:
1<=T<=1000
1<=N<=1000
0<=a[i]<=1000

Example:
Input:
2
5
1 2 3 4 5
8
9 8 7 6 4 2 1 3

Output:
5 1 2 3 4
3 9 8 7 6 4 2 1

*/

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner kb=new Scanner(System.in);
	 int noi=kb.nextInt();
	 while(noi-->0){
	       int noe=kb.nextInt();
	       LinkedList<Integer> ll=new LinkedList<Integer>();
	       for(int i=0;i<noe;i++){
	           ll.add(kb.nextInt());
	       }
	       int last=ll.get(ll.size()-1);
	       ll.remove(ll.size()-1);
	       ll.add(0,last);
	       for(int e:ll)
	       System.out.print(e+" ");
	       System.out.println();
	 }
	 
	     
	     
	 }
}
