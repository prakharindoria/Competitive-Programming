/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

isIsogram "Dermatoglyphics" == true
isIsogram "aba" == false
isIsogram "moOse" == false -- ignore letter case

*/
public class isogram {
    public static boolean  isIsogram(String str) {
      boolean flag=true;
      str=str.toLowerCase();
      if(str.length()==0)return true;
      else{
        for(int i=0;i<str.length();i++){
          for(int j=i+1;j<str.length();j++){
            if(str.charAt(i)==str.charAt(j)){flag=false;break;}
          }
          if(flag==false)break;
        }
      if(flag==true)return true;
      else return false;
        }
      
      
    } 
}
