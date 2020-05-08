/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/*Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything. 
More precisely... rewrite small numbers from input to output. Stop processing input after reading in the number 42. 
All numbers at input are integers of one or two digits.

Example
Input:
1
2
88
42
99

Output:
1
2
88

Time Limit:	10 secs
Source Limit:	50000 Bytes

*/
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner kb=new Scanner(System.in);
		int a=0;
		while(a!=42)
		{   
		    a=kb.nextInt();
		    if(a!=42)
		    System.out.println(a);
     	}
	}
}
