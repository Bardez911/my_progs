package test1;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int k = 0; k < n; k++) {
			for (int i = k; i < n-1; i++) 
			{
				System.out.print(" ");
			}
			for (int j = 0; j <= k; j++) {
				System.out.print("#");
			}
System.out.println("");
		}
	}

}
