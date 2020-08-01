/*
Objective
Today we're learning about running time! Check out the Tutorial tab for learning materials and an instructional video!

Task
A prime is a natural number greater than  that has no positive divisors other than  and itself. Given a number, , determine and print whether it's  or .

Note: If possible, try to come up with a  primality algorithm, or see what sort of optimizations you come up with for an  algorithm. Be sure to check out the Editorial after submitting your code!

Input Format

The first line contains an integer, , the number of test cases.
Each of the  subsequent lines contains an integer, , to be tested for primality.

Constraints

Output Format

For each test case, print whether  is  or  on a new line.

Sample Input

3
12
5
7
Sample Output

Not prime
Prime
Prime
Explanation

Test Case 0: .
 is divisible by numbers other than  and itself (i.e.: , , ), so we print  on a new line.

Test Case 1: .
 is only divisible  and itself, so we print  on a new line.

Test Case 2: .
 is only divisible  and itself, so we print  on a new line.

*/



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int arr[]=new int[n];
        for(int j=0;j<n;j++) arr[j]=kb.nextInt();

        for(int k=0;k<n;k++){
            int rt=(int)Math.sqrt(arr[k]);
            int i;
            if(arr[k]<=1){System.out.println("Not prime");continue;}
        for(i=2;i<=rt;i++){
            if(arr[k]%i==0)
            break;
            

        }
        if(i==rt+1)
        System.out.println("Prime");
        else 
        System.out.println("Not prime");
        }
    }
}



