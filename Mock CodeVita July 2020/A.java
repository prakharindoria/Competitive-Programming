/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author prakhar patidar
 * Digit Pairs
Problem Description
Given N three-digit numbers, your task is to find bit score of all N numbers and then print the number of pairs possible based on these calculated bit score.

1. Rule for calculating bit score from three digit number:

From the 3-digit number,

· extract largest digit and multiply by 11 then

· extract smallest digit multiply by 7 then

· add both the result for getting bit pairs.

Note: - Bit score should be of 2-digits, if above results in a 3-digit bit score, simply ignore most significant digit.

Consider following examples:

Say, number is 286

Largest digit is 8 and smallest digit is 2

So, 8*11+2*7 =102 so ignore most significant bit , So bit score = 02.

Say, Number is 123

Largest digit is 3 and smallest digit is 1

So, 3*11+7*1=40, so bit score is 40.

2. Rules for making pairs from above calculated bit scores

Condition for making pairs are

· Both bit scores should be in either odd position or even position to be eligible to form a pair.

· Pairs can be only made if most significant digit are same and at most two pair can be made for a given significant digit.

Constraints
N<=500

Input Format
First line contains an integer N, denoting the count of numbers.

Second line contains N 3-digit integers delimited by space

Output
One integer value denoting the number of bit pairs.

Timeout
1

Explanation
Example 1

Input

8

234 567 321 345 123 110 767 111

Output

3

Explanation

After getting the most and least significant digits of the numbers and applying the formula given in Rule 1 we get the bit scores of the numbers as:

58 12 40 76 40 11 19 18

No. of pair possible are 3:

40 appears twice at odd-indices 3 and 5 respectively. Hence, this is one pair.

12, 11, 18 are at even-indices. Hence, two pairs are possible from these three-bit scores.

Hence total pairs possible is 3
 
 **/



public class A {
    public static void main(String[] args) {
        int ld,sd,noe;
        Scanner kb=new Scanner(System.in);
        noe=kb.nextInt();
        int arr[]=new int[noe];
        int large[]=new int[noe];
        int small[]=new int[noe];
        int bitscore[]=new int[noe];
        int bs;
        //Input Array
        for(int i=0;i<noe;i++){
        bs=0;
        arr[i]=kb.nextInt();
        large[i]=largestDigit(arr[i]);
        small[i]=smallestDigit(arr[i]);
        bs=large[i]*11+small[i]*7;
        if(bs>99)
        bitscore[i]=lastTwoDigits(bs);
        else
            bitscore[i]=bs;
        }
        
        
        int msb[]=new int[noe];
        for(int i=0;i<noe;i++){
            if(bitscore[i]>=10)
                msb[i]=bitscore[i]/10;
            else
                msb[i]=bitscore[i]; 
        }
        
        int count=0,edc=0,odc=0;
        for(int i=0;i<=9;i++){
            edc=0;odc=0;
            for (int j = 0; j < noe; j=j+2) { //5 1 4 7 4 1 1 1
                if(i==msb[j])
                    edc++;
                }
            
            for (int j = 1; j < noe; j=j+2) { //5 1 4 7 4 1 1 1
                if(i==msb[j])
                    odc++;
                }
            if(i%2==0)
            {
             if(edc>=3)
                count=count+2;
             else if(edc==2)
                count++;
            }
            else
                {
                 if(odc>=3)
                    count=count+2;
                 else if(odc==2)
                     count++;
            }
            
            
            
            }
        System.out.println(count);
        
        
        
//        int even[]=new int[noe];
//        int odd[]=new int[noe];
//        for(int i=0;i<noe;i++){
//            if(i%2==0)
//                even[i]=msb[i];
//            else
//                odd[i]=msb[i]; 
//        }
//        int dc1;
//        for (int i = 0; i < noe; i++) {
//            dc1=0;
//            for (int j = 0; j < even.length; j++) {
//                if(msb[i]==even[j])
//                    dc1++;
//                
//            }
//            
//        }
//        
        
       
        
        
        
        
        
    }
    
public static int largestDigit(int n) {    
    int l = 0;  
    while(n != 0)  
    {   int r = n % 10; 
        l = Math.max(r, l);
        n = n / 10; 
    } 
    return l;
}

public static int smallestDigit(int n) {  
    int s = 9;  
    while(n != 0)  
    {   int r = n % 10; 
        s = Math.min(r, s);
        n = n / 10; 
    } 
    return s;
} 

public static int lastTwoDigits(int x) {   
    String l = "";int r,i=0;  
    while(i<2)  
    {   int y = x % 10; 
        l = y+l;
        x = x / 10; 
        i++;
    } 
    r=Integer.parseInt(l);
    return r;
}



}



