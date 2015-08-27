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
public class insertionsort1 {

    public static void main(String[] args) {
        int i, j = 0, n, c, k, a[]; //initialized variables.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //number of characters in the array.
        a = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt(); //scanned the int array.
        }
        c = a[n - 1];
        for (i = n-1; i >=0; i--) {
            if (a[i] > c) {
                j = i;
            }
        }
       // System.out.println("j is:"+j);
        int x=n-1;
       // System.out.println("x is:"+x);
        for (i =x; i > j; i--) {
            a[i] = a[i-1];
            for (k = 0; k < n; k++) {
                System.out.print(a[k]+" ");
            }
            System.out.println("");
        }
        a[j]=c;
        for (k = 0; k < n; k++) {
                System.out.print(a[k]+" ");
            }
    }

}


