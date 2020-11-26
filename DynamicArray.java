/*
Create a list, , of  empty sequences, where each sequence is indexed from  to . The elements within each of the  sequences also use -indexing.
Create an integer, , and initialize it to .
There are  types of queries that can be performed on the list of sequences:
Query: 1 x y
Find the sequence, , at index  in .
Append integer  to sequence .
Query: 2 x y
Find the sequence, , at index  in .
Find the value of element  in  (where  is the size of ) and assign it to .
Print the new value of  on a new line
Note:  is the bitwise XOR operation, which corresponds to the ^ operator in most languages. Learn more about it on Wikipedia.  is the modulo operator.

Function Description

Complete the dynamicArray function below.

dynamicArray has the following parameters:
- int n: the number of empty sequences to initialize in 
- string queries[q]: an array of query strings

Returns

int[]: the results of each type 2 query in the order they are presented
Input Format

The first line contains two space-separated integers,  (the number of sequences) and  (the number of queries), respectively.
Each of the  subsequent lines contains a query in the format defined above, .

Constraints

It is guaranteed that query type  will never query an empty sequence or index.
Sample Input

2 5
1 0 5
1 1 7
1 0 3
2 1 0
2 1 1
Sample Output

7
3
Explanation

Initial Values:


 = [ ]
 = [ ]

Query 0: Append  to sequence .

 = [5]
 = [ ]

Query 1: Append  to sequence .
 = [5]
 = [7]

Query 2: Append  to sequence .

 = [5, 3]
 = [7]

Query 3: Assign the value at index  of sequence  to , print .

 = [5, 3]
 = [7]

7
Query 4: Assign the value at index  of sequence  to , print .

 = [5, 3]
 = [7]

3
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
    // Write your code here
    List<List<Integer>> seqList;
        
            for(int i=0;i<n;i++){
            List<Integer> al=new ArrayList<>();
            al.add(0);
            seqList.add(al);}
        

        
        int lastAnswer=0;
        List<Integer> seq;
        
        
        
        
        for(List<Integer> a:queries)
        {
            int in=a.get(0);
            int x=a.get(1);
            int y=a.get(2);
            int index=((x^lastAnswer)%n);
            //int check=queries.get(index).get(0);
            
            seq=seqList.get(index);
            
            if(in==1)
        {
            
            seq.add(y);
            
            
            
        }
        else if(in==2){
            int temp=y%(seq.size());
            lastAnswer=temp;
            System.out.println(lastAnswer);
            
            
        }
         
         return seq;   
            
            
        }
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> queriesRowItems = new ArrayList<>();

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
                queriesRowItems.add(queriesItem);
            }

            queries.add(queriesRowItems);
        }

        List<Integer> result = Result.dynamicArray(n, queries);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

