//To remove duplicate characters from a String
import java.util.HashSet;
public class HelloWorld{

     public static void main(String []args){
            String s="Hello World";
            char []ch=s.toCharArray();
            HashSet<Character> hs=new HashSet<Character>();
            for(Character c:ch){
                hs.add(c);
            }
            for(Character c:hs)
            System.out.print(c+"");
        
     }
}
