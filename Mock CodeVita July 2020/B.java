/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author prakhar patidar
 */
public class B {
    public static void main(String[] args) {
     Scanner kb=new Scanner(System.in);
     int noe=kb.nextInt();
     kb.nextLine();
     String str1=kb.nextLine();
     String str2=kb.nextLine();
     
        Queue<Character> b= new LinkedList<Character>();
        Queue<Character> g= new LinkedList<Character>();
        for (int i = 0; i < noe; i++) {
            b.add(str1.charAt(i)); 
        }
        for (int i = 0; i < noe; i++) {
            g.add(str2.charAt(i)); 
        }
        
        char temp;int count=0;int res=0;int n=0;
        while(b.size()>0){
            if(b.peek()!=g.peek())
                {
                    temp=g.poll();
                    g.add(temp);
                    n++;
                    if(n>noe)
                        break;
                    
                } 
            else if(b.peek()==g.peek())
                {
                b.poll();
                g.poll();
                count++;
                }
                  
               
                
            
           
        }
        if(count==noe)
            res=0;
        else
            res=noe-count;
        System.out.println(res);
        
        
        
    
}}
