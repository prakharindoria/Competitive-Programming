import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    //Binary to Octal=Binary to Decimal to Octal
	    
	   //Binary To Decimal
	    int binary=1;
	    int nod=0;
	    int cbinary=binary;
	    while(cbinary>0){
	        nod++;
	        cbinary/=10;
	    }
	    int res=0;int cou=0;
	    while(nod-->0){
	        int temp=binary%10;
	        res+=(Math.pow(2,cou)*temp);
	        cou++;
	    }
	    
	    
	    
	    
	    //Decimal To Octal
		int decimal=res;
		if(decimal==0)System.out.println("0");
		else{
		ArrayList<Integer> al=new ArrayList<>();
		
		while(decimal>0){
		    int temp=decimal%8;
		    al.add(temp);
		    decimal/=8;
		}
		
		int s=al.size();
		for(int i=s-1;i>=0;i--){System.out.print(al.get(i));}
	}	}
}
