//Interleaving of two given strings with no common characters
public class HelloWorld{

     public static void main(String []args){
        String a="DA".toLowerCase();
        String b="CD".toLowerCase();
        String c="ACBD".toLowerCase();
        char arr[]=a.toCharArray();
        char brr[]=b.toCharArray();
        int counta=0,countb=0;
        for(int i=0;i<arr.length;i++)
        {
            if(c.contains(String.valueOf(arr[i])))counta++;
            
        }
        for(int i=0;i<brr.length;i++)
        {
            if(c.contains(String.valueOf(brr[i])))countb++;
            
        }
        //System.out.println(counta+" "+arr.length+" "+countb+" "+brr.length);
        if(counta==arr.length && countb==brr.length)
        System.out.println("String C is interleaving of String A and String B");
        else
        System.out.println("False");
        
        
         
     }
     
}
