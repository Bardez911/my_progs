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
public class flipbits {
    
    public static void main(String[] args) {
        
        int i,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            System.out.println(~arr[i]);
        }
        
    }
    
}
