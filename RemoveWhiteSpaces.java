//Problem Statement : To Remove all the white spaces from a string.
class Solution{
public static void main(String []args){
Scanner kb=new Scanner(System.in);
String in=kb.nextLine();
char []arr=in.toCharArray();
StringBuilder sb=new StringBuilder();
for(Character ch:arr)
{
if(ch!=' ')
sb.append(ch);
}
}
String res=sb.toStirng();
System.out.println(res);
}
