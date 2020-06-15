import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double cn=0,cp=0,cz=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>0)cp++;
            else if(arr[i]<0)cn++;
            else cz++;
        }
        double rp=0.0,rn=0.0,rz=0.0;
        rp=cp/n;rn=cn/n;rz=cz/n;
        System.out.println(rp);
        System.out.println(rn);
        System.out.println(rz);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
