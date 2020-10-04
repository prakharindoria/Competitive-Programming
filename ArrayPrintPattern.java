//Print 2D Array in snake pattern
/*
Input:
10 20 30
60 50 40
70 80 90

Output:
10 20 30
40 50 60
70 80 90
*/

public class ArraySnake{

     public static void main(String []args){
     System.out.println("Enter Dimension Of Array");
     Scanner kb=new Scanner(System.in);
     int dim=kb.nextInt();
     
     int arr[][]=new int[dim][dim];
     
         for(int i=0;i<arr.length;i++)
         for(int j=0;j<arr.length;j++)
         arr[i][j]=kb.nextInt();
                
        
        
        
        for(int i=0;i<arr.length;i++){
            if(i%2==0)
            {for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+ " ");
            }}
            else
                {for(int j=arr.length-1;j>=0;j--){
                System.out.print(arr[i][j]+ " ");
            }}
            
        }
     }
}
