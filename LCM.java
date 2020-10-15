/******************************************************************************

         LCM of Two Numbers.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {

	int a=1572,b=64832,i=1,res=1;

	while(true){
	    res=a*i;
	    if(res%b==0)break;
	    i++;
	}
	
		System.out.println(res);
		
	}
}
