//Write a program to delete all consonents from the string "Hello, have a good day".
public class HelloWorld{

     public static void main(String []args){
        String s="hello have a good day";
        char arr[]=s.toCharArray();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length()-1;i++)
        {  char ch=arr[i];
            switch(ch){
                case 'a':sb.append('a');break;
                case 'e':sb.append('e');break;
                case 'i':sb.append('i');break;
                case 'o':sb.append('o');break;
                case 'u':sb.append('u');break;
                }
            
        }
        String res=sb.toString();
        System.out.println(res);
        
     }
}
