package test1;

import java.util.Scanner;

public class Avbs {

	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		long[] arr=new long[n];
		long s=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextLong();
		}
		for(int i=0;i<n;i++)
		{
			s=s+arr[i];
		}
		System.out.print(s);
			
		
	}
}
