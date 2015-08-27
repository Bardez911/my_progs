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
public class cavitymap_hasSplit {

    public static void main(String[] args) {

        int n, i, j, e;
        String s[];

        String is[][] = new String[100][100]; //= new String is[100][100];
        int ia[][] = new int[100][100];
        //int ia2[][]=new int[100][100];
        Scanner sc = new Scanner(System.in);

        n = Integer.parseInt(sc.nextLine());

        String a[] = new String[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextLine();
        }
        for (i = 0; i < n; i++) {
        //   s = a[i].split("");
            for (j = 0; j < n; j++) {
                s = a[i].split("");
               
                e = Integer.parseInt(s[j]);
                ia[i][j] = e;
            }
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                is[i][j] = String.valueOf(ia[i][j]);
            }
        }

        for (i = 1; i < (n - 1); i++) {
            for (j = 1; j < (n - 1); j++) {
                if (ia[i][j] > ia[i][j - 1] && ia[i][j] > ia[i][j + 1]) {
                    if (ia[i][j] > ia[i - 1][j] && ia[i][j] > ia[i + 1][j]) {
                        is[i][j] = "X";
                    }
                }
            }
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(is[i][j]);
            }
            System.out.println();
        }
    }

}
