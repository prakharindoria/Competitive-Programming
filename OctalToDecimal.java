/*
Octal to Decimal
*/

public class Main
{
	public static void main(String[] args) {
		int bin=111;//Octal Number
		int nod=0;
		int cbin=bin;
		while(cbin>0){
		    nod=nod+1;
		    cbin=cbin/10;
		}
		
		int res=0;
		
		for(int i=0;i<=nod;i++){
		   int temp=bin%10;
		    res+=(Math.pow(8,i)*temp);
		    bin=bin/10;
		}
		System.out.println(res);
	}
}
