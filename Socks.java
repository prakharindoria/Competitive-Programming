//John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
//
//For example, there are  socks with colors . There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .
//
//Function Description
//
//Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.
//
//sockMerchant has the following parameter(s):
//
//n: the number of socks in the pile
//ar: the colors of each sock
//Input Format
//
//The first line contains an integer , the number of socks represented in .
//The second line contains  space-separated integers describing the colors  of the socks in the pile.
//
//Constraints
//
// where 
//Output Format
//
//Return the total number of matching pairs of socks that John can sell.
//
//Sample Input
//
//9
//10 20 20 10 10 30 50 10 20
//Sample Output
//
//3
//Explanation
//
//sock.png
//
//John can match three pairs of socks.
import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Socks {

    static int sockMerchant(int n, int[] ar) {
       
        List<Integer> al=Arrays.stream(ar).boxed().collect(Collectors.toList());
        //ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(ar));//can't be done as Integer array is required but passed int arr hence boxing
        //for(int i=0;i<ar.length;i++)
        //al.add(ar[i]);
        //al=Arrays.asList(ar);
        //Collections.addAll(al,ar);
        
        TreeSet<Integer> ts=new TreeSet<>();
        ts.addAll(al);
        
        int nt,tnt=0,size=ts.size();
        
        for(int i=1;i<=size;i++)
        {   
            nt=Collections.frequency(al,ts.first());
            ts.remove(ts.first());
            nt=nt/2;
            tnt=tnt+nt;   
        }
        return tnt;
    }

    public static void main(String[] args) throws IOException {
        int n=5;
        int ar[]={99,98,99,98,5};
        int result = sockMerchant(n, ar);       
        System.out.println(result);   
    }
}
