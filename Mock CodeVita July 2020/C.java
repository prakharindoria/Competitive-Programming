/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author prakhar patidar
 */
public class C {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int maxl,minl,maxw,minw;
        minl=kb.nextInt();
        maxl=kb.nextInt();
        minw=kb.nextInt();
        maxw=kb.nextInt();
        List<Integer> al=new ArrayList<>();
        for(int i=minl;i<=maxl;i++){
            for (int j = minw; j <=maxw; j++) {
                al.add(i*j);   
            }     
        }
        
        int t,count=0;
        for(int i=minl;i<=maxl;i++){
            for (int j = minw; j <=maxw; j++) {
                t=i*j;
                while(t>=1){
                t=t-Math.min(maxSqPossible(t),Math.min(i*i, j*j));
                if(t==2)count++;//tricky check
                System.out.print(t+" ");
                count++;
                System.out.println(count);
            }     
        }
      
        }
        
    }
   
    public static int maxSqPossible(int x){
        int res=1;
        for (int j = 0; j*j <= x; j++) {
               res=j*j;
            
        } 
    return res;
    }
    
}
