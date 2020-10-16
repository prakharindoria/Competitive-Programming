/*
Program to calculate the number of handshakes.
The user is asked to take a number as integer n and find out the possible number of handshakes.
For example, if there are n number of people in a meeting and find the possible number of handshakes made by the person who entered the room after all were settled.
*/

public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        
        int n=15;
        int res=(n*(n-1))/2;
        System.out.println(res);
        
        
        
     }
     
     
     public static int fact(int n){
         int res=1;
         while(n>0){
             res*=n;
             n--;
         }
         
         
         return res;
     }
}
