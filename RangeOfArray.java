//To Calculate Range of Given Array
import java.io.*;
class GFG {
	public static void main (String[] args) {
		int arr[]={2,4,5,6,72,3,45,23,56,78};
		int len=arr.length;
		int min=10000,max=0;
		for(int i=0;i<len;i++){
		    if(arr[i]<min)
		    min=arr[i];
		    
		    if(arr[i]>max)
		    max=arr[i];
		    
		    
		}
		int range =max-min;
	System.out.println(range);
		
	}
}
