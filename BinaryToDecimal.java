/*
Binary to Decimal
*/

public class Main
{
	public static void main(String[] args) {
		int res,nod,cbin,bin=1011;
		cbin=bin;
		while(cbin>0){
		    nod+=1;
		    cbin/=10;
		}
		res=0;
		for(int i=0;i<=nod;i++){
		    int temp=bin%10;
		    res+=(Math.pow(2,i)*temp);
		    bin/=10;
		}
		System.out.println(res);
	}
}
