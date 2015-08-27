/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Likhyani
 */
public class cutthesticks {

    public void cut(int min) {

    }

    public static void main(String[] args) {
        int i, j, n, c, a[], temp; //initialized variables.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //number of characters in the array.
        a = new int[n];
        int d = 0, p;
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt(); //scanned the int array.
        }

        Arrays.sort(a);

        System.out.println("the sorted aray is:");

        for (i = 0; i < n; i++) {
            System.out.print(" " + a[i]);  // sorted array
        }

        System.out.println("hello");
c=n;
       while(c!=0) {
            System.out.println("loop start d is: "+d);
            if (a[d] > 0) {
                System.out.println("The new array is:");
                for (j = d; j < n; j++) {
                    System.out.print(" " + a[j]);
                }
                p=d;
                int q=a[d];
                System.out.println("p is:"+p);
                for(j=p;j<n;j++){
                    a[j]=a[j]-q;  //cutting the sticks
                    System.out.println("j and a[j]:"+j+" & "+a[j]);
                }
                for(j=p;j<n;j++){
                    if(a[j]==0)
                    {d++;
                    System.out.println("final d is(in):" + d);
                    }
                }
                
               c = n;
//                System.out.println("first c is:" + c);
                c = c - d;
//                System.out.println("first d is:" + d);
               System.out.println(" c is:" + c);
//                p = d;
//                System.out.println("(final c)no. of cut sticks:" + c);
//                for (int k = p; k < n; k++) {
//                    int q = a[p];
//                    a[k] = a[k] - q;
//                }
                  
                  // System.out.println("final d is(in):" + d);
            }
            else {d++;
            System.out.println("final d is(out):" + d);}

        }

    }

}
