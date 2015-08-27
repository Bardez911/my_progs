package test1;

import java.math.BigInteger;
import java.util.Scanner;

public class Fibo_adv {

	public static void main(String[] args) {
	
		BigInteger a,b,c = null;
		int n;
		System.out.println("Enter the values:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextBigInteger();
		b=sc.nextBigInteger();
		n=sc.nextInt();
		
		for(int i=0;i<(n-2);i++)
		{
			 c=b.multiply(b).add(a);
			 a=b;
			 b=c;
			// System.out.println("C is: "+c);
		}
		System.out.println(c);
	}

}
