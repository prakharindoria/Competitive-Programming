//Count Occurance of every Character in String.

import java.util.HashMap;
public class HelloWorld{

     public static void main(String []args){
        String str="Day After Tommorow".toUpperCase();
        //str=str.toLowerCase();
        char arr[]=str.toCharArray();
        HashMap<Character,Integer> hm=new HashMap<>();
        
        
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j])
                count++;
                
            }
                if(arr[i]!=' ')
                hm.put(arr[i],count);
            
        }
        for(Character c:hm.keySet())
        System.out.println(c+" occured "+hm.get(c)+" Times");
        
     }
}
