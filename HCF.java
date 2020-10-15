//HCF of Two Numbers.
public class Main
{
	public static void main(String[] args) {
    int a=868,b=56;
    
    a=Math.min(a,b);
    b=Math.max(a,b);
    int temp=1,i=2;
    while(true){
        temp=a%i;
        if(temp==0){
            if(b%(a/i)==0)break;
        }
        i++;
    }
		System.out.println(a/i);
	}
}
