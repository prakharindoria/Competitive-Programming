Problem Statement:

Implement the following function: static float CumulativeDiscount(float[] arr){} 
The function accepts a float array 'arr' comprising 'n' discount percentages applied on marked price of an object.
Order of discounts in 'arr' is same in which discounts are applied on the object.
Implement the function to calculate the cumulative discount percentage and return the same.
Discounted price = Marked Price * (100 - discount%) / 100 Discount% = 100 - (Discounted Price * 100 / Marked Price) 
For eg, if marked price is 6100 and discounts 10%, 20%, 30% are applied in this sequence then, After 10% discount, price = $100 * (100 - 10) / 100 = $90 
After 20% discount, price = $90 (100 - 20) / 100 = $72 After 30% discount, price = $72 (100 - 30) / 100 = $50.4 
For final discounted price, discount% = 100 - (50.4 100 / 100) = 49.60%. Thus, cumulative discount% is 49.60%.
Assumption: • n > 0 • 0 = < Discount% < 100 • Consider marked price to be 5100 
Note: Do not round off your result, it will be automatically rounded off up to 2 decimal places and then displayed. 
Sample Input 
arr: 40.00 20.00 
Sample Output 
52.00 
 
//Code
public class HelloWorld{
     public static void main(String []args){
        System.out.println("Hello World");
        double  arr[]={40.0,20.0};
        double mp=100,disper,dp;
        for(int i=0;i<arr.length;i++)
            {
                dp=mp*(1-(arr[i]/100.0));
                mp=dp;
                
            }
            disper=100-mp;
            System.out.println(disper);
     }
}
