/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prakhar patidar
 */
public class ReduceToZero {
    public static void main(String[] args) {
        int r=numberOfSteps(14);
        System.out.println(r);
        
    
    
    
}
    public static int numberOfSteps (int n) {
        int r=0;
        while(n>0){
//            if(n%2==0)
//                n=n/2;
//            else
//               n=n-1;
//            r++;
            n=n%2==0?n/2:n-1;
            r++;
            
            
            
            
        }
        return r;
    }

}
