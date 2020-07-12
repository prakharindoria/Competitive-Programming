/* 
Problem
Isyana is given the number of visitors at her local theme park on N consecutive days. The number of visitors on the i-th day is Vi. A day is record breaking if it satisfies both of the following conditions:
The number of visitors on the day is strictly larger than the number of visitors on each of the previous days.
Either it is the last day, or the number of visitors on the day is strictly larger than the number of visitors on the following day.
Note that the very first day could be a record breaking day!

Please help Isyana find out the number of record breaking days.

Input
The first line of the input gives the number of test cases, T. T test cases follow. Each test case begins with a line containing the integer N. The second line contains N integers. The i-th integer is Vi.

Output
For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the number of record breaking days.

Limits
Time limit: 20 seconds per test set.
Memory limit: 1GB.
1 ≤ T ≤ 100.
0 ≤ Vi ≤ 2 × 105.

Test set 1
1 ≤ N ≤ 1000.

Test set 2
1 ≤ N ≤ 2 × 105 for at most 10 test cases.
For the remaining cases, 1 ≤ N ≤ 1000.

Sample

Input
 	
Output
 
4
8
1 2 0 7 2 0 2 0
6
4 8 15 16 23 42
9
3 1 4 1 5 9 2 6 5
6
9 9 9 9 9 9

  
Case #1: 2
Case #2: 1
Case #3: 3
Case #4: 0

  
In Sample Case #1, the bold and underlined numbers in the following represent the record breaking days: 1 2 0 7 2 0 2 0.

In Sample Case #2, only the last day is a record breaking day.

In Sample Case #3, the first, the third, and the sixth days are record breaking days.

In Sample Case #4, there is no record breaking day.


*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) { 
    Scanner kb = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int noOfInputs=kb.nextInt();
    
    
    int elements[][]=new int[noOfInputs][];
        for (int i = 0; i < noOfInputs; i++) {
            elements[i]=new int[kb.nextInt()];
            for (int j = 0; j < elements[i].length; j++) {
                elements[i][j]=kb.nextInt();
                
            } 
        }
        
        
        
        int count,maxx=0;
        for (int i = 0; i < noOfInputs; i++) {
            count=0;maxx=0;
            for (int j = 0; j < elements[i].length; j++) {
               if(elements[i][j]>maxx)
                   maxx=elements[i][j];
               
               if(j==0 && elements[i][j]>0 && elements[i][j]>elements[i][j+1])
                 count++;
                
                else if(j==(elements[i].length-1) && elements[i][j]>elements[i][j-1] && elements[i][j]>=maxx)
                 count++; 
                
                else if(j>0 && j<(elements[i].length-1) &&  elements[i][j]>elements[i][j-1] && elements[i][j]>elements[i][j+1] && elements[i][j]>=maxx)
                    count++;
        }
            System.out.println("Case #"+(i+1)+": "+ count);
        
        
        
        
        }
}


    
    
    
 

}
