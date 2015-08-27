package test1;

import java.math.BigInteger;
import java.util.Scanner;

public class Fact_long {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigInteger n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextBigInteger();
		int n2=n.intValue();
		BigInteger q=BigInteger.valueOf(1);
		//System.out.println("q is: "+q);
		//BigInteger a=a.;
		while(n2>0)
		{
			//a=a.multiply(n);
			 q=q.multiply(n);
			 n2--;
			n=BigInteger.valueOf(n2);
			
		//	System.out.println("n is: "+n);
			
		}
		System.out.println(q);
	}
}
