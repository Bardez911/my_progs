package test1;

import java.util.Scanner;
import java.math.*;
public class Beast { //NEEDS TO BE CONVERTED TO ARRAY 

	long power(int a, int b){
		long pow=1;
		for(int i=0;i<b;i++)
		{
			pow=pow*a;
		}
		return pow;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,i,j;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		//System.out.println("n is: "+n);
		BigInteger [] arr=new BigInteger[n];
		Beast be=new Beast();
		for( i=0;i<n;i++)
		{arr[i]=BigInteger.valueOf(0);
			int h=sc.nextInt();
			if(h<3)
			{
				arr[i]=new BigInteger("-1");
			}
			else if((h%3)==0)
			{
				for(j=0;j<h;j++)
				{
					long x=5*(be.power(10,j));
					arr[i]=arr[i].add(BigInteger.valueOf(x));
				//	System.out.println(arr[i]);
				}
				//System.out.println(arr[i]);
			}
			else if((h%5)==0)
			{
				for(j=0;j<h;j++)
				{
					long x=3*(be.power(10,j));
					arr[i]=arr[i].add(BigInteger.valueOf(x));
				//	System.out.println(arr[i]);
				}
				//System.out.println(arr[i]);
			}
			else {
				int o=3;
				while(o<h)
				{
					if((h-o)%5==0)
					{
						//System.out.println("O is:"+o+"\nH is:"+h);
						for(j=h;j>h-o;j--)
						{
							long x=5*(be.power(10,j-1));
							arr[i]=arr[i].add(BigInteger.valueOf(x));
						//	System.out.println("array is:"+arr[i]);
							
						}
						for(j=h-o-1;j>=0;j--)
						{
							long x=3*(be.power(10,j));
							arr[i]=arr[i].add(BigInteger.valueOf(x));
						//	System.out.println("array is:"+arr[i]);
							
						}
						o=h;
					}
					else {
					o=o+3;}
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}
