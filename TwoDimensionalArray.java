/*
https://www.hackerrank.com/challenges/30-2d-arrays/problem?isFullScreen=true
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] a = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                a[i][j] = arrItem;
            }
        }
        int al[]=new int[16];
        int s=0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
            al[s]=a[i][j]+a[i][j+1]+a[i][j+2]+
                        a[i+1][j+1]+
                a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];  
                s++; 
            }
              }
        Arrays.sort(al);
        System.out.println(al[15]);

        scanner.close();
    }
}

