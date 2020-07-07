import java.util.Scanner;
class Floyd
{
    public static void main(String args[])
    {
       int rows=6, number = 1, i, j; //rows can be taken from user too.
       for ( i = 1 ; i <= rows ; i++ )
       {
           for ( j = 1 ; j <= i ; j++ )
           {
           System.out.print(number+" ");
           number++;
           }
           System.out.println();
       }
   }
}

   
