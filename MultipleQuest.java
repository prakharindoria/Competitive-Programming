/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
*/
public class Solution {

  public int solution(int number) {
    int res=0;
    int sum=0;
    for(int i=1;i<number;i++){
      if(i%15==0)sum+=i;
      else if(i%5==0)sum+=i;
      else if(i%3==0)sum+=i;
    }
    res=sum;
    return res;
  }
}
