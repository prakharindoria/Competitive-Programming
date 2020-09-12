/*
Permutations of a given string 
Given a string S. The task is to print all permutations of a given string.

Input:
The first line of input contains an integer T, denoting the number of test cases. Each test case contains a single string S in capital letter.

Output:
For each test case, print all permutations of a given string S with single space and all permutations should be in lexicographically increasing order.

Constraints:
1 ≤ T ≤ 10
1 ≤ size of string ≤ 5

Example:
Input:
2
ABC
ABSG

Output:
ABC ACB BAC BCA CAB CBA 
ABGS ABSG AGBS AGSB ASBG ASGB BAGS BASG BGAS BGSA BSAG BSGA GABS GASB GBAS GBSA GSAB GSBA SABG SAGB SBAG SBGA SGAB SGBA

Explanation:
Testcase 1: Given string ABC has permutations in 6 forms as ABC, ACB, BAC, BCA, CAB and CBA .
*/

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 
	 {
	
	 Scanner kb=new Scanner(System.in);
	 int noe=kb.nextInt();
	 ArrayList<String> al=new ArrayList<>();
	 while(noe-->=0){
	 al.add(kb.nextLine());
	 }
	 for(int i=0;i<al.size();i++)
	 {
	     GFG gfg =new GFG();
	     int len=al.get(i).length();
	     gfg.permute(al.get(i),0,len-1);
	     
	     
	     
	 }
	 
}
     public void  permute(String s,int x,int y){
         if(x==y)System.out.print(s+" ");
         else{
             for(int i=x;i<=y;i++){
                 s=swap(s,x,i);
                 permute(s,x+1,y);
                 s=swap(s,x,i);
             }
             
             
         }
         
         
     }
     
     public String swap(String s,int x,int y)
     {
         char temp;
         char []arr=s.toCharArray();
         temp=arr[x];
         arr[x]=arr[y];
         arr[y]=temp;
         return String.valueOf(arr);
         
         
     }
     
     
     
 }
