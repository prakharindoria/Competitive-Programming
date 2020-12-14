/*
Prompt
Can you write a function that takes two arrays as inputs and returns to us their intersection? We can call the method intersection. 
Let's return the intersection of the two inputs in the form of an array. 
As a reminder, the definition of an intersection of two sets A and B is the set containing all elements of A that also belong to B (or equivalently, 
all elements of B that also belong to A).
Note that all elements in the final result should be unique. Here's one example:

JAVASCRIPT
1
const nums1 = [1, 2, 2, 1];
2
const nums2 = [2, 2];
3
​
4
intersection(nums1, nums2);
5
// [2]
And here's another one:

JAVASCRIPT
1
const nums1 = [4,9,5];
2
const nums2 = [9,4,9,8,4];
3
​
4
intersection(nums1, nums2);
5
// [9, 4]
*/

import java.util.*;
public class Main {
  public static Integer[] arrayIntersection(int[] arr1, int[] arr2) {
      ArrayList<Integer> al1=new ArrayList<>();
    	for(int i:arr1)al1.add(i);

    	ArrayList<Integer> al2=new ArrayList<>();
      for(int i:arr2)al2.add(i);
    	
    	HashSet<Integer> res=new HashSet<>();
      
    	for(int i:al1){
      for(int j:al2){
      if(i==j)res.add(i);
      }
      }
        
      Integer intarr[]=new Integer[res.size()];
        int pos=0;
      for(int k:res)
      {
      intarr[pos]=k;
      pos++;
      }
    
    	
      return intarr;
  }

    // remove or comment if running tests (we run our own main)
//     public static void main(String[] args) {
//       Main.arrayIntersection();
//     }
