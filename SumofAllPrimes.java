/*
Sum of all Prime numbers between a given range.
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int lower=10;
		int upper=20;
		//11,13,17,19 ==>60
		if(lower<2)lower=2;
		ArrayList<Integer> al=new ArrayList<>();
		boolean isPrime;
		int i;
		for(i=lower;i<=upper;i++){
		    //check i is Prime
		    int j;
		    isPrime=true;
		    for(j=2;j*j<=i;j++){
		        if(i%j==0)
		        {isPrime=false;break;}
		    }
		    if(isPrime==true)
		    al.add(i);
		}
		int sum=0;
		for(int r:al)sum+=r;
		System.out.println(sum);
		
	}
}
