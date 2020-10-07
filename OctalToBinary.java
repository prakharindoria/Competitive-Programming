import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    //Octal to Binary =Octal to Decimal to Binary
	    
	   //Octal To Decimal
	    int octal=400;
	    int nod=0;
	    int coctal=octal;
	    while(coctal>0){
	        nod++;
	        coctal/=10;
	    }
	    int res=0;
	    for(int i=0;i<nod;i++){
	        int tem=octal%10;
	        res+=(Math.pow(8,i)*tem);
	        octal/=10;
	    }
	    
	    
	    
	    //Octal To Binary
		int decimal=res;
		if(decimal==0)System.out.println("0");
		else{
		ArrayList<Integer> al=new ArrayList<>();
		
		while(decimal>0){
		    int temp=decimal%2;
		    al.add(temp);
		    decimal/=2;
		}
		
		int s=al.size();
		for(int i=s-1;i>=0;i--){System.out.print(al.get(i));}
	}	}
}
