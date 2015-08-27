/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.Scanner;

/**
 *
 * @author Likhyani
 */
public class utopian {
    
    public static void main(String[] args) {
        
        int n,i,h;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int ar[]=new int[n];
         for(i=0;i<n;i++){
        
             ar[i]=sc.nextInt();
        }
        
         for(i=0;i<n;i++){
             h=1;
             int x=1,c=ar[i];
             while(x<=c)
             {
                 if(x%2==0){
                 h=h+1;
                 }
                 else{
                     h=h*2;
                 }
                     
                 x++;
             }
                 
             
             System.out.println(h); 
             
         }
         }
             
        
    }
    

