//You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
//
//The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
//
//Example 1:
//
//Input: J = "aA", S = "aAAbbbb"
//Output: 3
//Example 2:
//
//Input: J = "z", S = "ZZ"
//Output: 0
public class JewelsAndStones {
    public static void main(String[] args) {
        int result=numJewelsInStones("aA", "aAAAbbb");
        System.out.println(result);
        
    }
    

    public static int numJewelsInStones(String J, String S) {
        int count=0;
        char[] strArray = S.toCharArray();
        char[] jarr = J.toCharArray();
        
        for(int i=0;i<jarr.length;i++){
            for(int j=0;j<strArray.length;j++){
            if(jarr[i]==strArray[j])
                count++;
                }
            
    }
        return count;
        
    }
}
