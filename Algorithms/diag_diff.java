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
public class diag_diff {
    
    public static void main(String[] args) {
        
        int i,j,d1=0,d2=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("hello");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        
        for(i=0;i<n;i++)
        {
           d1=+arr[i][i];
        }
        int l=n-1;
        for(i=l;i>=0;i--)
        {
           d2=+arr[i][i];
        }
        if(d1>d2)
        {
            System.out.print(d1-d2);
        }
        else System.out.print(d2-d1);
    }
}
